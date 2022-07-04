package network.clusterone.api.domain

import com.fasterxml.jackson.annotation.JsonIgnore
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
    var network: String,

    @field: NotNull
    var path: String,

    @field: NotNull
    var address: String,

    @field: NotNull
    var publicKey: String,

    var privateKey: String? = null,

    @field: NotNull
    var userId: UUID,

    var mnemonicId: UUID? = null,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    var user: User? = null,

    @ManyToOne
    @JoinColumn(name = "mnemonic_id", referencedColumnName = "id", nullable = true)
    @JsonIgnore
    var mnemonic: Mnemonic? = null

) : AbstractAuditingEntity() {
}
