package network.clusterone.api.repository

import network.clusterone.api.domain.ResetPassSession
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Repository
interface ResetPassRepository : R2dbcRepository<ResetPassSession, UUID> {

    @Query("SELECT * FROM reset_pass_session WHERE id = :id AND code = :code")
    fun findByIdAndCode(id: UUID, code: String): Mono<ResetPassSession?>

    @Query("SELECT * FROM reset_pass_session WHERE valid_till > :now AND user_id = :userId")
    fun findValidByUser(userId: UUID): Flux<ResetPassSession>
}
