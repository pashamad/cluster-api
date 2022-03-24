package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Account
import network.clusterone.api.domain.Transaction
import network.clusterone.api.services.account.AccountInitService
import network.clusterone.api.services.account.AccountService
import network.clusterone.api.services.account.PatchAccountRequest
import network.clusterone.api.services.account.TransactionsService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal
import java.util.*


@RestController
@RequestMapping("/accounts")
@Tag(name = "accounts")
class AccountsController(
    val accountService: AccountService,
    val accountInit: AccountInitService,
    val transactionsService: TransactionsService
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

    @PostMapping(value = ["/{id}/activate"])
    fun activateAccount(principal: Principal, @PathVariable id: String): Mono<Boolean> {
        return accountInit.activateAccount(principal, UUID.fromString(id))
    }

    @GetMapping(value = ["/{id}/transactions"])
    fun getAccountTransactions(
        principal: Principal,
        @PathVariable id: String,
        @RequestParam("from", required = false, defaultValue = "0") from: Int,
        @RequestParam("limit", required = false, defaultValue = "20") limit: Int
    ): Flux<Transaction> {
        return transactionsService.getTransactionsByAccount(principal, UUID.fromString(id), from, limit)
    }
}
