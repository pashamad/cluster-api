package network.clusterone.api.security

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class UserDetails(
    private val username: String,
    private val password: String,
    private val authorities: Collection<String>
) : UserDetails {

    override fun getPassword(): String = password
    override fun getUsername(): String = username

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return authorities
            .map { SimpleGrantedAuthority(it) }
            .toMutableSet()
    }

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = true

    override fun isCredentialsNonExpired(): Boolean = true

    override fun isEnabled(): Boolean = true
}
