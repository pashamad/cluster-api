package network.clusterone.api.security

import network.clusterone.api.rest.auth.UserCredentials
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class AuthenticationService(
    val userResolver: UserDetailsResolverService,
    val passwordEncoder: PasswordEncoder
) {

    fun authenticate(credentials: UserCredentials): Mono<UserDetails?> {
        return userResolver.findByUsername(credentials.email)
            .mapNotNull {
                if (passwordEncoder.matches(credentials.password, it?.password)) it else null
            }
    }

    fun isAuthenticated(credentials: UserCredentials): Mono<Boolean> {
        return userResolver.findByUsername(credentials.email)
            .map {
                passwordEncoder.matches(credentials.password, it?.password)
            }
    }
}
