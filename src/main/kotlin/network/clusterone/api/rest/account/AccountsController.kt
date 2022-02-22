package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Account
import network.clusterone.api.services.account.AccountService
import network.clusterone.api.services.account.PatchAccountRequest
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal
import java.util.*



@RestController
@RequestMapping("/accounts")
@Tag(name = "accounts")
class AccountsController(
    val accountService: AccountService
) {

    @GetMapping(value = [""])
    fun getUserAccounts(principal: Principal): Flux<Account> {
        return accountService.getUserAccounts(principal)
    }

    @PatchMapping(value = ["{id}"])
    fun patchAccount(
        principal: Principal,
        @PathVariable id: UUID,
        @RequestBody request: PatchAccountRequest
    ): Mono<Account> {
        return accountService.patchAccount(principal, id, request)
    }
}
