package network.clusterone.api.services.account

import kotlinx.coroutines.runBlocking
import network.clusterone.api.grpc.listener.ListenerGrpcClient
import network.clusterone.api.repository.AccountRepository
import org.slf4j.Logger
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.security.Principal
import java.util.*

@Service
class AccountInitService(
    val logger: Logger,
    val repo: AccountRepository,
    val listener: ListenerGrpcClient
) {

    @Async
    fun activateAccountAsync(principal: Principal, accId: UUID) {
        val acc = repo.findByEmailAndId(principal.name, accId)
        acc.map {
            logger.info("Activating account ${it!!.id} (addr: ${it.address}")
            runBlocking { listener.addAddress(it.network, it.address, accId) }
        }
            .subscribe()
    }

    fun activateAccount(principal: Principal, accId: UUID): Mono<Boolean> {
        val acc = repo.findByEmailAndId(principal.name, accId)
        return acc.map {
            logger.info("Activating account ${it!!.id} (addr: ${it.address}")
            runBlocking { listener.addAddress(it.network, it.address, accId) }
        }
    }
}
