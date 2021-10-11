package network.clusterone.api.security

import org.springframework.http.HttpHeaders
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication

import org.springframework.security.web.server.authentication.ServerAuthenticationConverter
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@Component
class JwtServerAuthenticationConverter(
    val jwtSigner: JwtSigner
) : ServerAuthenticationConverter {

    override fun convert(exchange: ServerWebExchange): Mono<Authentication> {
        return Mono.justOrEmpty(exchange)
            .mapNotNull {
                exchange.request
                    .headers.getFirst(HttpHeaders.AUTHORIZATION)
            }
            .filter { it!!.startsWith("Bearer ") }
            .map { it!!.substring(7) }
            .map {
                // val jwt = jwtSigner.parseJwt(it)
                val t = UsernamePasswordAuthenticationToken(it, it)
                t
            }
    }

    @Suppress("unused")
    fun fromAuthCookie(exchange: ServerWebExchange?): Mono<Authentication> {
        return Mono.justOrEmpty(exchange)
            .flatMap { Mono.justOrEmpty(it.request.cookies["X-Auth"]) }
            .filter { it.isNotEmpty() }
            .map { it[0].value }
            .map { UsernamePasswordAuthenticationToken(it, it) }
    }
}
