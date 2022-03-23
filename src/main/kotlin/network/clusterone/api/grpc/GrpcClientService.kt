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
    ACCOUNT, WRITER, ETH_LISTENER, SOL_LISTENER
}

@Service
class GrpcClientService {

    private val services = mapOf(
        GrpcServiceId.ACCOUNT to GrpcServiceDesc("cluster-account.backend.svc.cluster.local", 11223),
        GrpcServiceId.WRITER to GrpcServiceDesc("cluster-writer.backend.svc.cluster.local", 11334),
        GrpcServiceId.ETH_LISTENER to GrpcServiceDesc("cluster-eth-listener.backend.svc.cluster.local", 11445),
        GrpcServiceId.SOL_LISTENER to GrpcServiceDesc("cluster-sol-listener.backend.svc.cluster.local", 11446),
    )

    private val channels = EnumMap<GrpcServiceId, ManagedChannel>(GrpcServiceId::class.java)

    init {
        services.forEach { (id, desc) ->
            channels[id] = ManagedChannelBuilder
                .forAddress(desc.address, desc.port)
                .usePlaintext()
                .build()
        }
    }

    fun getChannel(id: GrpcServiceId): ManagedChannel {
        return channels[id]!!
    }
}
