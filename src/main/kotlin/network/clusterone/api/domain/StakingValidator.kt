package network.clusterone.api.domain

class StakingValidator(
    var network: String,
    var account: String,
    var name: String,
    var wwwUrl: String,
    var details: String,
    var avatarUrl: String,
    var softwareVersion: String,
    var dataCenterKey: String,
    var dataCenterHost: String,
    var voteAccount: String,
    var skippedSlotPercent: String,
    var pingTime: String,
    var url: String
) {
}
