@file:Suppress("DEPRECATION")

package network.clusterone.api.rest.auth

import network.clusterone.api.security.JwtSigner
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpStatus
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.reactive.function.client.WebClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RegisterControllerTests {

    @LocalServerPort
    var serverPort: Int? = null

    @Autowired
    lateinit var jwtSigner: JwtSigner

    @Test
    fun loginToUnknownAccountReturnsUnauthorised() {
        // arrange
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:${serverPort}")
            .build()

        // act
        val response = webClient.post()
            .uri("/auth/register/login")
            .bodyValue(UserCredentials("unknown@example.com", "pw"))
            .exchange()
            .block()

        // assert
        assertThat(response?.statusCode()).isEqualTo(HttpStatus.UNAUTHORIZED)
    }

    @Test
    fun loginToKnownAccountButIncorrectPasswordReturnsUnauthorised() {
        // arrange
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:${serverPort}")
            .build()

        // act
        val response = webClient.post()
            .uri("/auth/register/login")
            .bodyValue(UserCredentials("email@example.com", "incorrect password"))
            .exchange()
            .block()

        // assert
        assertThat(response?.statusCode()).isEqualTo(HttpStatus.UNAUTHORIZED)
    }

    @Test
    fun successfulLoginToKnownAccountReturnsNoContent() {
        // arrange
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:${serverPort}")
            .build()

        // act
        val response = webClient.post()
            .uri("/auth/register/login")
            .bodyValue(UserCredentials("email@example.com", "pw"))
            .exchange()
            .block()

        // assert
        assertThat(response?.statusCode()).isEqualTo(HttpStatus.NO_CONTENT)
    }

    @Test
    fun `successful login to known account should return Jwt cookie`() {
        // arrange
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:${serverPort}")
            .build()

        // act
        val response = webClient.post()
            .uri("/auth/register/login")
            .bodyValue(UserCredentials("email@example.com", "pw"))
            .exchange()
            .block()
        val jwtToken =
            response?.cookies()?.get("X-Auth")?.get(0)?.value ?: throw RuntimeException("No JWT Token in response")

        // assert
        assertThat(jwtSigner.validateJwt(jwtToken)).isNotNull
    }

    @Test
    fun signingUpToAccountAllowsForSubsequentLogin() {
        // arrange
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:${serverPort}")
            .build()

        // act
        val signupResponse = webClient.put()
            .uri("/auth/register/email")
            .bodyValue(UserCredentials("new@example.com", "pw"))
            .exchange()
            .block()
        assertThat(signupResponse?.statusCode()).isEqualTo(HttpStatus.NO_CONTENT)
        val loginResponse = webClient.post()
            .uri("/auth/register/login")
            .bodyValue(UserCredentials("new@example.com", "pw"))
            .exchange()
            .block()

        // assert
        assertThat(loginResponse?.statusCode()).isEqualTo(HttpStatus.NO_CONTENT)
    }

    @Test
    fun `cannot obtain user details if not logged in`() {
        // arrange
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:${serverPort}")
            .build()

        // act
        val response = webClient.get()
            .uri("/auth/register")
            .exchange()
            .block()

        // assert
        assertThat(response?.statusCode()).isEqualTo(HttpStatus.UNAUTHORIZED)
    }

    @Test
    fun `can obtain own user details when logged in`() {
        // arrange
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:${serverPort}")
            .build()
        webClient.put()
            .uri("/auth/register/email")
            .bodyValue(UserCredentials("new@example.com", "pw"))
            .exchange()
            .block()
        val loginResponse = webClient.post()
            .uri("/auth/register/login")
            .bodyValue(UserCredentials("new@example.com", "pw"))
            .exchange()
            .block() ?: throw RuntimeException("Should have gotten a response")
        val responseCookies = loginResponse.cookies()
            .map { it.key to it.value.map { cookie -> cookie.value } }
            .toMap()

        // act
        val response = webClient.get()
            .uri("/auth/register")
            .cookies { it.addAll(LinkedMultiValueMap(responseCookies)) }
            .exchange()
            .block()

        // assert
        assertThat(response?.statusCode()).isEqualTo(HttpStatus.OK)
        // assertThat(response?.bodyToFlux(User::class.java)?.blockFirst()).isEqualTo(User("new@example.com"))
    }
}
