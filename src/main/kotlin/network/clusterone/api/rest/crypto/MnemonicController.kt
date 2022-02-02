package network.clusterone.api.rest.crypto

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.services.crypto.Mnemonic
import network.clusterone.api.services.crypto.MnemonicService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/crypto/mnemonic")
@Tag(name = "crypto")
class MnemonicController(
    val mnemonicService: MnemonicService
) {

    @GetMapping(value = ["/generate"])
    fun generate(
        @RequestParam("count", required = false, defaultValue = "12") count: Int,
        @RequestParam(name = "lang", required = false, defaultValue = "en") lang: String
    ): Mono<Mnemonic> {
        return Mono.just(mnemonicService.generate(count, lang))
    }
}
