package network.clusterone.api.repository

import network.clusterone.api.domain.StakeRecord
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import java.util.*

@Repository
interface StakingRecordRepository : R2dbcRepository<StakeRecord, UUID> {

    @Query("SELECT * FROM stake_record WHERE account_id = :accId")
    fun findAllByAccountId(accId: UUID): Flux<StakeRecord>

    @Query("SELECT * FROM stake_record WHERE account_id = :accId OFFSET :from LIMIT :limit")
    fun findByAccountId(accId: UUID, from: Int, limit: Int): Flux<StakeRecord>

    @Query("SELECT * FROM stake_record WHERE user_id = :userId OFFSET :from LIMIT :limit")
    fun findByUserId(userId: UUID, from: Int, limit: Int): Flux<StakeRecord>
}
