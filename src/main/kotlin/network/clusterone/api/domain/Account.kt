package network.clusterone.api.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.util.*
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@Table("account")
class Account(

    @Id
    @NaturalId
    var id: UUID? = null,

    @field:NotNull
    var name: String? = null,

    @field: NotNull
    var network: String? = null,

    @field: NotNull
    var address: String? = null,

    var balance: BigDecimal? = BigDecimal(0),

    @field: NotNull
    var user_id: UUID,

    @field: NotNull
    var keystore_id: UUID,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "users(id)")
    @JsonIgnore
    var user: User? = null,

//    // TODO: this definition throws strange error
//    @ManyToOne
//    @JoinColumn(name = "keystore_id", referencedColumnName = "keystore(id)")
//    @JsonIgnore
//    var keystore: KeyStore? = null

) : AbstractAuditingEntity() {
}
