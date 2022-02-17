package network.clusterone.api.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.util.*
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull

@Table("wallet")
open class Wallet(

    @Id
    @NaturalId
    @JsonIgnore
    var id: UUID? = null,

    @field:NotNull
    var totalBalance: BigDecimal? = BigDecimal(0),

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    var user: User? = null

): AbstractAuditingEntity() {
}
