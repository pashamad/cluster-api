package network.clusterone.api.rest.auth

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.User
import network.clusterone.api.security.JwtSigner
import network.clusterone.api.security.UserDetailsResolverService
import network.clusterone.api.services.auth.RegistrationService
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

data class UserCredentials(val email: String, val password: String)
data class UserActivation(val email: String, val code: String)

@RestController
@RequestMapping("/auth/register")
@Tag(name = "auth")
class RegisterController(
    val registrationService: RegistrationService,
    val userResolver: UserDetailsResolverService,
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
            // todo: send verification code
            .mapNotNull { jwtSigner.createJwt(it.email!!) }
            .map { ResponseEntity.ok(it) }
    }

    @PostMapping("/email/activate")
    fun activateEmail(@RequestBody activation: UserActivation): Mono<ResponseEntity<String>> {
        return userResolver.findByUsername(activation.email)
            // @todo code verification
            .mapNotNull { if (activation.code == "4444") it else null }
            .flatMap { registrationService.activateByEmail(it!!.username) }
            .mapNotNull { jwtSigner.createJwt(activation.email) } // @todo get from reactive chain
            .map { ResponseEntity.ok(it) }
    }
}
