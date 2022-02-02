package network.clusterone.api.rest.crypto

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.KeyDescriptor
import network.clusterone.api.services.crypto.KeygenService
import network.clusterone.api.services.crypto.Keystore
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

data class MnemonicData(val phrase: String)

@RestController
@RequestMapping("/crypto/keystore")
@Tag(name = "crypto")
class KeystoreController(
    val keygenService: KeygenService
) {

    @PostMapping(value = ["/getSeed"])
    fun getSeed(@RequestBody mnemonic: MnemonicData): Mono<Keystore> {
        return Mono.just(keygenService.fromMnemonic(mnemonic.phrase))
    }

    @PostMapping(value = ["getDescriptor"])
    fun getDescriptor(@RequestBody mnemonic: MnemonicData): Mono<KeyDescriptor> {
        return Mono.empty()
    }
}
