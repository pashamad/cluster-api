package network.clusterone.api.domain

import io.swagger.v3.oas.annotations.media.Schema
import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.util.*
import javax.validation.constraints.NotNull

@Table("account")
class Account(

    @Schema(
        description = "Account ID",
        required = true
    )
    @Id
    @NaturalId
    var id: UUID? = null,

    @Schema(
        description = "Semantic name of the account.",
        example = "My ETH 1", required = true
    )
    @field:NotNull
    var name: String? = null,

    @Schema(
        description = "Name of the account network. Possible values are: [eth, sol]",
        example = "eth", required = true
    )
    @field: NotNull
    var network: String? = null,

    @Schema(
        description = "Account address.",
        required = true
    )
    @field: NotNull
    var address: String? = null,

    @Schema(
        description = "Amount of coins on the account. Maximum precision is defined by a network.",
        example = "123.4567890", required = true
    )
    var balance: BigDecimal? = BigDecimal(0),

    @Schema(
        description = "Account owner ID",
        required = true
    )
    @field: NotNull
    var user_id: UUID,

    @Schema(
        description = "ID of the keystore for this account.",
        required = true
    )
    @field: NotNull
    var keystore_id: UUID,

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", referencedColumnName = "users(id)")
//    @JsonIgnore
//    var user: User? = null,

//    // TODO: this definition throws strange error
//    @ManyToOne
//    @JoinColumn(name = "keystore_id", referencedColumnName = "keystore(id)")
//    @JsonIgnore
//    var keystore: KeyStore? = null

) : AbstractAuditingEntity() {
}
