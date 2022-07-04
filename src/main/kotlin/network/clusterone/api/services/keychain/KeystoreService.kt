package network.clusterone.api.services.keychain

import network.clusterone.api.domain.Account
import network.clusterone.api.domain.KeyStore
import network.clusterone.api.repository.AccountRepository
import network.clusterone.api.repository.KeystoreRepository
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.switchIfEmpty
import java.security.Principal
import java.util.*

@Service
class KeystoreService(
    val accountRepository: AccountRepository,
    val keystoreRepository: KeystoreRepository,
    val logger: Logger,
) {

    fun getAccount(principal: Principal, accId: UUID): Mono<Account> {
        return accountRepository.findByEmailAndId(principal.name, accId)
            .flatMap {
                Mono.justOrEmpty(it)
                    .switchIfEmpty {
                        Mono.error(Exception("Account not found"))
                    }
            }
    }

    fun getAccountKey(principal: Principal, accId: UUID): Mono<KeyStore> {
        return getAccount(principal, accId).flatMap {
            logger.info("get keystore ${it!!.keystore_id} for ${it.user_id}")
            keystoreRepository.findByIdAndUser(it.keystore_id, it.user_id)
        }
    }

    fun getKeystore(id: UUID): Mono<KeyStore> {
        return keystoreRepository.findById(id)
    }
}
