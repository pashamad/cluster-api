package network.clusterone.api.rest.crypto

import io.swagger.v3.oas.annotations.tags.Tag
import kotlinx.coroutines.runBlocking
import network.clusterone.api.services.crypto.KeygenService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


data class MnemonicData(val phrase: String, val password: String?)

data class SeedDerivationRequest(val seed: String, val net: String, val acc: Int?, val index: Int?)

data class AccountDataResponse(
    val privateKey: String,
    val publicKey: String,
    val address: String,
    val path: String
)

@RestController
@RequestMapping("/crypto/keygen")
@Tag(name = "crypto")
class KeygenController(
    val keygenService: KeygenService
) {

    @PostMapping(value = ["/getSeed"])
    fun getSeed(@RequestBody mnemonic: MnemonicData): Mono<String> {
        return Mono.just(runBlocking {
            keygenService.getSeedFromMnemonic(mnemonic.phrase, mnemonic.password)
        })
    }

    @PostMapping(value = ["/getAccount"])
    fun getAccountData(@RequestBody request: SeedDerivationRequest): Mono<AccountDataResponse> {
        return Mono.just(runBlocking {
            keygenService.getAccountData(request.net, request.seed, request.acc, request.index)
        })
            .map { AccountDataResponse(it.privateKey, it.publicKey, it.address, it.path) }
    }

    @PostMapping(value = ["/getPublicKey"])
    fun getPublicKey(@RequestBody request: SeedDerivationRequest): Mono<String> {
        return Mono.just(runBlocking {
            keygenService.getPublicKey(request.net, request.seed, request.acc, request.index)
        })
    }
}
