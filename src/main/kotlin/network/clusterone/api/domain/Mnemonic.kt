package network.clusterone.api.domain

import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@Table("mnemonic")
open class Mnemonic(

    @Id
    @NaturalId
    var id: UUID? = null,

    @field: NotNull
    var phrase: String? = null,

    @field: NotNull
    var wordCount: Int,

    @field: NotNull
    var seed: String,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var user: User? = null,

) : AbstractAuditingEntity() {
}
