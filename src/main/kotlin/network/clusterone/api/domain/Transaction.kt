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
    var type: String,

    @field:NotNull
    var asset: String,

    @field:NotNull
    var hash: String,

    @field:NotNull
    var amount: BigDecimal,

    @Column(name = "from_addr")
    @field:NotNull
    var fromAddr: String,

    @Column(name = "to_addr")
    @field:NotNull
    var toAddr: String,

    @field:NotNull
    var status: String,

    @Column(name = "created_at", updatable = false)
    @field:NotNull
    var createdAt: Instant = Instant.now(),

    @Column(name = "confirmed_at", updatable = false)
    var confirmedAt: Instant? = null,

    @field: NotNull
    var account_id: UUID,

    @field: NotNull
    var user_id: UUID,

//    @ManyToOne
//    @JoinColumn(name = "account_id", referencedColumnName = "id")
//    @JsonIgnore
//    var account: Account? = null,
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    @JsonIgnore
//    var user: User? = null,

    ) {}
