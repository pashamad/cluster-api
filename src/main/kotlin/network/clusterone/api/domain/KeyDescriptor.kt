package network.clusterone.api.domain

import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*
import javax.validation.constraints.NotNull

@Table("key_desc")
open class KeyDescriptor(

    @Id
    @NaturalId
    var id: UUID? = null,

    @field:NotNull
    var name: String? = null,

    @field: NotNull
    var network: String? = null,

    @field: NotNull
    var address: String? = null,

    var mnemonic: String? = null,

    // TODO: must be binary data field
    var keystore: String? = null

) : AbstractAuditingEntity() {
}
