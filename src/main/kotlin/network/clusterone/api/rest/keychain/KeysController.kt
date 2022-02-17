package network.clusterone.api.rest.keychain

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.KeyStore
import network.clusterone.api.services.keychain.KeyData
import network.clusterone.api.services.keychain.UserKeysService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal
import java.util.*


@RestController
@RequestMapping("/keychain/keys")
@Tag(name = "keychain")
class KeysController(
    val keysService: UserKeysService
) {

    @PostMapping(value = [""])
    fun createKey(
        principal: Principal,
        @RequestBody keyData: KeyData
    ): Mono<KeyStore> {
        return keysService.addUserKey(keyData, principal)
    }

    @GetMapping(value = ["{id}"])
    fun getKey(principal: Principal, @PathVariable id: UUID): Mono<KeyStore?> {
        return keysService.getUserKey(id, principal)
    }

    @GetMapping(value = [""])
    fun getKeys(principal: Principal): Flux<KeyStore> {
        return keysService.getUserKeys(principal)
    }

//    @PatchMapping(value = ["/{id}"])
//    fun patchKey(
//        principal: Principal,
//        @PathVariable id: String,
//        @RequestBody data: KeyPatchRequest
//    ): Mono<KeyStore> {
//        return keysService.patchUserKey()
//    }

    @DeleteMapping(value = ["/{id}"])
    fun deleteKey(principal: Principal, @PathVariable id: String): Mono<Void> {
        return Mono.empty()
    }
}
