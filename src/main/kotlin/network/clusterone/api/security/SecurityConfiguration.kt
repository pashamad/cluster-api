package network.clusterone.api.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.authentication.ReactiveAuthenticationManager
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager
import org.springframework.security.config.web.server.SecurityWebFiltersOrder
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService
import org.springframework.security.core.userdetails.ReactiveUserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.server.SecurityWebFilterChain
import org.springframework.security.web.server.authentication.AuthenticationWebFilter
import org.springframework.security.web.server.authentication.ServerAuthenticationConverter
import org.springframework.security.web.server.context.NoOpServerSecurityContextRepository

@Configuration
class SecurityConfiguration(
    val userDetailsService: UserResolverService
) {

    @Bean
    fun securityWebFilterChain(
        http: ServerHttpSecurity,
        jwtAuthenticationManager: ReactiveAuthenticationManager,
        jwtAuthenticationConverter: ServerAuthenticationConverter
    ): SecurityWebFilterChain {

        val authenticationWebFilter = AuthenticationWebFilter(jwtAuthenticationManager)
        authenticationWebFilter.setServerAuthenticationConverter(jwtAuthenticationConverter)

        http
            .csrf().disable()
            .httpBasic().disable()
            .logout().disable()
            .addFilterAt(authenticationWebFilter, SecurityWebFiltersOrder.AUTHENTICATION)
            .authorizeExchange()
            .pathMatchers(HttpMethod.OPTIONS).permitAll()
            // .pathMatchers(HttpMethod.DELETE).denyAll()
            .pathMatchers(HttpMethod.POST, "/auth/register/**").permitAll()
            .pathMatchers(HttpMethod.POST, "/auth/login/**").permitAll()
            .pathMatchers(HttpMethod.POST, "/auth/password/**").permitAll()
            .pathMatchers("/crypto/**").permitAll()
            .pathMatchers("/v3/api-docs/**").permitAll()
            .pathMatchers("/swagger-ui").permitAll()
            .pathMatchers("/webjars/swagger-ui/**").permitAll()
            .anyExchange().authenticated()
            .and()
            .securityContextRepository(NoOpServerSecurityContextRepository.getInstance())
            // .exceptionHandling()
            // .authenticationEntryPoint(AuthEntryPoint())

        return http.build()
    }

    @Bean
    fun encoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun authenticationManager(userDetailsService: ReactiveUserDetailsService): ReactiveAuthenticationManager {
        return UserDetailsRepositoryReactiveAuthenticationManager(userDetailsService)
    }

    @Bean
    fun userDetailsService(): ReactiveUserDetailsService {
        return userDetailsService
    }

    @Bean
    fun userDetailsServiceMap(): MapReactiveUserDetailsService? {
        val user = UserDetails("mapped", "pw", "ROLE_USER".split(","))
        return MapReactiveUserDetailsService(user)
    }
}
