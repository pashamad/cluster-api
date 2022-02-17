package network.clusterone.api.repository

import network.clusterone.api.domain.KeyStore
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Repository
interface KeystoreRepository : R2dbcRepository<KeyStore, UUID> {

    @Query("SELECT * FROM keystore WHERE user_id = :userId")
    fun findAllByUserId(userId: UUID): Flux<KeyStore>

    @Query("SELECT * FROM keystore WHERE id = :id AND user_id = :userId")
    fun findByIdAndUser(id: UUID, userId: UUID): Mono<KeyStore?>
}
