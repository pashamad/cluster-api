package network.clusterone.api.rest.wallet

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Account
import network.clusterone.api.domain.Wallet
import network.clusterone.api.services.account.AccountInitService
import network.clusterone.api.services.wallet.AccountFromMnemonicRequest
import network.clusterone.api.services.wallet.AccountFromSeedRequest
import network.clusterone.api.services.wallet.WalletService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.security.Principal

@RestController
@RequestMapping("/wallet")
@Tag(name = "wallet", description = "Top-level wallet operations")
class WalletController(
    val walletService: WalletService,
    val accountInit: AccountInitService
) {

    @GetMapping(value = [""])
    fun getUserWallet(principal: Principal): Mono<Wallet> {
        return Mono.just(Wallet())
    }

    @Operation(
        summary = "Creates account from mnemonic",
        description = "Creates and stores a new named account for a specific network, " +
                "based on a mnemonic phrase, and an optional password.",
        method = "POST",
        tags = ["wallet"],
        requestBody = io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "Request body containing name, mnemonic phrase, network, password (optional)",
            content = [Content(
                mediaType = "application/json",
                schema = Schema(implementation = AccountFromMnemonicRequest::class)
            )],
            required = true
        ),
        responses = [
            ApiResponse(
                responseCode = "201",
                description = "Successful operation",
                content = [Content(schema = Schema(implementation = Account::class), mediaType = "application/json")]
            ),
            ApiResponse(
                responseCode = "400",
                description = "Invalid request",
                content = [Content(schema = Schema(hidden = true))]
            ),
            ApiResponse(
                responseCode = "401",
                description = "Unauthenticated",
                content = [Content(schema = Schema(hidden = true))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Internal server error",
                content = [Content(schema = Schema(hidden = true))]
            ),
        ]
    )
    @PostMapping(value = ["accountFromMnemonic"])
    fun createAccountFromMnemonic(
        principal: Principal,
        @RequestBody request: AccountFromMnemonicRequest
    ): Mono<Account> {
        return walletService.createAccountFromMnemonic(request, principal)
            .map { acc ->
                accountInit.activateAccountAsync(principal, acc.id!!);
                acc
            }
    }

    @PostMapping(value = ["accountFromSeed"])
    fun createAccountFromSeed(
        principal: Principal,
        @RequestBody request: AccountFromSeedRequest
    ): Mono<Account> {
        return walletService.createAccountFromSeed(request, principal)
            .map { acc ->
                accountInit.activateAccountAsync(principal, acc.id!!);
                acc
            }
    }
}
