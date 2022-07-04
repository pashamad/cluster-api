package network.clusterone.api.grpc.staking

import io.grpc.Metadata
import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.api.grpc.GrpcServiceId
import network.clusterone.grpc.messages.response.StatusCode
import network.clusterone.grpc.messages.types.Order
import network.clusterone.grpc.service.staking.*
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.util.*

@Service
class StakingGrpcClient(
    val grpc: GrpcClientService,
    var logger: Logger
) {

    private val stub by lazy { SolanaStakeServiceGrpcKt.SolanaStakeServiceCoroutineStub(grpc.getChannel(GrpcServiceId.SOL_STAKING)) }

    suspend fun getValidatorsList(from: Int, limit: Int, sort: ValidatorSortField, order: Order): List<Validator> {

        val request = ValidatorsListRequest.newBuilder()
            .setFrom(from)
            .setLimit(limit)
            .setSortField(sort)
            .setOrder(order)
            .build()
        val response = stub.validatorsList(request, Metadata())

        return response.listList
    }

    suspend fun createStakeAccount(key: String, amount: BigDecimal): String {
        logger.info("Sending request to create stake account for amount $amount")
        val request = CreateStakeAccountRequest.newBuilder()
            .setSignerPrivateBase58(key)
            .setAmount(amount.toString())
            .build()
        val response = stub.createStakeAccount(request, Metadata())

        if (response.retStatus.code != StatusCode.OK) {
            throw Exception(response.retStatus.error)
        }

        return response.stakeAddressBase58
    }

    suspend fun delegateStake(key: String, stakeAddr: String, voteAddr: String): String {
        logger.info("Sending request to delegate stake $stakeAddr to $voteAddr")
        val request = DelegateStakeRequest.newBuilder()
            .setSignerPrivateBase58(key)
            .setStakeAddressBase58(stakeAddr)
            .setVoteAddressBase58(voteAddr)
            .build()
        val response = stub.delegateStake(request)

        if (response.retStatus.code != StatusCode.OK) {
            throw Exception(response.retStatus.error)
        }

        return response.txHash
    }

    suspend fun deactivateStake(key: String, stakeAddr: String): String {
        logger.info("Sending request to deactivate stake $stakeAddr")
        val request = DeactivateStakeRequest.newBuilder()
            .setSignerPrivateBase58(key)
            .setStakeAddressBase58(stakeAddr)
            .build()
        val response = stub.deactivateStake(request)

        if (response.retStatus.code != StatusCode.OK) {
            throw Exception(response.retStatus.error)
        }

        return response.txHash
    }

    suspend fun getStakeInfo(stakeAddr: String): StakeAccountInfoResponse {
        logger.info("Sending request to get details for stake $stakeAddr")
        val request = StakeAccountInfoRequest.newBuilder()
            .setStakeAddressBase58(stakeAddr)
            .build()
        val response = stub.stakeAccountInfo(request)

        if (response.retStatus.code != StatusCode.OK) {
            throw Exception(response.retStatus.error)
        }

        return response
    }
}
