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
}
