package network.clusterone.api.services.staking

import kotlinx.coroutines.runBlocking
import network.clusterone.api.domain.StakeDetails
import network.clusterone.api.domain.StakeRecord
import network.clusterone.api.grpc.staking.StakingGrpcClient
import network.clusterone.api.repository.StakingRecordRepository
import network.clusterone.api.security.UserResolverService
import network.clusterone.api.services.keychain.KeystoreService
import network.clusterone.grpc.service.staking.StakeAccount
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.security.Principal
import java.time.Instant
import java.util.*

@Service
class StakingService(
    val stakeGrpcClient: StakingGrpcClient,
    val keystoreService: KeystoreService,
    val stakingRepository: StakingRecordRepository,
    val userResolver: UserResolverService,
    val logger: Logger,
) {

    fun stake(principal: Principal, accId: UUID, voteAddr: String, amount: BigDecimal): Mono<StakeRecord> {
        return createStakeAccount(principal, accId, amount).flatMap { record ->
            delegateStake(principal, record.id!!, voteAddr)
        }
    }

    fun getStakes(principal: Principal, from: Int, limit: Int): Flux<StakeRecord> {
        return userResolver.findUserByUsername(principal.name)
            .flatMapMany {
                stakingRepository.findByUserId(it?.id!!, from, limit)
            }
    }

    fun createStakeAccount(principal: Principal, accId: UUID, amount: BigDecimal): Mono<StakeRecord> {
        return keystoreService.getAccount(principal, accId).flatMap { account ->
            keystoreService.getKeystore(account.keystore_id).flatMap { keystore ->
                val addr = runBlocking { stakeGrpcClient.createStakeAccount(keystore?.privateKey!!, amount) }
                assert(keystore != null)
                val record = StakeRecord(
                    null, amount, addr, null, null, null, accId, account.user_id
                )
                stakingRepository.save(record)
            }
        }
    }

    fun delegateStake(principal: Principal, stakeId: UUID, voteAddr: String): Mono<StakeRecord> {

        return stakingRepository.findById(stakeId).flatMap { stake ->
            keystoreService.getAccountKey(principal, stake.accountId).flatMap { key ->
                assert(key != null)
                val txHash =
                    runBlocking { stakeGrpcClient.delegateStake(key.privateKey!!, stake.stakeAddress, voteAddr) }
                stake.voteAddress = voteAddr
                stake.voteTx = txHash
                stakingRepository.save(stake)
            }
        }
    }

    fun deactivateStake(principal: Principal, stakeId: UUID): Mono<StakeRecord> {
        return stakingRepository.findById(stakeId).flatMap { stake ->
            keystoreService.getAccountKey(principal, stake.accountId).flatMap { key ->
                assert(key != null)
                val txHash =
                    runBlocking { stakeGrpcClient.deactivateStake(key.privateKey!!, stake.stakeAddress) }
                /* TODO: implement migration
                stake.deactivateTx = txHash
                stakingRepository.save(stake) */
                Mono.just(stake)
            }
        }
    }

    fun getStakeDetails(principal: Principal, stakeId: UUID): Mono<StakeDetails> {
        return stakingRepository.findById(stakeId).flatMap { stake ->
            val stakeInfo =
                runBlocking { stakeGrpcClient.getStakeInfo(stake.stakeAddress) }
            Mono.just(stakeInfo).map {
                val acc = it.stakeAccount
                val meta = acc.info.meta
                val stake = acc.info.stake
                StakeDetails(
                    it.amount.toBigDecimal(),
                    it.owner,
                    it.excutable,
                    it.rentEpoch,
                    acc.status.toString(),
                    meta.authorized.stakeAddressBase58,
                    meta.authorized.withdrawAddressBase58,
                    Instant.ofEpochSecond(meta.authorized.lockup.unixTimeStamp),
                    stake.delegation.voterAddressBase58,
                    stake.delegation.stake,
                    stake.delegation.activationEpoch,
                    stake.delegation.deactivationEpoch,
                    stake.delegation.warmupCooldownRate,
                    stake.creditsObserved
                )
            }
        }
    }
}
