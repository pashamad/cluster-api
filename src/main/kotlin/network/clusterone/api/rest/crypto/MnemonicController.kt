package network.clusterone.api.rest.crypto

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.enums.ParameterIn
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import kotlinx.coroutines.runBlocking
import network.clusterone.api.services.crypto.MnemonicPhrase
import network.clusterone.api.services.crypto.MnemonicService
import network.clusterone.grpc.service.account.WordLang
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/crypto/mnemonic")
@Tag(name = "crypto", description = "Cryptographic functions API")
class MnemonicController(
    val mnemonicService: MnemonicService
) {

    @Operation(
        summary = "Generates new mnemonic",
        description = "Generates a new mnemonic with specified length and language",
        method = "POST",
        tags = ["crypto"],
        parameters = [
            Parameter(
                name = "count",
                `in` = ParameterIn.QUERY,
                description = "Mnemonic words count. Must be a multiple of 3 and in range from 12 to 24",
                required = false
            ),
            Parameter(
                name = "lang",
                `in` = ParameterIn.QUERY,
                description = "Mnemonic language. Valid options are: [en, fr, it, es, cz, jp, ko, zh]",
                required = false
            )
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successful operation",
                content = [Content(
                    schema = Schema(implementation = MnemonicPhrase::class),
                    mediaType = "application/json"
                )]
            ),
            ApiResponse(
                responseCode = "400",
                description = "Invalid parameters",
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
    @GetMapping(value = ["/generate"])
    fun generateGrpc(
        @RequestParam("count", required = false, defaultValue = "12") count: Int,
        @RequestParam(name = "lang", required = false, defaultValue = "en") lang: String
    ): Mono<MnemonicPhrase> {
        return mnemonicService.generate(count, lang)
    }
}
