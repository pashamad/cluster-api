package network.clusterone.api.services.auth

import network.clusterone.api.services.mailer.SendMailTemplateData
import network.clusterone.api.services.mailer.SendgridService
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PasswordService(
    val sendGrid: SendgridService
) {

    fun sendPasswordReset(email: String): Mono<Void> {
        // todo: retrieve user by email
        // todo: check previous sessions timers
        val data = SendMailTemplateData(
            email, "Password reset requested", "d-2e699e68a4404e40b7a399b48c4fb21b",
            mapOf("first_name" to "User", "code" to "4444")
        )
        // todo: store reset-password session
        return sendGrid.sendMailTemplate(data)
    }

    fun getResetSession(sessionId: String, code: String): Mono<Void> {
        return Mono.empty()
    }

    fun confirmReset(sessionToken: String, newPassword: String): Mono<Void> {
        return Mono.empty()
    }

    fun confirmReset(sessionId: String, code: String, newPassword: String): Mono<Void> {
        return Mono.empty()
    }
}
