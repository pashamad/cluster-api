package network.clusterone.grpc.service.writer

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
import network.clusterone.grpc.service.writer.WriterServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for writer.WriterService.
 */
object WriterServiceGrpcKt {
  const val SERVICE_NAME: String = WriterServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = WriterServiceGrpc.getServiceDescriptor()

  val getBalanceOfMethod: MethodDescriptor<GetBalanceRequest, GetBalanceResponse>
    @JvmStatic
    get() = WriterServiceGrpc.getGetBalanceOfMethod()

  val sendFromToMethod: MethodDescriptor<SendFromToRequest, SendFromToResponse>
    @JvmStatic
    get() = WriterServiceGrpc.getSendFromToMethod()

  /**
   * A stub for issuing RPCs to a(n) writer.WriterService service as suspending coroutines.
   */
  @StubFor(WriterServiceGrpc::class)
  class WriterServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<WriterServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): WriterServiceCoroutineStub =
        WriterServiceCoroutineStub(channel, callOptions)

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
    suspend fun getBalanceOf(request: GetBalanceRequest, headers: Metadata = Metadata()):
        GetBalanceResponse = unaryRpc(
      channel,
      WriterServiceGrpc.getGetBalanceOfMethod(),
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
    suspend fun sendFromTo(request: SendFromToRequest, headers: Metadata = Metadata()):
        SendFromToResponse = unaryRpc(
      channel,
      WriterServiceGrpc.getSendFromToMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the writer.WriterService service based on Kotlin coroutines.
   */
  abstract class WriterServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for writer.WriterService.GetBalanceOf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getBalanceOf(request: GetBalanceRequest): GetBalanceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method writer.WriterService.GetBalanceOf is unimplemented"))

    /**
     * Returns the response to an RPC for writer.WriterService.SendFromTo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun sendFromTo(request: SendFromToRequest): SendFromToResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method writer.WriterService.SendFromTo is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WriterServiceGrpc.getGetBalanceOfMethod(),
      implementation = ::getBalanceOf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WriterServiceGrpc.getSendFromToMethod(),
      implementation = ::sendFromTo
    )).build()
  }
}
