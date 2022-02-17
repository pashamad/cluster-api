package network.clusterone.api.grpc.crypto

import com.google.protobuf.kotlin.toByteString
import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.grpc.AccountServiceGrpcKt
import network.clusterone.grpc.GetSeedFromMnemonicRequest
import network.clusterone.grpc.SeedDeriveToAccountRequest
import network.clusterone.grpc.SeedDeriveToAddressHexRequest
import org.springframework.stereotype.Service
import java.util.*

data class AccountData(
    val privateKey: String,
    val publicKey: String,
    val address: String,
    val path: String
)

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

    suspend fun getAccountData(net: String, seed: String, path: String): AccountData {
        val bytes = Base64.getDecoder().decode(seed)
        val request = SeedDeriveToAccountRequest.newBuilder()
            .setSymbol(net)
            .setSeed(bytes.toByteString())
            .setPath(path)
            .build()
        val response = stub.seedDeriveToAccountData(request)
        return AccountData(response.privateKey, response.publicKey, response.publicAddr, path)
    }

    suspend fun getPublicKey(net: String, seed: String, path: String): String {
        val bytes = Base64.getDecoder().decode(seed)
        val request = SeedDeriveToAddressHexRequest.newBuilder()
            .setSymbol(net)
            .setSeed(bytes.toByteString())
            .setPath(path)
            .build()
        val response = stub.seedDeriveToPublicKeyHex(request)
        return response.data
    }
}
