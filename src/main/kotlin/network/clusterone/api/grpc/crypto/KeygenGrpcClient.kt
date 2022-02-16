package network.clusterone.api.grpc.crypto

import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.grpc.AccountServiceGrpcKt
import network.clusterone.grpc.GetSeedFromMnemonicRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class KeygenGrpcClient(
    val grpc: GrpcClientService
) {
    private val stub = AccountServiceGrpcKt.AccountServiceCoroutineStub(grpc.getChannel())

    suspend fun getSeedFromMnemonic(phrase: String, password: String = ""): String {
        val request = GetSeedFromMnemonicRequest.newBuilder()
            .setMnemonic(phrase)
            .setPassword(password)
            .build()
        val response = stub.getSeedFromMnemonic(request)
        val bytes = response.seed.toByteArray()
        return Base64.getEncoder().encodeToString(bytes)
    }
}
