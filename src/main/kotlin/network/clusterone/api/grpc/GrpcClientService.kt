package network.clusterone.api.grpc

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.springframework.stereotype.Service
import java.util.*

data class GrpcServiceDesc(
    val address: String,
    val port: Int
)

enum class GrpcServiceId {
    ACCOUNT, WRITER, ETH_LISTENER, SOL_LISTENER, SOL_STAKING
}

@Service
class GrpcClientService {

    private val services = mapOf(
        GrpcServiceId.ACCOUNT to GrpcServiceDesc("bc-account.backend.svc.cluster.local", 11223),
        GrpcServiceId.WRITER to GrpcServiceDesc("bc-writer.backend.svc.cluster.local", 11334),
        GrpcServiceId.ETH_LISTENER to GrpcServiceDesc("bc-listener-eth.backend.svc.cluster.local", 11445),
        GrpcServiceId.SOL_LISTENER to GrpcServiceDesc("bc-listener-sol.backend.svc.cluster.local", 11446),
        GrpcServiceId.SOL_STAKING to GrpcServiceDesc("bc-staking-sol.backend.svc.cluster.local", 11556),
    )

//    private val services = mapOf(
//        GrpcServiceId.ACCOUNT to GrpcServiceDesc("bc-api-dev.clusterz.net/account", 80),
//        GrpcServiceId.WRITER to GrpcServiceDesc("bc-api-dev.clusterz.net/writer", 80),
//        GrpcServiceId.ETH_LISTENER to GrpcServiceDesc("bc-api-dev.clusterz.net/listener-eth", 80),
//        GrpcServiceId.SOL_LISTENER to GrpcServiceDesc("bc-api-dev.clusterz.net/listener-sol", 80),
//        GrpcServiceId.SOL_STAKING to GrpcServiceDesc("bc-api-dev.clusterz.net/staking-sol", 80),
//    )

    private val targets = mapOf(
        GrpcServiceId.ACCOUNT to "bc-account.backend.svc.cluster.local:11223",
        GrpcServiceId.WRITER to "bc-writer.backend.svc.cluster.local:11334",
        GrpcServiceId.ETH_LISTENER to "bc-listener-eth.backend.svc.cluster.local:11445",
        GrpcServiceId.SOL_LISTENER to "bc-listener-sol.backend.svc.cluster.local:11446",
        GrpcServiceId.SOL_LISTENER to "bc-staking-sol.backend.svc.cluster.local:11556",
    )

    private val channels = EnumMap<GrpcServiceId, ManagedChannel>(GrpcServiceId::class.java)

    init {
        services.forEach { (id, desc) ->
            channels[id] = ManagedChannelBuilder
                .forAddress(desc.address, desc.port)
                // .forTarget(desc)
                .usePlaintext()
                .build()
        }
    }

    fun getChannel(id: GrpcServiceId): ManagedChannel {
        return channels[id]!!
    }
}
