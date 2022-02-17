package network.clusterone.api.rest.auth

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.services.auth.PasswordService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

data class ResetPasswordRequest(val email: String)

data class GetResetSessionRequest(val sessionId: String, val code: String)

data class ConfirmResetByCodeRequest(val sessionId: String, val code: String, val newPassword: String)
data class ConfirmResetByTokenRequest(val sessionToken: String, val newPassword: String)

@RestController
@RequestMapping("/auth/password")
@Tag(name = "auth")
class PasswordController(
    val passwordService: PasswordService
) {

    @PostMapping(value = ["resetPassword"])
    fun resetPassword(@RequestBody request: ResetPasswordRequest): Mono<Void> {
        return passwordService.sendPasswordReset(request.email)
    }

    @PostMapping(value = ["getResetSession"])
    fun getResetSession(@RequestBody request: GetResetSessionRequest): Mono<Void> {
        return passwordService.getResetSession(request.sessionId, request.code)
    }

    @PostMapping(value = ["confirmResetByCode"])
    fun confirmResetByCode(@RequestBody request: ConfirmResetByCodeRequest): Mono<Void> {
        return Mono.empty()
    }

    @PostMapping(value = ["confirmResetByToken"])
    fun confirmResetByToken(@RequestBody request: ConfirmResetByTokenRequest): Mono<Void> {
        return Mono.empty()
    }
}
