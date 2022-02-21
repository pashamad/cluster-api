package network.clusterone.api.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.v3.oas.annotations.media.Schema
import org.hibernate.annotations.NaturalId
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant
import java.util.*
import javax.persistence.Column
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@Table("reset_pass_session")
class ResetPassSession(
    @Schema(
        description = "Session ID",
        required = true
    )
    @Id
    @NaturalId
    var id: UUID? = null,

    @field:NotNull
    @JsonIgnore
    var code: String,

    @field:NotNull
    @JsonIgnore
    var token: String,

    @Schema(
        description = "Session owner ID",
        required = true
    )
    @field: NotNull
    var user_id: UUID,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "users(id)")
    @JsonIgnore
    var user: User? = null,

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @field: NotNull
    var createdDate: Instant = Instant.now(),

    @Column(name = "valid_till", updatable = false)
    @field: NotNull
    var validTill: Instant = Instant.now().plusSeconds(15 * 60) // todo: config
) {
}
