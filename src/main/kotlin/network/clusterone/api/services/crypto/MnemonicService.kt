package network.clusterone.api.services.crypto

import kotlinx.coroutines.runBlocking
import network.clusterone.api.domain.Mnemonic
import network.clusterone.api.grpc.crypto.MnemonicGrpcClient
import network.clusterone.api.repository.MnemonicRepository
import network.clusterone.grpc.service.account.WordLang
import network.clusterone.lib.bip39.Mnemonics
import network.clusterone.lib.bip39.toSeed
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.*

data class MnemonicPhrase(
    val phrase: String,
    val wordCount: Int,
    val language: String
) {
}

@Service
class MnemonicService(
    val logger: Logger,
    val repo: MnemonicRepository,
    val grpc: MnemonicGrpcClient
) {

    val langMap = mapOf(
        "en" to WordLang.ENGLISH,
        "fr" to WordLang.FRENCH,
        "it" to WordLang.ITALIAN,
        "es" to WordLang.SPANISH,
        "cz" to WordLang.CZECH,
        "jp" to WordLang.JAPANESE,
        "ko" to WordLang.KOREAN,
        "zh" to WordLang.CHINESESIMPLIFIED
    )

    fun generateInternal(count: Int = Mnemonics.WordCount.COUNT_12.count, lang: String = "en"): MnemonicPhrase {
        logger.debug("Generating mnemonic with {count: $count, lang: $lang}")
        val wordCount: Mnemonics.WordCount = Mnemonics.WordCount.valueOf(count)!!
        val mnemonicCode: Mnemonics.MnemonicCode = Mnemonics.MnemonicCode(wordCount)
        val mnemonicString = String(mnemonicCode.chars)
        logger.debug("Generated mnemonic: $mnemonicString")
        return MnemonicPhrase(mnemonicString, mnemonicCode.words.size, lang)
    }

    fun generate(wordCount: Int, lang: String): Mono<MnemonicPhrase> {
        val langEnum = langMap[lang]
        assert(langEnum != null) { "Unsupported phrase lang: $lang" }
        val phrase = runBlocking { generate(wordCount, langEnum!!) }
        val mnemonic = MnemonicPhrase(phrase, wordCount, lang)
        return Mono.just(mnemonic)
    }

    private suspend fun generate(wordCount: Int, lang: WordLang): String {
        return grpc.getNewMnemonic(wordCount, lang)!!
    }

    fun import(phrase: String, lang: String = "en"): MnemonicPhrase {
        val mnemonicCode = Mnemonics.MnemonicCode(phrase)
        return MnemonicPhrase(phrase, mnemonicCode.words.size, lang)
    }

    fun getSeed(mnemonic: MnemonicPhrase): String {
        val mnemonicCode = Mnemonics.MnemonicCode(mnemonic.phrase)

        return mnemonicCode.toSeed().asList()
            .map { it.toUByte() }
            .joinToString(separator = ",", prefix = "[", postfix = "]") { "$it" }
    }

    fun getById(id: UUID): Mono<Mnemonic> {
        return repo.findById(id)
    }
}
