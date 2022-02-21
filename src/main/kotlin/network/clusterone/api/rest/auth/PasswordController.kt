package network.clusterone.api.rest.auth

import io.swagger.v3.oas.annotations.tags.Tag
import network.clusterone.api.domain.ResetPassSession
import network.clusterone.api.services.auth.PasswordService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.*

data class ResetPasswordRequest(val email: String)

data class GetResetSessionRequest(val sessionId: UUID, val code: String)

data class ConfirmResetByCodeRequest(val sessionId: UUID, val code: String, val newPassword: String)
data class ConfirmResetByTokenRequest(val sessionToken: String, val newPassword: String)

@RestController
@RequestMapping("/auth/password")
@Tag(name = "auth")
class PasswordController(
    val passwordService: PasswordService
) {

    @PostMapping(value = ["resetPassword"])
    fun resetPassword(@RequestBody request: ResetPasswordRequest): Mono<ResetPassSession?> {
        return passwordService.sendPasswordReset(request.email)
    }

    @PostMapping(value = ["getResetSession"])
    fun getResetSession(@RequestBody request: GetResetSessionRequest): Mono<ResetPassSession?> {
        return passwordService.getResetSession(request.sessionId, request.code)
    }

    @PostMapping(value = ["confirmResetByCode"])
    fun confirmResetByCode(@RequestBody request: ConfirmResetByCodeRequest): Mono<String> {
        return passwordService.confirmReset(request.sessionId, request.code, request.newPassword)
    }

    @PostMapping(value = ["confirmResetByToken"])
    fun confirmResetByToken(@RequestBody request: ConfirmResetByTokenRequest): Mono<String> {
        return passwordService.confirmReset(request.sessionToken, request.newPassword)
    }
}
