package network.clusterone.api.rest.auth

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.security.JwtSigner
import network.clusterone.api.security.UserResolverService
import network.clusterone.api.services.auth.RegistrationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.time.Instant

data class UserCredentials(val email: String, val password: String)
data class UserActivation(val email: String, val code: String)

@RestController
@RequestMapping("/auth/register")
@Tag(name = "auth")
class RegisterController(
    val registrationService: RegistrationService,
    val userResolver: UserResolverService,
    val jwtSigner: JwtSigner
) {

    @Operation(
        method = "POST",
        tags = ["auth", "register"],
        summary = "Register a new user with email/password.",
        description = "Creates a new user. Returns empty body on success."
    )

    @PostMapping("/email")
    fun register(@RequestBody credentials: UserCredentials): Mono<ResponseEntity<String>> {
        return registrationService.registerByEmail(credentials)
            .flatMap { registrationService.sendVerifyEmail(it) }
            .mapNotNull { jwtSigner.createJwt(it.email!!) }
            .map { ResponseEntity.ok(it) }
    }

    @PostMapping("/email/activate")
    fun activateEmail(@RequestBody activation: UserActivation): Mono<ResponseEntity<String>> {
        return userResolver.findByUsername(activation.email)
            .flatMap { registrationService.getVerifyEmailSession(activation.email, activation.code) }
            .flatMap {
                if (Instant.now() > it!!.validTill) {
                    error(Error("Invalid code"))
                } else {
                    registrationService.activateByEmail(activation.email)
                }
            }
            .map { ResponseEntity.ok(jwtSigner.createJwt(activation.email)) }
    }
}
