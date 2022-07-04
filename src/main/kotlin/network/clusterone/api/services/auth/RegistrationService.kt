package network.clusterone.api.services.auth

import network.clusterone.api.domain.User
import network.clusterone.api.domain.VerifyEmailSession
import network.clusterone.api.repository.UserRepository
import network.clusterone.api.repository.VerifyEmailRepository
import network.clusterone.api.rest.auth.UserCredentials
import network.clusterone.api.services.mailer.SendMailTemplateData
import network.clusterone.api.services.mailer.SendgridService
import org.slf4j.Logger
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class RegistrationService(
    val logger: Logger,
    val verifyEmailRepository: VerifyEmailRepository,
    val sendGrid: SendgridService,
    val userRepository: UserRepository,
    val encoder: PasswordEncoder
) {

    fun registerByEmail(credentials: UserCredentials): Mono<User> {
        val password = encoder.encode(credentials.password)
        val user = User(
            email = credentials.email,
            password = password,
            authorities = "ROLE_INACTIVE"
        )
        return userRepository.save(user)
    }

    fun sendVerifyEmail(user: User): Mono<User> {

        return createUserSession(user)
            .flatMap {
                sendVerifyEmail(it)
            }
            .map { user }
    }

    fun activateByEmail(email: String): Mono<User> {
        return userRepository.findOneByEmail(email)
            .switchIfEmpty(Mono.error { Exception("User not found") })
            .mapNotNull{ it!! }
            .map {
                logger.info("Activating user ${it.id}")
                it.activated = true
                it.authorities = "ROLE_USER"
                it
            }
            .flatMap {
                logger.info("Saving entity ${it.id}")
                userRepository.save(it)
            }
    }

    fun getVerifyEmailSession(email: String, code: String): Mono<VerifyEmailSession?> {
        return verifyEmailRepository.findLastByEmailAndCode(email, code)
    }

    private fun createUserSession(user: User): Mono<VerifyEmailSession> {
        val charPool: List<Char> = ('0'..'9').toList()
        val code = (1..4)
            .map { _ -> kotlin.random.Random.nextInt(0, charPool.size) }
            .map(charPool::get)
            .joinToString("")
        val session = VerifyEmailSession(
            code = code,
            token = "NA",
            user_id = user.id!!
        )
        return verifyEmailRepository.save(session)
            .map { it.user = user; it }
    }

    private fun sendVerifyEmail(session: VerifyEmailSession): Mono<Int> {
        val email = session.user?.email!!
        val data = SendMailTemplateData(
            email, "Please verify your email at ClusterOne application", "d-33910aa0a9f646639992861926bf8b35",
            mapOf("first_name" to email, "code" to session.code)
        )
        return sendGrid.sendMailTemplate(data)
    }
}
