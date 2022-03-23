package network.clusterone.api.repository

import network.clusterone.api.domain.Transaction
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Repository
interface TransactionRepository : R2dbcRepository<Transaction, UUID> {

    @Query("SELECT * FROM transaction WHERE account_id = :accId")
    fun findAllByAccountId(accId: UUID): Flux<Transaction>

    @Query("SELECT * FROM transaction WHERE hash IN (:hashes) AND account_id = :accId")
    fun findListByHashes(hashes: List<String>, accId: UUID): Flux<Transaction>

    @Query("SELECT * FROM transaction WHERE hash = :hash")
    fun findByHash(hash: String): Mono<Transaction?>

    @Query(
        "SELECT * FROM users u " +
                "LEFT JOIN account a ON a.user_id = u.id " +
                "LEFT JOIN transaction t ON t.account_id = a.id " +
                "WHERE u.email = :email AND t.hash = :hash"
    )
    fun findByHashAndEmail(hash: String, email: String): Mono<Transaction?>

    @Query(
        "SELECT * FROM users u " +
                "LEFT JOIN account a ON a.user_id = u.id " +
                "LEFT JOIN transaction t ON t.account_id = a.id " +
                "WHERE u.email = :email AND t.id = :id"
    )
    fun findByIdAndEmail(id: UUID, email: String): Mono<Transaction?>
}
