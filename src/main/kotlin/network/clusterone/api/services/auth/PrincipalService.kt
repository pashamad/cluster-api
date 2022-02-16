package network.clusterone.api.services.auth

import network.clusterone.api.security.UserDetails
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service

@Service
class PrincipalService {

    fun getUsernameFromContext(): String? {
        val principal = SecurityContextHolder.getContext().authentication.principal
        var username: String? = null

        if (principal is UserDetails) {
            username = principal.username
        } else {
            username = principal.toString()
        }

        return username
    }
}
