package network.clusterone.api.rest.keychain

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Mnemonic
import network.clusterone.api.services.keychain.UserMnemonicService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal

data class CreateMnemonicRequest(val phrase: String, val name: String?)

@RestController
@RequestMapping("/keychain/mnemonics")
@Tag(name = "keychain")
class MnemonicsController(
    val mnemonicService: UserMnemonicService
) {

    @PostMapping(value = [""])
    fun createMnemonic(
        @RequestBody request: CreateMnemonicRequest,
        principal: Principal
    ): Mono<Mnemonic> {
        return mnemonicService.addUserMnemonic(request.phrase, request.name, principal)
    }

    @GetMapping(value = [""])
    fun getMnemonics(
        principal: Principal
    ): Flux<Mnemonic> {
        return mnemonicService.getUserMnemonics(principal)
    }
}
