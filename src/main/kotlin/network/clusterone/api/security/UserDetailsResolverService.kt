package network.clusterone.api.security

import network.clusterone.api.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Primary
import org.springframework.security.core.userdetails.ReactiveUserDetailsService
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
@Primary
class UserDetailsResolverService(
    val userRepository: UserRepository
) : ReactiveUserDetailsService {

    override fun findByUsername(username: String): Mono<UserDetails?> {
        return userRepository.findOneByEmail(username)
            .switchIfEmpty(Mono.defer {
                Mono.error(
                    UsernameNotFoundException("User Not Found")
                )
            }).map { it!!.toUserDetails() }
    }
}
