package network.clusterone.api.rest.wallet

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.BalanceMark
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.security.Principal

@RestController
@RequestMapping("/wallet")
@Tag(name = "wallet")
class BalanceHistoryController {

    @GetMapping(value = ["/accounts/{id}/balanceHistory"])
    fun getAccountBalanceHistory(principal: Principal, @PathVariable id: String): Flux<BalanceMark> {
        return Flux.empty()
    }

    @GetMapping(value = ["/balanceHistory"])
    fun getWalletBalanceHistory(principal: Principal): Flux<BalanceMark> {
        return Flux.empty()
    }
}
