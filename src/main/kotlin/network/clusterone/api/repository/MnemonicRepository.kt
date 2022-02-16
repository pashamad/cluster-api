package network.clusterone.api.repository

import network.clusterone.api.domain.Mnemonic
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import java.util.*

@Repository
interface MnemonicRepository : R2dbcRepository<Mnemonic, UUID> {

    @Query("SELECT * FROM mnemonic WHERE user_id = :userId")
    fun findAllByUserId(userId: UUID): Flux<Mnemonic>
}
