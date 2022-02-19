package network.clusterone.api.services.account

import kotlinx.coroutines.runBlocking
import network.clusterone.api.domain.KeyStore
import network.clusterone.api.grpc.writer.WriterGrpcClient
import network.clusterone.api.repository.AccountRepository
import network.clusterone.api.repository.KeystoreRepository
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.security.Principal
import java.util.*

@Service
class SenderService(
    val logger: Logger,
    val accountRepository: AccountRepository,
    val keystoreRepository: KeystoreRepository,
    val writerGrpcClient: WriterGrpcClient
) {

    suspend fun sendFromToBlocking(key: KeyStore, to: String, amount: BigDecimal): String {
        logger.info("send: ${key.network}, ${key.address}, $to, ${key.privateKey}, ${amount.toLong()}")
        return sendFromToBlocking(
            key.network,
            key.address,
            to,
            key.privateKey!!,
            amount
        )
    }

    suspend fun sendFromToBlocking(
        network: String,
        address: String,
        to: String,
        key: String,
        amount: BigDecimal
    ): String {
        logger.info("send: ${network}, ${address}, $to, ${key}, ${amount.toLong()}")
        return writerGrpcClient.sendFromTo(
            network,
            address,
            to,
            key,
            amount
        )
    }

    fun sendFromTo(principal: Principal, id: String, to: String, amount: BigDecimal): Mono<String> {
        // security check
        val account = accountRepository.findByEmailAndId(principal.name, UUID.fromString(id))

        // keystore
        val key = account.flatMap {
            assert(it != null)
            logger.info("get keystore ${it!!.keystore_id} for ${it.user_id}")
            keystoreRepository.findByIdAndUser(it.keystore_id, it.user_id)
        }

        return key.flatMap {
            // runBlocking { writerGrpcClient.sendFromTo(it?.network!!, it.address, to, it.privateKey!!, amount) }
            Mono.just(runBlocking {
                sendFromToBlocking(it!!, to, amount)
            })
//            Mono.just(runBlocking {
//                logger.info("send: $it?.network!!, $it.address, $to, $it.privateKey!!, $amount")
//                sendFromToBlocking(
//                    it?.network!!,
//                    it.address,
//                    to,
//                    it.privateKey!!,
//                    amount
//                )
//            })
        }
    }
}
