package network.clusterone.api.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
class GrpcConfiguration {

    @Value("bc.account.addr")
    private lateinit var accountAddr: String

    @Value("bc.writer.addr")
    private lateinit var writerAddr: String

    @Value("bc.listener_eth.addr")
    private lateinit var listenerEthAddr: String

    @Value("bc.listener_sol.addr")
    private lateinit var listenerSolAddr: String
}
