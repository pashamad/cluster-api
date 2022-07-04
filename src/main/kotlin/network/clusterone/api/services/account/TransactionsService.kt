package network.clusterone.api.services.account

import kotlinx.coroutines.runBlocking
import network.clusterone.api.domain.Account
import network.clusterone.api.domain.Transaction
import network.clusterone.api.grpc.listener.ListenerGrpcClient
import network.clusterone.api.grpc.writer.WriterGrpcClient
import network.clusterone.api.repository.AccountRepository
import network.clusterone.api.repository.TransactionRepository
import network.clusterone.api.services.tx.ExplorerLinkMapper
import org.slf4j.Logger
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.security.Principal
import java.time.Instant
import java.util.*

@Service
class TransactionsService(
    val logger: Logger,
    val accountRepository: AccountRepository,
    val txRepository: TransactionRepository,
    val listener: ListenerGrpcClient,
    val writer: WriterGrpcClient,
    val explorer: ExplorerLinkMapper
) {

    fun getTransactionsByAccount(principal: Principal, accId: UUID, from: Int, limit: Int): Flux<Transaction> {
        return accountRepository.findByEmailAndId(principal.name, accId)
            .flatMapMany {
                getTransactionsByAccount(it!!, from, limit)
            }
    }

    fun getTransactionsByAccount(acc: Account, from: Int, limit: Int): Flux<Transaction> {
        return Mono.just(acc)
            .map {
                runBlocking { listener.getTransactionsByAddress(it.network, it.address, from, limit) }
            }
            .flatMapMany { mergeTransactions(it, acc) }
    }

    fun getTransactionById(principal: Principal, id: UUID): Mono<Transaction?> {
        return txRepository.findByIdAndEmail(id, principal.name)
            .map { it!! }
            // .flatMap(this::refreshTxStatus)
    }

    fun getTransactionByHash(principal: Principal, hash: String): Mono<Transaction?> {
        return txRepository.findByHashAndEmail(hash, principal.name)
    }

    private fun mapTransaction(
        tx: network.clusterone.grpc.messages.types.Transaction,
        acc: Account
    ): Transaction {
        val type = if (acc.address.compareTo(tx.fromAddr) == 0) "send" else "receive"
        val createdAt = Instant.ofEpochSecond(tx.createdAt)
        return Transaction(
            null,
            type,
            acc.network,
            tx.txHash,
            tx.amount.toBigDecimal(),
            tx.fee.toBigDecimal(),
            tx.fromAddr,
            tx.toAddr,
            tx.status.toString(),
            explorer.getExplorerLink(tx.txHash, acc.network, "testnet"), // TODO: get network type from configuration
            createdAt, createdAt,
            acc.id!!,
            acc.user_id,
        )
    }

    private fun mergeTransactions(
        list: List<network.clusterone.grpc.messages.types.Transaction>,
        acc: Account
    ): Flux<Transaction> {

        if (list.isEmpty()) {
            return Flux.empty()
        }

        return txRepository.findListByHashes(list.map { it.txHash }, acc.id!!)
            .collectList()
            .flatMapMany { stored ->
                Flux.fromIterable(list)
                    .flatMap { src ->
                        processTransaction(src, stored.firstOrNull { src.txHash == it.hash }, acc)
                    }
            }
    }

    private fun processTransaction(
        src: network.clusterone.grpc.messages.types.Transaction,
        tx: Transaction?,
        acc: Account
    ): Mono<Transaction> {
        return if (tx == null) txRepository.save(mapTransaction(src, acc))
        else if (src.status.toString() != tx.status) {
            tx.status = src.status.toString()
            tx.fee = src.fee.toBigDecimal()
            txRepository.save(tx)
        } else Mono.just(tx)
    }

    /*private fun refreshTxStatus(tx: Transaction): Mono<Transaction> {
        if (arrayOf("FINALIZED", "FAILED").any { it in tx.status }) {
            return Mono.just(tx)
        }

        val status = runBlocking { writer.getTxStatus(tx.asset, tx.hash) }
        return if (status == tx.status) Mono.just(tx)
        else Mono.just(tx).map {
            // TODO: fix status update or replace with a new method
            // it.status = status;
            it
        }
            .flatMap {
                // txRepository.save(it)
                Mono.just(it)
            }
    }*/
}
