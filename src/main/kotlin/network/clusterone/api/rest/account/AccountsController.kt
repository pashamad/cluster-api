package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Account
import network.clusterone.api.services.account.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.security.Principal

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
}
