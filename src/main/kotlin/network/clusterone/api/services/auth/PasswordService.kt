package network.clusterone.api.services.auth

import network.clusterone.api.domain.ResetPassSession
import network.clusterone.api.domain.User
import network.clusterone.api.errors.UserNotFoundException
import network.clusterone.api.repository.ResetPassRepository
import network.clusterone.api.repository.UserRepository
import network.clusterone.api.security.JwtSigner
import network.clusterone.api.security.UserDetailsResolverService
import network.clusterone.api.services.mailer.SendMailTemplateData
import network.clusterone.api.services.mailer.SendgridService
import org.slf4j.Logger
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpClientErrorException
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Instant
import java.util.*

@Service
class PasswordService(
    val logger: Logger,
    val userDetails: UserDetailsResolverService,
    val sendGrid: SendgridService,
    val jwtSigner: JwtSigner,
    val passwordEncoder: PasswordEncoder,
    val resetPassRepository: ResetPassRepository,
    val userRepository: UserRepository
) {

    fun sendPasswordReset(email: String): Mono<ResetPassSession?> {
        val user = getUser(email)
            .switchIfEmpty(Mono.error(UserNotFoundException()))

        // todo: reset session time limit threshold
        val threshold = user.flatMap { getLastValidSession(it) }
            .mapNotNull {
                // 4 minute threshold
                val t = it?.createdDate!!.plusSeconds(240L)
                val msg = "Password reset is on hold for _ seconds"
                if (t.isAfter(Instant.now())) Mono.error(
                    HttpClientErrorException.Conflict.create(
                        msg,
                        HttpStatus.CONFLICT,
                        "Reset on hold",
                        HttpHeaders.EMPTY,
                        ByteArray(0),
                        null
                    )
                ) else Mono.just(it)
            }

        val session = user.flatMap {
            createUserSession(it)
        }

        val send = session.flatMap { _session ->
            sendResetEmail(_session).map { _session }
        }

        return send
    }

    fun getResetSession(sessionId: UUID, code: String): Mono<ResetPassSession?> {
        return resetPassRepository.findByIdAndCode(sessionId, code)
    }

    fun confirmReset(sessionToken: String, newPassword: String): Mono<String> {
        return Mono.empty()
    }

    fun confirmReset(sessionId: UUID, code: String, newPassword: String): Mono<String> {
        return getResetSession(sessionId, code)
            .flatMap {
                // val user = it?.user!!
                val userId = it?.user_id!!
                logger.info("session user: $userId")
                userRepository.findById(userId.toString())
                    .flatMap { _user ->
                        val cr = passwordEncoder.encode(newPassword)
                        updateUserPassword(_user, cr)
                            .map { jwtSigner.createJwt(_user.email!!) }
                    }
            }
    }

    private fun sendResetEmail(session: ResetPassSession): Mono<Int> {
        val email = session.user?.email!!
        val data = SendMailTemplateData(
            email, "Password reset requested", "d-2e699e68a4404e40b7a399b48c4fb21b",
            mapOf("first_name" to email, "code" to session.code)
        )
        return sendGrid.sendMailTemplate(data)
    }

    private fun getUser(email: String): Mono<User> {
        return userDetails.findUserByUsername(email).map {
            it!!
        }
    }

    private fun createUserSession(user: User): Mono<ResetPassSession> {
        val session = ResetPassSession(
            code = "4444",
            token = "NA",
            user_id = user.id!!
        )
        return resetPassRepository.save(session)
            .map { it.user = user; it }
    }

    private fun getLastValidSession(user: User): Mono<ResetPassSession?> {
        return resetPassRepository.findValidByUser(user.id!!).last()
        /*return resetPassRepository.findValidByUser(user.id!!)
            .reduce { t, u ->
                if (t.createdDate.epochSecond > u.createdDate.epochSecond) t else u
            }*/

    }

    private fun getSessions(user: User): Flux<ResetPassSession> {
        return resetPassRepository.findValidByUser(user.id!!)
    }

    private fun updateUserPassword(user: User, password: String): Mono<User> {
        user.password = password
        return userRepository.save(user)
    }
}
