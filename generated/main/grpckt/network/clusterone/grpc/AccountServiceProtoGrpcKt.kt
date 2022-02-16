package network.clusterone.grpc

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
import network.clusterone.grpc.AccountServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for account.AccountService.
 */
object AccountServiceGrpcKt {
  const val SERVICE_NAME: String = AccountServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AccountServiceGrpc.getServiceDescriptor()

  val newMnemonicMethod: MethodDescriptor<NewMnemonicRequest, NewMnemonicResponse>
    @JvmStatic
    get() = AccountServiceGrpc.getNewMnemonicMethod()

  val getSeedFromMnemonicMethod: MethodDescriptor<GetSeedFromMnemonicRequest,
      SeedFromMnemonicResponse>
    @JvmStatic
    get() = AccountServiceGrpc.getGetSeedFromMnemonicMethod()

  val getMasterKeyFromMnemonicMethod: MethodDescriptor<GetMasterKeyFromMnemonicRequest,
      MasterKeyFromMnemonicResponse>
    @JvmStatic
    get() = AccountServiceGrpc.getGetMasterKeyFromMnemonicMethod()

  val seedDeriveToPublicKeyHexMethod: MethodDescriptor<SeedDeriveToAddressHexRequest,
      SeedDeriveToAddressHexResponse>
    @JvmStatic
    get() = AccountServiceGrpc.getSeedDeriveToPublicKeyHexMethod()

  val seedDeriveToPrivateKeyHexMethod: MethodDescriptor<SeedDeriveToAddressHexRequest,
      SeedDeriveToAddressHexResponse>
    @JvmStatic
    get() = AccountServiceGrpc.getSeedDeriveToPrivateKeyHexMethod()

  val seedDeriveToAccountDataMethod: MethodDescriptor<SeedDeriveToAccountRequest,
      SeedDeriveToAccountResponse>
    @JvmStatic
    get() = AccountServiceGrpc.getSeedDeriveToAccountDataMethod()

  /**
   * A stub for issuing RPCs to a(n) account.AccountService service as suspending coroutines.
   */
  @StubFor(AccountServiceGrpc::class)
  class AccountServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AccountServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AccountServiceCoroutineStub =
        AccountServiceCoroutineStub(channel, callOptions)

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
    suspend fun newMnemonic(request: NewMnemonicRequest, headers: Metadata = Metadata()):
        NewMnemonicResponse = unaryRpc(
      channel,
      AccountServiceGrpc.getNewMnemonicMethod(),
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
    suspend fun getSeedFromMnemonic(request: GetSeedFromMnemonicRequest, headers: Metadata =
        Metadata()): SeedFromMnemonicResponse = unaryRpc(
      channel,
      AccountServiceGrpc.getGetSeedFromMnemonicMethod(),
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
    suspend fun getMasterKeyFromMnemonic(request: GetMasterKeyFromMnemonicRequest, headers: Metadata
        = Metadata()): MasterKeyFromMnemonicResponse = unaryRpc(
      channel,
      AccountServiceGrpc.getGetMasterKeyFromMnemonicMethod(),
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
    suspend fun seedDeriveToPublicKeyHex(request: SeedDeriveToAddressHexRequest, headers: Metadata =
        Metadata()): SeedDeriveToAddressHexResponse = unaryRpc(
      channel,
      AccountServiceGrpc.getSeedDeriveToPublicKeyHexMethod(),
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
    suspend fun seedDeriveToPrivateKeyHex(request: SeedDeriveToAddressHexRequest, headers: Metadata
        = Metadata()): SeedDeriveToAddressHexResponse = unaryRpc(
      channel,
      AccountServiceGrpc.getSeedDeriveToPrivateKeyHexMethod(),
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
    suspend fun seedDeriveToAccountData(request: SeedDeriveToAccountRequest, headers: Metadata =
        Metadata()): SeedDeriveToAccountResponse = unaryRpc(
      channel,
      AccountServiceGrpc.getSeedDeriveToAccountDataMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the account.AccountService service based on Kotlin coroutines.
   */
  abstract class AccountServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for account.AccountService.NewMnemonic.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun newMnemonic(request: NewMnemonicRequest): NewMnemonicResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method account.AccountService.NewMnemonic is unimplemented"))

    /**
     * Returns the response to an RPC for account.AccountService.GetSeedFromMnemonic.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getSeedFromMnemonic(request: GetSeedFromMnemonicRequest):
        SeedFromMnemonicResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method account.AccountService.GetSeedFromMnemonic is unimplemented"))

    /**
     * Returns the response to an RPC for account.AccountService.GetMasterKeyFromMnemonic.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getMasterKeyFromMnemonic(request: GetMasterKeyFromMnemonicRequest):
        MasterKeyFromMnemonicResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method account.AccountService.GetMasterKeyFromMnemonic is unimplemented"))

    /**
     * Returns the response to an RPC for account.AccountService.SeedDeriveToPublicKeyHex.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun seedDeriveToPublicKeyHex(request: SeedDeriveToAddressHexRequest):
        SeedDeriveToAddressHexResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method account.AccountService.SeedDeriveToPublicKeyHex is unimplemented"))

    /**
     * Returns the response to an RPC for account.AccountService.SeedDeriveToPrivateKeyHex.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun seedDeriveToPrivateKeyHex(request: SeedDeriveToAddressHexRequest):
        SeedDeriveToAddressHexResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method account.AccountService.SeedDeriveToPrivateKeyHex is unimplemented"))

    /**
     * Returns the response to an RPC for account.AccountService.SeedDeriveToAccountData.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun seedDeriveToAccountData(request: SeedDeriveToAccountRequest):
        SeedDeriveToAccountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method account.AccountService.SeedDeriveToAccountData is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getNewMnemonicMethod(),
      implementation = ::newMnemonic
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getGetSeedFromMnemonicMethod(),
      implementation = ::getSeedFromMnemonic
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getGetMasterKeyFromMnemonicMethod(),
      implementation = ::getMasterKeyFromMnemonic
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getSeedDeriveToPublicKeyHexMethod(),
      implementation = ::seedDeriveToPublicKeyHex
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getSeedDeriveToPrivateKeyHexMethod(),
      implementation = ::seedDeriveToPrivateKeyHex
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getSeedDeriveToAccountDataMethod(),
      implementation = ::seedDeriveToAccountData
    )).build()
  }
}
