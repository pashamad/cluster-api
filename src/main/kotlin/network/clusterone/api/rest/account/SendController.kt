package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Transaction
import network.clusterone.api.services.account.SenderService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.security.Principal

class SendAssetRequest(
    val amount: Float,
    val address: String
)

@RestController
@RequestMapping("/accounts")
@Tag(name = "accounts")
class SendController(
    val senderService: SenderService
) {

    @PostMapping(value = ["/{id}/send"])
    fun sendAsset(
        principal: Principal,
        @PathVariable id: String,
        @RequestBody data: SendAssetRequest
    ): Mono<Transaction> {
        return senderService.sendFromTo(principal, id, data.address, data.amount.toBigDecimal())
    }
}
