package network.clusterone.api.domain

import java.math.BigDecimal
import java.util.*

class BalanceMark(
    var time: Date,
    var currency: String,
    var period: String,
    var balance: BigDecimal
) {
}
