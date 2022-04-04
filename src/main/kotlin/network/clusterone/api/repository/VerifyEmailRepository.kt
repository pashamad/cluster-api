package network.clusterone.api.repository

import network.clusterone.api.domain.VerifyEmailSession
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Repository
interface VerifyEmailRepository : R2dbcRepository<VerifyEmailSession, UUID> {

    @Query("SELECT * FROM verify_email_session WHERE id = :id AND code = :code")
    fun findByIdAndCode(id: UUID, code: String): Mono<VerifyEmailSession?>

    @Query("SELECT * FROM verify_email_session WHERE valid_till > :now AND user_id = :userId")
    fun findValidByUser(userId: UUID): Flux<VerifyEmailSession>

    @Query("SELECT * FROM verify_email_session s join users u on s.user_id = u.id WHERE u.email = :email AND s.code = :code ORDER BY created_at DESC LIMIT 1")
    fun findLastByEmailAndCode(email: String, code: String): Mono<VerifyEmailSession?>
}
