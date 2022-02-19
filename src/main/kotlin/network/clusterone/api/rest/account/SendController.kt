package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import kotlinx.coroutines.runBlocking
import network.clusterone.api.services.account.SenderService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.security.Principal

data class SendAssetRequest(
    val amount: Number,
    val address: String
)

data class SendAssetResponse(
    val txHash: String
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
    ): Mono<SendAssetResponse> {
        return runBlocking {
            senderService.sendFromTo(principal, id, data.address, BigDecimal(data.amount.toLong()))
                .map { SendAssetResponse(txHash = it) }
//            senderService.sendFromToBlocking(
//                "eth",
//                "7330f8e7-851e-4f0b-a147-657457221358",
//                "0x49A6423Ce595d84CBd26e66d437653c2492098C0",
//                "ddf9bb173349cc830cfb13b2c078c977f27cff4895a46a41b16ac75df85292c4",
//                BigDecimal(2.22)
//            )
        }
    }
}