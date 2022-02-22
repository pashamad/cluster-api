package network.clusterone.api.services.account

import network.clusterone.api.domain.Account
import network.clusterone.api.domain.KeyStore
import network.clusterone.api.repository.AccountRepository
import network.clusterone.api.security.UserDetailsResolverService
import org.slf4j.Logger
import org.springframework.stereotype.Service
import org.webjars.NotFoundException
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.security.Principal
import java.util.*

data class PatchAccountRequest(
    val name: String?,
    val isEnabled: Boolean?
)

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

    fun patchAccount(principal: Principal, id: UUID, request: PatchAccountRequest): Mono<Account> {
        val user = userDetails.findUserByUsername(principal.name)
        val account = repo.findById(id)
        return user.zipWith(account)
            .flatMap {
                if (it.t2.user_id != it.t1.id) {
                    error(NotFoundException("Account not found"))
                } else {
                    Mono.just(it.t2)
                }
            }
            .flatMap {
                var changed = false
                if (request.name != null) {
                    changed = it.name != request.name
                    it.name = request.name
                }
                if (request.isEnabled !== null) {
                    changed = changed || (it.isEnabled != request.isEnabled)
                    it.isEnabled = request.isEnabled
                }
                if (changed) repo.save(it) else Mono.just(it)
            }
    }
}
