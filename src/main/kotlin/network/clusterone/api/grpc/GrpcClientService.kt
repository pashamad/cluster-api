package network.clusterone.api.grpc

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.springframework.stereotype.Service

@Service
class GrpcClientService {

    private var channel: ManagedChannel = ManagedChannelBuilder
        .forAddress("134.209.133.17", 11223)
        .usePlaintext()
        .build()

    fun getChannel(): ManagedChannel {
        return channel
    }
}
