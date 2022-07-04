package network.clusterone.api.services.keychain

import kotlinx.coroutines.runBlocking
import network.clusterone.api.domain.Mnemonic
import network.clusterone.api.repository.MnemonicRepository
import network.clusterone.api.security.UserResolverService
import network.clusterone.api.services.crypto.KeygenService
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal

@Service
class UserMnemonicService(
    val logger: Logger,
    val repo: MnemonicRepository,
    val keygen: KeygenService,
    val userDetails: UserResolverService
) {

    fun addUserMnemonic(phrase: String, name: String?, principal: Principal): Mono<Mnemonic> {
        val user = userDetails.findUserByUsername(principal.name)
        val seed = runBlocking { keygen.getSeedFromMnemonic(phrase) }
        return user.flatMap {
            val mnemonic = Mnemonic(
                null, phrase, 12, "en", seed, name, it?.id!!
            )
            repo.save(mnemonic)
        }
    }

    fun getUserMnemonics(principal: Principal): Flux<Mnemonic> {
        val user = userDetails.findUserByUsername(principal.name)
        return user.map { it!! }
            .flatMapMany { repo.findAllByUserId(it.id!!) }
    }
}
