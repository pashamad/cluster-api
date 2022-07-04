package network.clusterone.api.rest.staking

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.StakeDetails
import network.clusterone.api.domain.StakeRecord
import network.clusterone.api.services.staking.StakingService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal
import java.util.*

class StakeRequest(
    val accountId: UUID,
    val voteAddress: String,
    val amount: Float
)

@RestController
@RequestMapping("/staking/stakes")
@Tag(name = "staking")
class StakesController(
    val stakingService: StakingService
) {

    @PostMapping(value = [""])
    fun createStake(
        principal: Principal,
        @RequestBody data: StakeRequest
    ): Mono<StakeRecord> {
        return stakingService.stake(principal, data.accountId, data.voteAddress, data.amount.toBigDecimal())
            .map {
                assert(it != null)
                it
            }
    }

    @GetMapping(value = [""])
    fun getStakes(
        principal: Principal,
        @RequestParam("from", required = false, defaultValue = "0") from: Int,
        @RequestParam("limit", required = false, defaultValue = "20") limit: Int
    ): Flux<StakeRecord> {
        return stakingService.getStakes(principal, from, limit)
    }

    @PostMapping(value = ["/{id}/deactivate"])
    fun deactivateStake(
        principal: Principal,
        @PathVariable id: String
    ): Mono<StakeRecord> {
        return stakingService.deactivateStake(principal, UUID.fromString(id))
    }

    @GetMapping(value = ["/{id}/details"])
    fun getStakeDetails(
        principal: Principal,
        @PathVariable id: String
    ): Mono<StakeDetails> {
        return stakingService.getStakeDetails(principal, UUID.fromString(id))
    }
}
