package network.clusterone.api.security

import org.springframework.security.access.AccessDeniedException
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.server.ServerAuthenticationEntryPoint
import org.springframework.security.web.server.WebFilterExchange
import org.springframework.security.web.server.authentication.ServerAuthenticationFailureHandler
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@Suppress("unused")
class AuthFailureHandler : ServerAuthenticationFailureHandler {

    override fun onAuthenticationFailure(
        webFilterExchange: WebFilterExchange?,
        exception: AuthenticationException?
    ): Mono<Void> {
        return Mono.error(exception!!)
    }
}

@Suppress("unused")
class AuthAccessDeniedHandler : ServerAccessDeniedHandler {
    override fun handle(exchange: ServerWebExchange?, denied: AccessDeniedException?): Mono<Void> {
        return Mono.error(denied!!)
    }
}

@Suppress("unused")
class AuthEntryPoint : ServerAuthenticationEntryPoint {

    override fun commence(exchange: ServerWebExchange?, ex: AuthenticationException?): Mono<Void> {
        return Mono.error(ex!!)
    }
}