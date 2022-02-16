package network.clusterone.api.services.crypto

import network.clusterone.api.grpc.crypto.MnemonicGrpcClient
import network.clusterone.lib.bip39.Mnemonics
import network.clusterone.lib.bip39.toSeed
import org.slf4j.Logger
import org.springframework.stereotype.Service

data class Mnemonic(
    val phrase: String,
    val wordCount: Int,
    val language: String
) {
}

@Service
class MnemonicService(
    val logger: Logger,
    val grpc: MnemonicGrpcClient
) {

    fun generateInternal(count: Int = Mnemonics.WordCount.COUNT_12.count, lang: String = "en"): Mnemonic {
        logger.debug("Generating mnemonic with {count: $count, lang: $lang}")
        val wordCount: Mnemonics.WordCount = Mnemonics.WordCount.valueOf(count)!!
        val mnemonicCode: Mnemonics.MnemonicCode = Mnemonics.MnemonicCode(wordCount)
        val mnemonicString = String(mnemonicCode.chars)
        logger.debug("Generated mnemonic: $mnemonicString")
        return Mnemonic(mnemonicString, mnemonicCode.words.size, lang)
    }

    suspend fun generate(): Mnemonic {
        val mnemonic = grpc.getNewMnemonic()!!
        return Mnemonic(mnemonic, 12, "en")
    }

    fun import(phrase: String, lang: String = "en"): Mnemonic {
        val mnemonicCode = Mnemonics.MnemonicCode(phrase)
        return Mnemonic(phrase, mnemonicCode.words.size, lang)
    }

    fun getSeed(mnemonic: Mnemonic): String {
        val mnemonicCode = Mnemonics.MnemonicCode(mnemonic.phrase)

        return mnemonicCode.toSeed().asList()
            .map { it.toUByte() }
            .joinToString(separator = ",", prefix = "[", postfix = "]") { "$it" }
    }
}