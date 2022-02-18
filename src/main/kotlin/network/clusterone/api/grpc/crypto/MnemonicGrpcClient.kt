package network.clusterone.api.grpc.crypto

import io.grpc.Metadata
import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.api.grpc.GrpcServiceId
import network.clusterone.grpc.AccountServiceGrpcKt
import network.clusterone.grpc.NewMnemonicRequest
import network.clusterone.grpc.WordLang
import org.springframework.stereotype.Service

@Service
class MnemonicGrpcClient(
    final val grpc: GrpcClientService
) {
    private val stub = AccountServiceGrpcKt.AccountServiceCoroutineStub(grpc.getChannel(GrpcServiceId.ACCOUNT))

    suspend fun getNewMnemonic(): String? {
        val request = NewMnemonicRequest.newBuilder()
            .setEntropy(128)
            .setLang(WordLang.ENGLISH)
            .build()
        val response = stub.newMnemonic(request, Metadata())
        return response.mnemonic
    }
}
