package network.clusterone.api.grpc.writer

import io.grpc.Metadata
import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.api.grpc.GrpcServiceId
import network.clusterone.grpc.messages.types.CoinCode
import network.clusterone.grpc.service.writer.GetBalanceRequest
import network.clusterone.grpc.service.writer.SendFromToRequest
import network.clusterone.grpc.service.writer.WriterServiceGrpcKt
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class WriterGrpcClient(
    final val grpc: GrpcClientService
) {

    private val stub = WriterServiceGrpcKt.WriterServiceCoroutineStub(grpc.getChannel(GrpcServiceId.WRITER))

    suspend fun sendFromTo(symbol: String, from: String, to: String, privateKey: String, amount: BigDecimal): String {
        val coinCode = CoinCode.valueOf(symbol.uppercase())
        val request = SendFromToRequest.newBuilder()
            .setSymbol(coinCode)
            .setFromAddr(from)
            .setToAddr(to)
            .setFromPrivate(privateKey)
            .setAmount(amount.toString())
            .build()
        val response = stub.sendFromTo(request, Metadata())

        // todo: can return whole transaction
        return response.transaction.txHash
    }

    suspend fun getBalanceOf(symbol: String, address: String): BigDecimal {
        val coinCode = CoinCode.valueOf(symbol.uppercase())
        val request = GetBalanceRequest.newBuilder()
            .setSymbol(coinCode)
            .setAddress(address)
            .build()
        val response = stub.getBalanceOf(request, Metadata())
        return response.amount.toBigDecimal()
    }

    /*suspend fun getTxStatus(net: String, hash: String): String {
        val coinCode = CoinCode.valueOf(net.uppercase())
        val request = GetTxByHashRequest.newBuilder()
            .setSymbol(coinCode)
            .setTxHash(hash)
            .build()
        val response = stub.getTxStatusByHash(request, Metadata())
        return response.status.toString()
    }*/
}
