package network.clusterone.api.domain

import java.math.BigDecimal
import java.time.Instant

class StakeDetails(

    var amount: BigDecimal,

    var owner: String,

    var executable: Boolean,

    var rentEpoch: Long,

    var activationStatus: String,

    var stakeAddress: String,

    var withdrawAddress: String,

    var lockupAt: Instant,

    var voteAddress: String,

    var stake: Long,

    var activationEpoch: Long,

    var deactivationEpoch: Long?,

    var warmupCooldownRate: Double,

    var creditsObserved: Long

) {}
