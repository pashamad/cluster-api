package network.clusterone.api.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.reactive.CorsConfigurationSource
import org.springframework.web.cors.reactive.CorsWebFilter
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource

@Configuration
class CorsConfiguration {

    fun getCorsConfigurationSource(): CorsConfigurationSource {

        val corsConfig = CorsConfiguration()
        corsConfig.allowedOrigins = listOf("http://localhost:3000")
        corsConfig.allowedOriginPatterns = listOf("*")
        corsConfig.allowedMethods = "GET,POST,PUT,PATCH,DELETE".split(",")
        corsConfig.allowedHeaders = "Authorization,Content-Type".split(",")
        corsConfig.allowCredentials = true
        corsConfig.maxAge = 8000L

        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", corsConfig)
        return source
    }

    @Bean
    fun corsWebFilter(): CorsWebFilter? {
        return CorsWebFilter(getCorsConfigurationSource())
    }
}
