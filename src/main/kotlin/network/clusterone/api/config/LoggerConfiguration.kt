package network.clusterone.api.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LoggerConfiguration {

    @Bean
    fun defaultLogger() : Logger {
        return LoggerFactory.getLogger("defaultLogger")
    }
}