package network.clusterone.api.rest.staking

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.StakingValidator
import network.clusterone.api.services.staking.ValidatorsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/staking/validators")
@Tag(name = "staking")
class ValidatorsController(
    val validatorsService: ValidatorsService
) {

    @GetMapping(value = [])
    fun getValidators(): Flux<StakingValidator> {
        return validatorsService.getValidatorsList()
    }
}
