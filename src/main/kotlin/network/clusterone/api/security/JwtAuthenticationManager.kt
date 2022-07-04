package network.clusterone.api.security

import org.slf4j.Logger
import org.springframework.security.authentication.ReactiveAuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.oauth2.server.resource.InvalidBearerTokenException
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class JwtAuthenticationManager(
    private val jwtSigner: JwtSigner,
    private val logger: Logger
) : ReactiveAuthenticationManager {

    override fun authenticate(authentication: Authentication): Mono<Authentication> {
        return Mono.just(authentication)
            .map { jwtSigner.validateJwt(it.credentials as String) }
            .onErrorMap {
                logger.debug("Failed to decode JWT token: ${it.message}")
                InvalidBearerTokenException("Invalid token", it)
            }
            .map { jws ->
                UsernamePasswordAuthenticationToken(
                    jws.body.subject,
                    authentication.credentials as String,
                    mutableListOf(SimpleGrantedAuthority("ROLE_USER"))
                )
            }
    }
}
