package network.clusterone.grpc.service.staking

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
import network.clusterone.grpc.service.staking.SolanaStakeServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for solana_stake.SolanaStakeService.
 */
object SolanaStakeServiceGrpcKt {
  const val SERVICE_NAME: String = SolanaStakeServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = SolanaStakeServiceGrpc.getServiceDescriptor()

  val validatorInfoMethod: MethodDescriptor<ValidatorInfoRequest, ValidatorInfoResponse>
    @JvmStatic
    get() = SolanaStakeServiceGrpc.getValidatorInfoMethod()

  val validatorsListMethod: MethodDescriptor<ValidatorsListRequest, ValidatorsListResponse>
    @JvmStatic
    get() = SolanaStakeServiceGrpc.getValidatorsListMethod()

  val createStakeAccountMethod: MethodDescriptor<CreateStakeAccountRequest,
      CreateStakeAccountResponse>
    @JvmStatic
    get() = SolanaStakeServiceGrpc.getCreateStakeAccountMethod()

  val delegateStakeMethod: MethodDescriptor<DelegateStakeRequest, DelegateStakeResponse>
    @JvmStatic
    get() = SolanaStakeServiceGrpc.getDelegateStakeMethod()

  val deactivateStakeMethod: MethodDescriptor<DeactivateStakeRequest, DeactivateStakeResponse>
    @JvmStatic
    get() = SolanaStakeServiceGrpc.getDeactivateStakeMethod()

  val stakeActivationStatusMethod: MethodDescriptor<StakeActivationStatusRequest,
      StakeActivationStatusResponse>
    @JvmStatic
    get() = SolanaStakeServiceGrpc.getStakeActivationStatusMethod()

  val stakeAccountInfoMethod: MethodDescriptor<StakeAccountInfoRequest, StakeAccountInfoResponse>
    @JvmStatic
    get() = SolanaStakeServiceGrpc.getStakeAccountInfoMethod()

  /**
   * A stub for issuing RPCs to a(n) solana_stake.SolanaStakeService service as suspending
   * coroutines.
   */
  @StubFor(SolanaStakeServiceGrpc::class)
  class SolanaStakeServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<SolanaStakeServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SolanaStakeServiceCoroutineStub
        = SolanaStakeServiceCoroutineStub(channel, callOptions)

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
    suspend fun validatorInfo(request: ValidatorInfoRequest, headers: Metadata = Metadata()):
        ValidatorInfoResponse = unaryRpc(
      channel,
      SolanaStakeServiceGrpc.getValidatorInfoMethod(),
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
    suspend fun validatorsList(request: ValidatorsListRequest, headers: Metadata = Metadata()):
        ValidatorsListResponse = unaryRpc(
      channel,
      SolanaStakeServiceGrpc.getValidatorsListMethod(),
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
    suspend fun createStakeAccount(request: CreateStakeAccountRequest, headers: Metadata =
        Metadata()): CreateStakeAccountResponse = unaryRpc(
      channel,
      SolanaStakeServiceGrpc.getCreateStakeAccountMethod(),
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
    suspend fun delegateStake(request: DelegateStakeRequest, headers: Metadata = Metadata()):
        DelegateStakeResponse = unaryRpc(
      channel,
      SolanaStakeServiceGrpc.getDelegateStakeMethod(),
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
    suspend fun deactivateStake(request: DeactivateStakeRequest, headers: Metadata = Metadata()):
        DeactivateStakeResponse = unaryRpc(
      channel,
      SolanaStakeServiceGrpc.getDeactivateStakeMethod(),
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
    suspend fun stakeActivationStatus(request: StakeActivationStatusRequest, headers: Metadata =
        Metadata()): StakeActivationStatusResponse = unaryRpc(
      channel,
      SolanaStakeServiceGrpc.getStakeActivationStatusMethod(),
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
    suspend fun stakeAccountInfo(request: StakeAccountInfoRequest, headers: Metadata = Metadata()):
        StakeAccountInfoResponse = unaryRpc(
      channel,
      SolanaStakeServiceGrpc.getStakeAccountInfoMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the solana_stake.SolanaStakeService service based on Kotlin
   * coroutines.
   */
  abstract class SolanaStakeServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for solana_stake.SolanaStakeService.ValidatorInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun validatorInfo(request: ValidatorInfoRequest): ValidatorInfoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method solana_stake.SolanaStakeService.ValidatorInfo is unimplemented"))

    /**
     * Returns the response to an RPC for solana_stake.SolanaStakeService.ValidatorsList.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun validatorsList(request: ValidatorsListRequest): ValidatorsListResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method solana_stake.SolanaStakeService.ValidatorsList is unimplemented"))

    /**
     * Returns the response to an RPC for solana_stake.SolanaStakeService.CreateStakeAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createStakeAccount(request: CreateStakeAccountRequest):
        CreateStakeAccountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method solana_stake.SolanaStakeService.CreateStakeAccount is unimplemented"))

    /**
     * Returns the response to an RPC for solana_stake.SolanaStakeService.DelegateStake.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun delegateStake(request: DelegateStakeRequest): DelegateStakeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method solana_stake.SolanaStakeService.DelegateStake is unimplemented"))

    /**
     * Returns the response to an RPC for solana_stake.SolanaStakeService.DeactivateStake.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deactivateStake(request: DeactivateStakeRequest): DeactivateStakeResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method solana_stake.SolanaStakeService.DeactivateStake is unimplemented"))

    /**
     * Returns the response to an RPC for solana_stake.SolanaStakeService.StakeActivationStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun stakeActivationStatus(request: StakeActivationStatusRequest):
        StakeActivationStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method solana_stake.SolanaStakeService.StakeActivationStatus is unimplemented"))

    /**
     * Returns the response to an RPC for solana_stake.SolanaStakeService.StakeAccountInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun stakeAccountInfo(request: StakeAccountInfoRequest): StakeAccountInfoResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method solana_stake.SolanaStakeService.StakeAccountInfo is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SolanaStakeServiceGrpc.getValidatorInfoMethod(),
      implementation = ::validatorInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SolanaStakeServiceGrpc.getValidatorsListMethod(),
      implementation = ::validatorsList
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SolanaStakeServiceGrpc.getCreateStakeAccountMethod(),
      implementation = ::createStakeAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SolanaStakeServiceGrpc.getDelegateStakeMethod(),
      implementation = ::delegateStake
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SolanaStakeServiceGrpc.getDeactivateStakeMethod(),
      implementation = ::deactivateStake
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SolanaStakeServiceGrpc.getStakeActivationStatusMethod(),
      implementation = ::stakeActivationStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SolanaStakeServiceGrpc.getStakeAccountInfoMethod(),
      implementation = ::stakeAccountInfo
    )).build()
  }
}
