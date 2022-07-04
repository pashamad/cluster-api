package network.clusterone.api.services.staking

import kotlinx.coroutines.runBlocking
import network.clusterone.api.domain.StakingValidator
import network.clusterone.api.grpc.staking.StakingGrpcClient
import network.clusterone.grpc.messages.types.Order
import network.clusterone.grpc.service.staking.Validator
import network.clusterone.grpc.service.staking.ValidatorSortField
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class ValidatorsService(
    val staking: StakingGrpcClient
) {

    fun getValidatorsList(): Flux<StakingValidator> {
        val list = runBlocking {
            staking.getValidatorsList(0, 20, ValidatorSortField.ACTIVE_STAKE, Order.DESC)
        }
        return Flux.fromIterable(list)
            .map(this::mapValidator)
    }

    private fun mapValidator(validator: Validator): StakingValidator {
        return StakingValidator(
            validator.network,
            validator.account,
            validator.name,
            validator.wwwUrl,
            validator.details,
            validator.avatarUrl,
            validator.softwareVersion,
            validator.dataCenterKey,
            validator.dataCenterHost,
            validator.voteAccount,
            validator.skippedSlotPercent,
            validator.pingTime,
            validator.url
        )
    }
}
