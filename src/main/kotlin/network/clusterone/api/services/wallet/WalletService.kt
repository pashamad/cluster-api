package network.clusterone.api.services.wallet

import io.swagger.v3.oas.annotations.media.Schema
import kotlinx.coroutines.runBlocking
import network.clusterone.api.domain.Account
import network.clusterone.api.services.account.AccountService
import network.clusterone.api.services.crypto.KeygenService
import network.clusterone.api.services.keychain.KeyData
import network.clusterone.api.services.keychain.UserKeysService
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.security.Principal

data class AccountFromMnemonicRequest(
    @Schema(
        description = "Mnemonic phrase.",
        example = "web survey patrol blush basic glass loop shield again seat vicious enable", required = true
    )
    val phrase: String,
    @Schema(
        description = "Network identifier. Can be one of [eth, sol].",
        example = "eth", required = true
    )
    val network: String,
    @Schema(
        description = "Semantic name of the new account.",
        example = "My ETH 1", required = true
    )
    val name: String,
    @Schema(
        description = "Optional password for seed generation.",
        example = "", required = true, defaultValue = ""
    )
    val password: String?
)

@Service
class WalletService(
    val logger: Logger,
    val keygen: KeygenService,
    val keysService: UserKeysService,
    val accountService: AccountService
) {

    fun createAccountFromMnemonic(request: AccountFromMnemonicRequest, principal: Principal): Mono<Account> {
        val seed = runBlocking { keygen.getSeedFromMnemonic(request.phrase, request.password) }
        val accData = runBlocking { keygen.getAccountData(request.network, seed) }
        val keyData =
            KeyData(request.network, accData.path, accData.address, accData.publicKey, accData.privateKey, request.name)
        val key = keysService.addUserKey(keyData, principal)
        val account = key.flatMap {
            accountService.createAccountFromKey(it, request.name, principal)
        }
        return account
    }
}
