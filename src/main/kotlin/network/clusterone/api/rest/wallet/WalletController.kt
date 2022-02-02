package network.clusterone.api.rest.wallet

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Wallet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.security.Principal

@RestController
@RequestMapping("/wallet")
@Tag(name = "wallet")
class WalletController {

    @GetMapping(value = [""])
    fun getUserWallet(principal: Principal): Mono<Wallet> {
        return Mono.just(Wallet())
    }
}
