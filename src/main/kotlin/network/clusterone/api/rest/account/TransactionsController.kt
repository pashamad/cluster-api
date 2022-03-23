package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Transaction
import network.clusterone.api.services.account.TransactionsService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.security.Principal
import java.util.*

@RestController
@RequestMapping("/transactions")
@Tag(name = "transactions")
class TransactionsController(
    val transactionsService: TransactionsService
) {

    @GetMapping(value = ["/{id}"])
    fun getTransactionById(principal: Principal, @PathVariable id: UUID): Mono<Transaction?> {
        return transactionsService.getTransactionById(principal, id)
    }
}
