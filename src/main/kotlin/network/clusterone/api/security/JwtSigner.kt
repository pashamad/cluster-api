package network.clusterone.api.security

import io.jsonwebtoken.*
import io.jsonwebtoken.security.Keys
import org.springframework.stereotype.Service
import java.security.KeyPair
import java.time.Duration
import java.time.Instant
import java.util.Date

@Service
class JwtSigner {
    val keyPair: KeyPair = Keys.keyPairFor(SignatureAlgorithm.RS256)

    fun createJwt(userId: String): String {
        return Jwts.builder()
            .signWith(keyPair.private, SignatureAlgorithm.RS256)
            .setSubject(userId)
            .setIssuer("cluster-one") // @todo make configurable
            .setExpiration(Date.from(Instant.now().plus(Duration.ofMinutes(120)))) // @todo make configurable
            .setIssuedAt(Date.from(Instant.now()))
            .compact()
    }

    fun validateJwt(jwt: String): Jws<Claims> {
        return Jwts.parserBuilder()
            .setSigningKey(keyPair.public)
            .build()
            .parseClaimsJws(jwt)
    }

    fun parseJwt(jwt: String): Jwt<out Header<*>, *>? {
        return Jwts.parserBuilder()
            .setSigningKey(keyPair.public)
            .build()
            .parse(jwt)
    }
}
