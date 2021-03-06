package network.clusterone.api.grpc.writer

import io.grpc.Metadata
import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.api.grpc.GrpcServiceId
import network.clusterone.grpc.*
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class WriterGrpcClient(
    final val grpc: GrpcClientService
) {

    private val stub = WriterServiceGrpcKt.WriterServiceCoroutineStub(grpc.getChannel(GrpcServiceId.WRITER))

    suspend fun sendFromTo(symbol: String, from: String, to: String, privateKey: String, amount: BigDecimal): String {
        val request = SendFromToRequest.newBuilder()
            .setSymbol(symbol)
            .setFromAddr(from)
            .setToAddr(to)
            .setFromPrivate(privateKey)
            .setAmount(amount.toString())
            .build()
        val response = stub.sendFromTo(request, Metadata())

        return response.txHash
    }

    suspend fun getBalanceOf(symbol: String, address: String): BigDecimal {
        val request = GetBalanceRequest.newBuilder()
            .setSymbol(symbol)
            .setAddress(address)
            .build()
        val response = stub.getBalanceOf(request, Metadata())
        return response.amount.toBigDecimal()
    }

    suspend fun getTxStatus(net: String, hash: String): String {
        val request = GetTxByHashRequest.newBuilder()
            .setSymbol(net)
            .setTxHash(hash)
            .build()
        val response = stub.getTxStatusByHash(request, Metadata())
        return response.status.toString()
    }
}
