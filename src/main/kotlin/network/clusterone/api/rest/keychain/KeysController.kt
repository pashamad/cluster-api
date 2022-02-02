package network.clusterone.api.rest.keychain

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.KeyDescriptor
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
    ): Mono<KeyDescriptor> {
        return Mono.just(KeyDescriptor())
    }

    @GetMapping(value = [""])
    fun getKeys(principal: Principal): Flux<KeyDescriptor> {
        return Flux.just(KeyDescriptor())
    }

    @PatchMapping(value = ["/{id}"])
    fun patchKey(principal: Principal, @PathVariable id: String, @RequestBody data: KeyPatch): Mono<KeyDescriptor> {
        return Mono.just(KeyDescriptor())
    }

    @DeleteMapping(value = ["/{id}"])
    fun deleteKey(principal: Principal, @PathVariable id: String): Mono<Void> {
        return Mono.empty()
    }
}
