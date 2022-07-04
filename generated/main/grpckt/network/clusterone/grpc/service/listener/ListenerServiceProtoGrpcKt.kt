package network.clusterone.grpc.service.listener

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import network.clusterone.grpc.service.listener.ListenerServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for listener.ListenerService.
 */
object ListenerServiceGrpcKt {
  const val SERVICE_NAME: String = ListenerServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ListenerServiceGrpc.getServiceDescriptor()

  val addAddressMethod: MethodDescriptor<AddAddressRequest, AddAddressResponse>
    @JvmStatic
    get() = ListenerServiceGrpc.getAddAddressMethod()

  val addTransactionMethod: MethodDescriptor<AddTransactionRequest, AddTransactionResponse>
    @JvmStatic
    get() = ListenerServiceGrpc.getAddTransactionMethod()

  val transactionsByAddressMethod: MethodDescriptor<TransactionsByAddressRequest,
      TransactionsByAddressResponse>
    @JvmStatic
    get() = ListenerServiceGrpc.getTransactionsByAddressMethod()

  val transactionsByAccountMethod: MethodDescriptor<TransactionsByAccountRequest,
      TransactionsByAccountResponse>
    @JvmStatic
    get() = ListenerServiceGrpc.getTransactionsByAccountMethod()

  val getTxByHashMethod: MethodDescriptor<GetTxByHashRequest, GetTxByHashResponse>
    @JvmStatic
    get() = ListenerServiceGrpc.getGetTxByHashMethod()

  /**
   * A stub for issuing RPCs to a(n) listener.ListenerService service as suspending coroutines.
   */
  @StubFor(ListenerServiceGrpc::class)
  class ListenerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ListenerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ListenerServiceCoroutineStub =
        ListenerServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun addAddress(request: AddAddressRequest, headers: Metadata = Metadata()):
        AddAddressResponse = unaryRpc(
      channel,
      ListenerServiceGrpc.getAddAddressMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun addTransaction(request: AddTransactionRequest, headers: Metadata = Metadata()):
        AddTransactionResponse = unaryRpc(
      channel,
      ListenerServiceGrpc.getAddTransactionMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun transactionsByAddress(request: TransactionsByAddressRequest, headers: Metadata =
        Metadata()): TransactionsByAddressResponse = unaryRpc(
      channel,
      ListenerServiceGrpc.getTransactionsByAddressMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun transactionsByAccount(request: TransactionsByAccountRequest, headers: Metadata =
        Metadata()): TransactionsByAccountResponse = unaryRpc(
      channel,
      ListenerServiceGrpc.getTransactionsByAccountMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun getTxByHash(request: GetTxByHashRequest, headers: Metadata = Metadata()):
        GetTxByHashResponse = unaryRpc(
      channel,
      ListenerServiceGrpc.getGetTxByHashMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the listener.ListenerService service based on Kotlin coroutines.
   */
  abstract class ListenerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for listener.ListenerService.AddAddress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addAddress(request: AddAddressRequest): AddAddressResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method listener.ListenerService.AddAddress is unimplemented"))

    /**
     * Returns the response to an RPC for listener.ListenerService.AddTransaction.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addTransaction(request: AddTransactionRequest): AddTransactionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method listener.ListenerService.AddTransaction is unimplemented"))

    /**
     * Returns the response to an RPC for listener.ListenerService.TransactionsByAddress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun transactionsByAddress(request: TransactionsByAddressRequest):
        TransactionsByAddressResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method listener.ListenerService.TransactionsByAddress is unimplemented"))

    /**
     * Returns the response to an RPC for listener.ListenerService.TransactionsByAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun transactionsByAccount(request: TransactionsByAccountRequest):
        TransactionsByAccountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method listener.ListenerService.TransactionsByAccount is unimplemented"))

    /**
     * Returns the response to an RPC for listener.ListenerService.GetTxByHash.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getTxByHash(request: GetTxByHashRequest): GetTxByHashResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method listener.ListenerService.GetTxByHash is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerServiceGrpc.getAddAddressMethod(),
      implementation = ::addAddress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerServiceGrpc.getAddTransactionMethod(),
      implementation = ::addTransaction
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerServiceGrpc.getTransactionsByAddressMethod(),
      implementation = ::transactionsByAddress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerServiceGrpc.getTransactionsByAccountMethod(),
      implementation = ::transactionsByAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ListenerServiceGrpc.getGetTxByHashMethod(),
      implementation = ::getTxByHash
    )).build()
  }
}
