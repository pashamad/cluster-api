package network.clusterone.api.services.auth

import network.clusterone.api.domain.User
import network.clusterone.api.repository.UserRepository
import network.clusterone.api.rest.auth.UserCredentials
import org.slf4j.Logger
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class RegistrationService(
    val logger: Logger,
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

    fun activateByEmail(email: String): Mono<User> {
        return userRepository.findOneByEmail(email)
            .switchIfEmpty(Mono.error { Exception("User not found") })
            .map {
                logger.info("Activating user ${it?.id}")
                it!!.activated = true
                it.authorities = "ROLE_USER"
                it
            }
            .flatMap {
                logger.info("Saving entity ${it.id}")
                userRepository.save(it)
            }
    }
}
