package network.clusterone.api.grpc.crypto

import io.grpc.Metadata
import network.clusterone.api.grpc.GrpcClientService
import network.clusterone.api.grpc.GrpcServiceId
import network.clusterone.grpc.service.account.AccountServiceGrpcKt
import network.clusterone.grpc.service.account.NewMnemonicRequest
import network.clusterone.grpc.service.account.WordLang
//import network.clusterone.grpc.AccountServiceGrpcKt
//import network.clusterone.grpc.NewMnemonicRequest
//import network.clusterone.grpc.WordLang
import org.springframework.stereotype.Service

@Service
class MnemonicGrpcClient(
    final val grpc: GrpcClientService
) {
    private val stub = AccountServiceGrpcKt.AccountServiceCoroutineStub(grpc.getChannel(GrpcServiceId.ACCOUNT))

    suspend fun getNewMnemonic(wordCount: Int, lang: WordLang): String? {
        assert(wordCount in 12..24) { "Mnemonic phrase length expected to be between 12 and 24 words, but got $wordCount" }
        assert(wordCount % 3 == 0) { "Mnemonic phrase length must be a multiple of 3, but got $wordCount" }
        val entropy = wordCount * 10 + wordCount * 2 / 3;
        val request = NewMnemonicRequest.newBuilder()
            .setEntropy(entropy)
            .setLang(lang)
            .build()
        val response = stub.newMnemonic(request, Metadata())
        return response.mnemonic
    }
}
