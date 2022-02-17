package network.clusterone.api.rest.wallet

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Account
import network.clusterone.api.domain.Wallet
import network.clusterone.api.services.wallet.AccountFromMnemonicRequest
import network.clusterone.api.services.wallet.WalletService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.security.Principal

@RestController
@RequestMapping("/wallet")
@Tag(name = "wallet")
class WalletController(
     val walletService: WalletService
) {

    @GetMapping(value = [""])
    fun getUserWallet(principal: Principal): Mono<Wallet> {
        return Mono.just(Wallet())
    }

    @PostMapping(value = ["accountFromMnemonic"])
    fun createAccountFromMnemonic(
        principal: Principal,
        @RequestBody request: AccountFromMnemonicRequest
    ): Mono<Account> {
        return walletService.createAccountFromMnemonic(request, principal)
    }
}
