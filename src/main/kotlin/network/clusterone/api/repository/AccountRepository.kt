package network.clusterone.api.repository

import network.clusterone.api.domain.Account
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Repository
interface AccountRepository : R2dbcRepository<Account, UUID> {

    @Query("SELECT * FROM account WHERE user_id = :userId")
    fun findAllByUserId(userId: UUID): Flux<Account>

    @Query("SELECT * FROM account WHERE id = :id AND user_id = :userId")
    fun findByIdAndUser(id: UUID, userId: UUID): Mono<Account?>

    @Query("SELECT a.* FROM users u LEFT JOIN account a ON a.user_id = u.id WHERE u.email = :email AND a.id = :id")
    fun findByEmailAndId(email: String, id: UUID): Mono<Account?>
}
