package network.clusterone.api.rest.wallet

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Account
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.security.Principal

@RestController
@RequestMapping("/wallet")
@Tag(name = "wallet")
class AccountsController {

    @GetMapping(value = ["/accounts"])
    fun getUserAccounts(principal: Principal): Flux<Account> {
        return Flux.empty()
    }
}
