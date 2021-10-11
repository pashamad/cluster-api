package network.clusterone.api.rest.auth

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.User
import network.clusterone.api.repository.UserRepository
import network.clusterone.api.security.AuthenticationService
import network.clusterone.api.security.JwtSigner
import org.slf4j.Logger
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseCookie
import org.springframework.http.ResponseEntity
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.ReactiveSecurityContextHolder
import org.springframework.security.core.context.SecurityContext
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono
import java.security.Principal

@RestController
@RequestMapping("/auth/login")
@Tag(name = "auth")
class LoginController(
    private val jwtSigner: JwtSigner,
    private val authService: AuthenticationService,
    private val userRepository: UserRepository,
    private val logger: Logger
) {

    @PostMapping(path = ["/email"])
    fun loginExp(@RequestBody credentials: UserCredentials): Mono<ResponseEntity<String>> {

        return authService.authenticate(credentials)
            .map {

                val jwt = jwtSigner.createJwt(it!!.username)
                val authCookie = ResponseCookie.fromClientResponse("X-Auth", jwt)
                    .maxAge(60)
                    .httpOnly(true)
                    .path("/")
                    .secure(true) // must be true in production
                    .build()

                return@map ResponseEntity
                    .ok()
                    // TODO: decide if cookie is appropriate
                    .header("Set-Cookie", authCookie.toString())
                    .body(jwt)
            }
            .switchIfEmpty(Mono.just(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()))
    }

    @RequestMapping(value = ["/introspect"], method = [(RequestMethod.GET)])
    fun introspect(principal: Principal): Mono<ResponseEntity<User>> {
        return userRepository.findOneByEmail(principal.name)
            .map { ResponseEntity.ok(it) }
            .switchIfEmpty(Mono.just(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()))
    }

    /**
     * TODO: implement implicit authentication with security context
     */
    fun login(exchange: ServerWebExchange): Mono<Any> {
        return ReactiveSecurityContextHolder.getContext()
            .map(SecurityContext::getAuthentication)
            .map(Authentication::getPrincipal)
            .log()
            .doOnNext {
                // val jwt = jwtSigner.createJwt(it.username)
            }
            .switchIfEmpty(Mono.just("Empty response"))
    }
}
