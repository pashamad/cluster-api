package network.clusterone.api.rest.account

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.Transaction
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.security.Principal

@RestController
@RequestMapping("/accounts")
@Tag(name = "accounts")
class TransactionsController {

    @GetMapping(value = ["/{id}/transactions"])
    fun getAccountTransactions(principal: Principal, @PathVariable id: String): Flux<Transaction> {
        return Flux.empty()
    }
}
