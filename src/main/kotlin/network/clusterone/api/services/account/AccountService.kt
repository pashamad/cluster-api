package network.clusterone.api.services.account

import network.clusterone.api.domain.Account
import network.clusterone.api.domain.KeyStore
import network.clusterone.api.repository.AccountRepository
import network.clusterone.api.security.UserDetailsResolverService
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.security.Principal

@Service
class AccountService(
    val logger: Logger,
    val repo: AccountRepository,
    val userDetails: UserDetailsResolverService
) {

    fun createAccountFromKey(key: KeyStore, name: String, principal: Principal): Mono<Account> {
        val user = userDetails.findUserByUsername(principal.name)
        return user.flatMap {
            val account = Account(
                null, name, key.network, key.address, BigDecimal.ZERO, it?.id!!, key.id!!
            )
            repo.save(account)
        }
    }

    fun getUserAccounts(principal: Principal): Flux<Account> {
        val user = userDetails.findUserByUsername(principal.name)
        return user.map { it!! }
            .flatMapMany { repo.findAllByUserId(it.id!!) }
    }
}
