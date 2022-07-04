package network.clusterone.api.services.mailer

import com.sendgrid.Method
import com.sendgrid.Request
import com.sendgrid.Response
import com.sendgrid.SendGrid
import com.sendgrid.helpers.mail.Mail
import com.sendgrid.helpers.mail.objects.Content
import com.sendgrid.helpers.mail.objects.Email
import com.sendgrid.helpers.mail.objects.Personalization
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

data class SendMailTemplateData(
    val to: String,
    val subject: String,
    val templateId: String,
    val params: Map<String, String>
)

@Service
class SendgridService(
    val logger: Logger
) {

    // private val apiKey: String = System.getenv("SENDGRID_API_KEY")
    private val apiKey: String = "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"
    val sendGrid = SendGrid(apiKey)

    fun sendMailTemplate(data: SendMailTemplateData): Mono<Int> {
        val from = Email("no-reply@pes.dev", "ClusterOne Team")
        val to = Email(data.to)

        val mail = Mail()
        mail.from = from
        mail.templateId = data.templateId

        val personalization = Personalization()
        personalization.addTo(to)
        data.params.forEach { (key, value) ->
            personalization.addDynamicTemplateData(key, value)
        }
        mail.addPersonalization(personalization)

        val request = Request()
        request.method = Method.POST
        request.baseUri = "v3/"
        request.endpoint = "mail/send"
        request.body = mail.build()
        val response: Response = sendGrid.api(request)
        logger.info("$response; code ${response.statusCode}")

        // todo: check response status
        return Mono.just(response.statusCode)
    }

    /**
     * @sample
     */
    fun sendEmail(): String? {

        val to = Email("pashamad@gmail.com")
        val from = Email("pashamad@me.com")
        val subject = "Sending with SendGrid is Fun"
        val content = Content("text/plain", "and easy to do anywhere, even with Kotlin")
        val mail = Mail(from, subject, to, content)

        val request = Request()
        request.method = Method.POST
        request.endpoint = "mail/send"
        request.body = mail.build()
        val response: Response = sendGrid.api(request)

        return response.body
    }
}
