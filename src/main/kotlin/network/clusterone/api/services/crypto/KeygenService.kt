package network.clusterone.api.services.crypto

import org.slf4j.Logger
import org.springframework.stereotype.Service

data class Keystore(val mnemonic: String, val seed: String)

@Service
class KeygenService(
    val logger: Logger,
    val mnemonicService: MnemonicService
) {

    fun fromMnemonic(phrase: String): Keystore {
        logger.debug("Generating keystore from mnemonic $phrase")
        val mnemonic = mnemonicService.import(phrase)
        val seed = mnemonicService.getSeed(mnemonic)
        logger.debug("Generated seed: $seed")

        return Keystore(phrase, seed)
    }
}