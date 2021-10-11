package network.clusterone.api.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import network.clusterone.api.security.UserDetails
import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant
import java.util.*
import javax.persistence.Column
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull

@Table("users")
open class User(

    @Id
    @NaturalId
    var id: UUID? = null,

    @field:NotNull
    @field:Email
    var email: String? = null,

    @JsonIgnore
    var password: String? = null,

    @field:NotNull
    var authorities: String? = null,

    @field:NotNull
    var activated: Boolean? = false,

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @JsonIgnore
    var createdDate: Instant? = Instant.now(),
) {

    @PersistenceConstructor
    constructor (
        email: String?,
        password: String?,
        authorities: String?
    ) : this(
        null,
        email,
        password,
        authorities
    )

    open fun toUserDetails(): UserDetails {
        return UserDetails(email!!, password!!, authorities!!.split(","))
    }
}
