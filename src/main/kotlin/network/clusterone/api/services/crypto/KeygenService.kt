package network.clusterone.api.services.crypto

import network.clusterone.api.grpc.crypto.AccountData
import network.clusterone.api.grpc.crypto.KeygenGrpcClient
import org.slf4j.Logger
import org.springframework.stereotype.Service

data class Keystore(val mnemonic: String, val seed: String)

enum class CoinType {
    BTC, ETH, SOL
}

class DerivePath {

    val coinName = mapOf(
        CoinType.BTC to "btc",
        CoinType.ETH to "eth",
        CoinType.SOL to "sol"
    )

    private val coinPurpose = mapOf(
        CoinType.BTC to 49,
        CoinType.ETH to 44,
        CoinType.SOL to 44
    )

    private val coinTypeId = mapOf(
        CoinType.BTC to 0,
        CoinType.ETH to 60,
        CoinType.SOL to 501
    )

    fun getPath(type: CoinType, acc: Int, index: Int): String {
        val purpose = coinPurpose[type]
        val typeId = coinTypeId[type]

        // we must use hardened derivation for both account type and index
        // val t = if (type == CoinType.SOL) "'" else ""
        // var path = "m/$purpose'/$typeId'/$acc'/0$t/$index"
        var path = "m/$purpose'/$typeId'/$acc'"
        // to be compatible with trust wallet, we will not append account type and index to solana path
        if (type !== CoinType.SOL) {
            path += "/0/$index"
        }

        return path
    }
}

@Service
class KeygenService(
    val logger: Logger,
    val mnemonicService: MnemonicService,
    val keygenGrpcClient: KeygenGrpcClient
) {

    val derivePath = DerivePath()

    suspend fun getSeedFromMnemonic(phrase: String, password: String? = ""): String {
        logger.info("Generating seed from mnemonic $phrase with password '$password'")
        val seed = keygenGrpcClient.getSeedFromMnemonic(phrase, password!!)
        logger.info("Generated seed: $seed")

        return seed
    }

    suspend fun getAccountData(net: String, seed: String, acc: Int? = 0, index: Int? = 0): AccountData {
        val coin = CoinType.valueOf(net.uppercase())
        val path = derivePath.getPath(coin, acc ?: 0, index ?: 0)
        logger.info("Deriving account data from seed $seed, for network $net and path $path")
        val data = keygenGrpcClient.getAccountData(net, seed, path)
        logger.info("Generated account data: $data")

        return data
    }

    suspend fun getPublicKey(net: String, seed: String, acc: Int? = 0, index: Int? = 0): String {
        val coin = CoinType.valueOf(net.uppercase())
        val path = derivePath.getPath(coin, acc ?: 0, index ?: 0)
        logger.info("Deriving account public address from seed $seed, for network $net and path $path")
        val key = keygenGrpcClient.getPublicKey(net, seed, path)
        logger.info("Derived account public address: $key")

        return key
    }

    fun fromMnemonicInternal(phrase: String): Keystore {
        logger.debug("Generating keystore from mnemonic $phrase")
        val mnemonic = mnemonicService.import(phrase)
        val seed = mnemonicService.getSeed(mnemonic)
        logger.debug("Generated seed: $seed")

        return Keystore(phrase, seed)
    }
}
