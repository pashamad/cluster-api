package network.clusterone.api.domain

import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@Table("keystore")
open class KeyStore(

    @Id
    @NaturalId
    var id: UUID? = null,

    @field: NotNull
    var network: String? = null,

    @field: NotNull
    var path: String? = null,

    @field: NotNull
    var address: String? = null,

    @field: NotNull
    var publicKey: String? = null,

    var privateKey: String? = null,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var user: User? = null,

    @ManyToOne
    @JoinColumn(name = "mnemonic_id", referencedColumnName = "id", nullable = true)
    var mnemonic: Mnemonic? = null

) : AbstractAuditingEntity() {
}
