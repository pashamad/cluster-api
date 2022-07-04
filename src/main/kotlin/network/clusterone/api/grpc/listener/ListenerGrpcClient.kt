package network.clusterone.api.grpc.listener

import io.grpc.Metadata
import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.api.grpc.GrpcServiceId
import network.clusterone.grpc.messages.types.Transaction
import network.clusterone.grpc.service.listener.AddAddressRequest
import network.clusterone.grpc.service.listener.ListenerServiceGrpcKt
import network.clusterone.grpc.service.listener.TransactionsByAddressRequest
//import network.clusterone.grpc.AddAddressRequest
//import network.clusterone.grpc.ListenerServiceGrpcKt
//import network.clusterone.grpc.Transaction
//import network.clusterone.grpc.TransactionsByAddressRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class ListenerGrpcClient(
    final val grpc: GrpcClientService
) {

    private val stubEth =
        ListenerServiceGrpcKt.ListenerServiceCoroutineStub(
            grpc.getChannel(GrpcServiceId.ETH_LISTENER)
        )

    private val stubSol =
        ListenerServiceGrpcKt.ListenerServiceCoroutineStub(
            grpc.getChannel(GrpcServiceId.SOL_LISTENER)
        )

    suspend fun getTransactionsByAddress(net: String, addr: String, from: Int, limit: Int): List<Transaction> {

        val request = TransactionsByAddressRequest.newBuilder()
            .setAddress(addr)
            .setFrom(from)
            .setLimit(limit)
            .build()
        val response = getStub(net).transactionsByAddress(request, Metadata())

        return response.transactionsList
    }

    suspend fun addAddress(net: String, addr: String, accId: UUID): Boolean {
        val request = AddAddressRequest.newBuilder()
            .setAddress(addr)
            .setAccountUuid(accId.toString())
            .build()
        val response = getStub(net).addAddress(request, Metadata())

        return response.isInitialized
    }

    private fun getStub(net: String): ListenerServiceGrpcKt.ListenerServiceCoroutineStub {
        return when (net) {
            "eth" -> stubEth
            "sol" -> stubSol
            else -> {
                throw Exception("Unknown network '${net}'")
            }
        }
    }
}
