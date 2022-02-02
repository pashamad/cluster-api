package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.security.Principal

data class SendAssetRequest(
    val amount: Number,
    val address: String
)

@RestController
@RequestMapping("/accounts")
@Tag(name = "accounts")
class SendController {

    @PostMapping(value = ["/{id}/send"])
    fun sendAsset(principal: Principal, @PathVariable id: String, @RequestBody data: SendAssetRequest): Mono<Void> {
        return Mono.empty()
    }
}