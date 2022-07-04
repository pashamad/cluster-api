package network.clusterone.grpc.service.writer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: services/writer/writer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WriterServiceGrpc {

  private WriterServiceGrpc() {}

  public static final String SERVICE_NAME = "writer.WriterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.writer.GetBalanceRequest,
      network.clusterone.grpc.service.writer.GetBalanceResponse> getGetBalanceOfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBalanceOf",
      requestType = network.clusterone.grpc.service.writer.GetBalanceRequest.class,
      responseType = network.clusterone.grpc.service.writer.GetBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.writer.GetBalanceRequest,
      network.clusterone.grpc.service.writer.GetBalanceResponse> getGetBalanceOfMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.writer.GetBalanceRequest, network.clusterone.grpc.service.writer.GetBalanceResponse> getGetBalanceOfMethod;
    if ((getGetBalanceOfMethod = WriterServiceGrpc.getGetBalanceOfMethod) == null) {
      synchronized (WriterServiceGrpc.class) {
        if ((getGetBalanceOfMethod = WriterServiceGrpc.getGetBalanceOfMethod) == null) {
          WriterServiceGrpc.getGetBalanceOfMethod = getGetBalanceOfMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.writer.GetBalanceRequest, network.clusterone.grpc.service.writer.GetBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBalanceOf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.writer.GetBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.writer.GetBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterServiceMethodDescriptorSupplier("GetBalanceOf"))
              .build();
        }
      }
    }
    return getGetBalanceOfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.writer.SendFromToRequest,
      network.clusterone.grpc.service.writer.SendFromToResponse> getSendFromToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendFromTo",
      requestType = network.clusterone.grpc.service.writer.SendFromToRequest.class,
      responseType = network.clusterone.grpc.service.writer.SendFromToResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.writer.SendFromToRequest,
      network.clusterone.grpc.service.writer.SendFromToResponse> getSendFromToMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.writer.SendFromToRequest, network.clusterone.grpc.service.writer.SendFromToResponse> getSendFromToMethod;
    if ((getSendFromToMethod = WriterServiceGrpc.getSendFromToMethod) == null) {
      synchronized (WriterServiceGrpc.class) {
        if ((getSendFromToMethod = WriterServiceGrpc.getSendFromToMethod) == null) {
          WriterServiceGrpc.getSendFromToMethod = getSendFromToMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.writer.SendFromToRequest, network.clusterone.grpc.service.writer.SendFromToResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendFromTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.writer.SendFromToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.writer.SendFromToResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterServiceMethodDescriptorSupplier("SendFromTo"))
              .build();
        }
      }
    }
    return getSendFromToMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WriterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WriterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WriterServiceStub>() {
        @java.lang.Override
        public WriterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WriterServiceStub(channel, callOptions);
        }
      };
    return WriterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WriterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WriterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WriterServiceBlockingStub>() {
        @java.lang.Override
        public WriterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WriterServiceBlockingStub(channel, callOptions);
        }
      };
    return WriterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WriterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WriterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WriterServiceFutureStub>() {
        @java.lang.Override
        public WriterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WriterServiceFutureStub(channel, callOptions);
        }
      };
    return WriterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WriterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBalanceOf(network.clusterone.grpc.service.writer.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.writer.GetBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBalanceOfMethod(), responseObserver);
    }

    /**
     */
    public void sendFromTo(network.clusterone.grpc.service.writer.SendFromToRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.writer.SendFromToResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendFromToMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceOfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.writer.GetBalanceRequest,
                network.clusterone.grpc.service.writer.GetBalanceResponse>(
                  this, METHODID_GET_BALANCE_OF)))
          .addMethod(
            getSendFromToMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.writer.SendFromToRequest,
                network.clusterone.grpc.service.writer.SendFromToResponse>(
                  this, METHODID_SEND_FROM_TO)))
          .build();
    }
  }

  /**
   */
  public static final class WriterServiceStub extends io.grpc.stub.AbstractAsyncStub<WriterServiceStub> {
    private WriterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WriterServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBalanceOf(network.clusterone.grpc.service.writer.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.writer.GetBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBalanceOfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendFromTo(network.clusterone.grpc.service.writer.SendFromToRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.writer.SendFromToResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendFromToMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WriterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WriterServiceBlockingStub> {
    private WriterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WriterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public network.clusterone.grpc.service.writer.GetBalanceResponse getBalanceOf(network.clusterone.grpc.service.writer.GetBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBalanceOfMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.writer.SendFromToResponse sendFromTo(network.clusterone.grpc.service.writer.SendFromToRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendFromToMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WriterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WriterServiceFutureStub> {
    private WriterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WriterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.writer.GetBalanceResponse> getBalanceOf(
        network.clusterone.grpc.service.writer.GetBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBalanceOfMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.writer.SendFromToResponse> sendFromTo(
        network.clusterone.grpc.service.writer.SendFromToRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendFromToMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE_OF = 0;
  private static final int METHODID_SEND_FROM_TO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WriterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WriterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE_OF:
          serviceImpl.getBalanceOf((network.clusterone.grpc.service.writer.GetBalanceRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.writer.GetBalanceResponse>) responseObserver);
          break;
        case METHODID_SEND_FROM_TO:
          serviceImpl.sendFromTo((network.clusterone.grpc.service.writer.SendFromToRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.writer.SendFromToResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WriterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WriterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.clusterone.grpc.service.writer.WriterServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WriterService");
    }
  }

  private static final class WriterServiceFileDescriptorSupplier
      extends WriterServiceBaseDescriptorSupplier {
    WriterServiceFileDescriptorSupplier() {}
  }

  private static final class WriterServiceMethodDescriptorSupplier
      extends WriterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WriterServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WriterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WriterServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceOfMethod())
              .addMethod(getSendFromToMethod())
              .build();
        }
      }
    }
    return result;
  }
}
