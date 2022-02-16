package network.clusterone.api.rest.keychain

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.KeyStore
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal

data class KeyData(
    val network: String,
    val name: String?,
    val address: String,
    val key: Any?,
    val mnemonic: String?
)

data class KeyPatch(
    val name: String?
)

@RestController
@RequestMapping("/keychain/keys")
@Tag(name = "keychain")
class KeysController {

    @PostMapping(value = [""])
    fun createKey(
        @RequestBody keyData: KeyData
    ): Mono<KeyStore> {
        return Mono.just(KeyStore())
    }

    @GetMapping(value = [""])
    fun getKeys(principal: Principal): Flux<KeyStore> {
        return Flux.just(KeyStore())
    }

    @PatchMapping(value = ["/{id}"])
    fun patchKey(principal: Principal, @PathVariable id: String, @RequestBody data: KeyPatch): Mono<KeyStore> {
        return Mono.just(KeyStore())
    }

    @DeleteMapping(value = ["/{id}"])
    fun deleteKey(principal: Principal, @PathVariable id: String): Mono<Void> {
        return Mono.empty()
    }
}
