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
    ACCOUNT, WRITER
}

@Service
class GrpcClientService {

    private val services = mapOf(
        GrpcServiceId.ACCOUNT to GrpcServiceDesc("134.209.133.17", 11223),
        GrpcServiceId.WRITER to GrpcServiceDesc("188.166.200.239", 11334),
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
