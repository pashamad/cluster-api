package network.clusterone.api.services.keychain

import network.clusterone.api.domain.KeyStore
import network.clusterone.api.repository.KeystoreRepository
import network.clusterone.api.security.UserDetailsResolverService
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal
import java.util.*

data class KeyData(
    val network: String,
    val path: String,
    val address: String,
    val publicKey: String,
    val privateKey: String?,
    val name: String?,
    val mnemonicId: UUID? = null
)

data class KeyPatch(
    val name: String?
)

@Service
class UserKeysService(
    val logger: Logger,
    val repo: KeystoreRepository,
    val userDetails: UserDetailsResolverService
) {

    fun addUserKey(data: KeyData, principal: Principal): Mono<KeyStore> {
        val user = userDetails.findUserByUsername(principal.name)
        return user.flatMap {
            val key = KeyStore(
                null, data.network, data.path, data.address, data.publicKey, data.privateKey, it?.id!!, data.mnemonicId
            )
            repo.save(key)
        }
    }

    fun getUserKeys(principal: Principal): Flux<KeyStore> {
        val user = userDetails.findUserByUsername(principal.name)
        return user.map { it!! }
            .flatMapMany { repo.findAllByUserId(it.id!!) }
    }

    fun getUserKey(id: UUID, principal: Principal): Mono<KeyStore?> {
        val user = userDetails.findUserByUsername(principal.name)
        return user.map { it!! }
            .flatMap { repo.findByIdAndUser(id, it.id!!) }
    }

    /**
     * @sample
     */
    fun patchUserKey(id: UUID, patch: KeyPatch, principal: Principal): Mono<KeyStore?> {
        val user = userDetails.findUserByUsername(principal.name)
        return user.map { it!! }
            .flatMap { repo.findByIdAndUser(id, it.id!!) }
    }
}
