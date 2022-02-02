package network.clusterone.api.domain

import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.time.Instant
import java.util.*
import javax.persistence.Column
import javax.validation.constraints.NotNull

@Table("transaction")
class Transaction(

    @Id
    @NaturalId
    var id: UUID? = null,

    @field:NotNull
    var type: String? = null,

    @field:NotNull
    var asset: String? = null,

    @field:NotNull
    var amount: BigDecimal? = null,

    @field:NotNull
    var from: String? = null,

    @field:NotNull
    var to: String? = null,

    @field:NotNull
    var status: String? = null,

    @Column(name = "sent_at", updatable = false)
    @field:NotNull
    var sentAt: Instant? = Instant.now(),

    @Column(name = "confirmed_at", updatable = false)
    var confirmedAt: Instant? = null,

    ): AbstractAuditingEntity() {
}
