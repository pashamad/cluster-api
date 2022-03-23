package network.clusterone.api.domain

import com.fasterxml.jackson.annotation.JsonIgnore
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
    var id: UUID?,

    @field: NotNull
    var phrase: String,

    @field: NotNull
    var wordCount: Int,

    @field: NotNull
    var lang: String,

    @JsonIgnore
    @field: NotNull
    var seed: String,

    var name: String?,

    @field: NotNull
    var user_id: UUID,

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var user: User? = null

) : AbstractAuditingEntity() {
}
