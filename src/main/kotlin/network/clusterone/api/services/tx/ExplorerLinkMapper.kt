package network.clusterone.api.services.tx

import org.springframework.stereotype.Service

@Service
class ExplorerLinkMapper {

    val txMaps = mapOf(
        "eth" to mapOf(
            "mainnet" to "https://etherscan.io/tx/%s",
            "testnet" to "https://ropsten.etherscan.io/tx/%s"
        ),
        "sol" to mapOf(
            "mainnet" to "https://explorer.solana.com/tx/%s",
            "testnet" to "https://explorer.solana.com/tx/%s?cluster=testnet"
        )
    )

    fun getExplorerLink(txHash: String, net: String, env: String): String {
        return txMaps[net]!![env]!!.format(txHash)
    }
}
