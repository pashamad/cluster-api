package network.clusterone.api.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.io.Serializable
import java.time.Instant
import javax.persistence.Column

/**
 * Base abstract class for entities which will hold definitions for created, last modified by, created by,
 * last modified by attributes.
 */
abstract class AbstractAuditingEntity(

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @JsonIgnore
    var createdDate: Instant? = Instant.now(),

    @LastModifiedDate
    @Column(name = "last_modified_date")
    @JsonIgnore
    var lastModifiedDate: Instant? = Instant.now()

) : Serializable {

    companion object {
        private const val serialVersionUID = 1L
    }
}
