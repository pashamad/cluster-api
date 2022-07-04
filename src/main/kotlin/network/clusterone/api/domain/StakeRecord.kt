package network.clusterone.api.domain

import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.time.Instant
import java.util.*
import javax.persistence.Column
import javax.validation.constraints.NotNull

@Table("stake_record")
class StakeRecord(

    @Id
    @NaturalId
    var id: UUID? = null,

    @field: NotNull
    var amount: BigDecimal,

    @field: NotNull
    var stakeAddress: String,

    var stakeTx: String?,

    var voteAddress: String?,

    var voteTx: String?,

    // var deactivateTx: String?,

    @field: NotNull
    var accountId: UUID,

    @field: NotNull
    var userId: UUID,

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    @field: NotNull
    var createdAt: Instant = Instant.now(),
) {
}
