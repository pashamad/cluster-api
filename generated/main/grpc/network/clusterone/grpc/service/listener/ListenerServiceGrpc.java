package network.clusterone.grpc.service.listener;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: services/listener/listener.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ListenerServiceGrpc {

  private ListenerServiceGrpc() {}

  public static final String SERVICE_NAME = "listener.ListenerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.AddAddressRequest,
      network.clusterone.grpc.service.listener.AddAddressResponse> getAddAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAddress",
      requestType = network.clusterone.grpc.service.listener.AddAddressRequest.class,
      responseType = network.clusterone.grpc.service.listener.AddAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.AddAddressRequest,
      network.clusterone.grpc.service.listener.AddAddressResponse> getAddAddressMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.AddAddressRequest, network.clusterone.grpc.service.listener.AddAddressResponse> getAddAddressMethod;
    if ((getAddAddressMethod = ListenerServiceGrpc.getAddAddressMethod) == null) {
      synchronized (ListenerServiceGrpc.class) {
        if ((getAddAddressMethod = ListenerServiceGrpc.getAddAddressMethod) == null) {
          ListenerServiceGrpc.getAddAddressMethod = getAddAddressMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.listener.AddAddressRequest, network.clusterone.grpc.service.listener.AddAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.AddAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.AddAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerServiceMethodDescriptorSupplier("AddAddress"))
              .build();
        }
      }
    }
    return getAddAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.AddTransactionRequest,
      network.clusterone.grpc.service.listener.AddTransactionResponse> getAddTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTransaction",
      requestType = network.clusterone.grpc.service.listener.AddTransactionRequest.class,
      responseType = network.clusterone.grpc.service.listener.AddTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.AddTransactionRequest,
      network.clusterone.grpc.service.listener.AddTransactionResponse> getAddTransactionMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.AddTransactionRequest, network.clusterone.grpc.service.listener.AddTransactionResponse> getAddTransactionMethod;
    if ((getAddTransactionMethod = ListenerServiceGrpc.getAddTransactionMethod) == null) {
      synchronized (ListenerServiceGrpc.class) {
        if ((getAddTransactionMethod = ListenerServiceGrpc.getAddTransactionMethod) == null) {
          ListenerServiceGrpc.getAddTransactionMethod = getAddTransactionMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.listener.AddTransactionRequest, network.clusterone.grpc.service.listener.AddTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.AddTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.AddTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerServiceMethodDescriptorSupplier("AddTransaction"))
              .build();
        }
      }
    }
    return getAddTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.TransactionsByAddressRequest,
      network.clusterone.grpc.service.listener.TransactionsByAddressResponse> getTransactionsByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransactionsByAddress",
      requestType = network.clusterone.grpc.service.listener.TransactionsByAddressRequest.class,
      responseType = network.clusterone.grpc.service.listener.TransactionsByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.TransactionsByAddressRequest,
      network.clusterone.grpc.service.listener.TransactionsByAddressResponse> getTransactionsByAddressMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.TransactionsByAddressRequest, network.clusterone.grpc.service.listener.TransactionsByAddressResponse> getTransactionsByAddressMethod;
    if ((getTransactionsByAddressMethod = ListenerServiceGrpc.getTransactionsByAddressMethod) == null) {
      synchronized (ListenerServiceGrpc.class) {
        if ((getTransactionsByAddressMethod = ListenerServiceGrpc.getTransactionsByAddressMethod) == null) {
          ListenerServiceGrpc.getTransactionsByAddressMethod = getTransactionsByAddressMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.listener.TransactionsByAddressRequest, network.clusterone.grpc.service.listener.TransactionsByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransactionsByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.TransactionsByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.TransactionsByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerServiceMethodDescriptorSupplier("TransactionsByAddress"))
              .build();
        }
      }
    }
    return getTransactionsByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.TransactionsByAccountRequest,
      network.clusterone.grpc.service.listener.TransactionsByAccountResponse> getTransactionsByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransactionsByAccount",
      requestType = network.clusterone.grpc.service.listener.TransactionsByAccountRequest.class,
      responseType = network.clusterone.grpc.service.listener.TransactionsByAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.TransactionsByAccountRequest,
      network.clusterone.grpc.service.listener.TransactionsByAccountResponse> getTransactionsByAccountMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.TransactionsByAccountRequest, network.clusterone.grpc.service.listener.TransactionsByAccountResponse> getTransactionsByAccountMethod;
    if ((getTransactionsByAccountMethod = ListenerServiceGrpc.getTransactionsByAccountMethod) == null) {
      synchronized (ListenerServiceGrpc.class) {
        if ((getTransactionsByAccountMethod = ListenerServiceGrpc.getTransactionsByAccountMethod) == null) {
          ListenerServiceGrpc.getTransactionsByAccountMethod = getTransactionsByAccountMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.listener.TransactionsByAccountRequest, network.clusterone.grpc.service.listener.TransactionsByAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransactionsByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.TransactionsByAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.TransactionsByAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerServiceMethodDescriptorSupplier("TransactionsByAccount"))
              .build();
        }
      }
    }
    return getTransactionsByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.GetTxByHashRequest,
      network.clusterone.grpc.service.listener.GetTxByHashResponse> getGetTxByHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTxByHash",
      requestType = network.clusterone.grpc.service.listener.GetTxByHashRequest.class,
      responseType = network.clusterone.grpc.service.listener.GetTxByHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.GetTxByHashRequest,
      network.clusterone.grpc.service.listener.GetTxByHashResponse> getGetTxByHashMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.listener.GetTxByHashRequest, network.clusterone.grpc.service.listener.GetTxByHashResponse> getGetTxByHashMethod;
    if ((getGetTxByHashMethod = ListenerServiceGrpc.getGetTxByHashMethod) == null) {
      synchronized (ListenerServiceGrpc.class) {
        if ((getGetTxByHashMethod = ListenerServiceGrpc.getGetTxByHashMethod) == null) {
          ListenerServiceGrpc.getGetTxByHashMethod = getGetTxByHashMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.listener.GetTxByHashRequest, network.clusterone.grpc.service.listener.GetTxByHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTxByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.GetTxByHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.listener.GetTxByHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListenerServiceMethodDescriptorSupplier("GetTxByHash"))
              .build();
        }
      }
    }
    return getGetTxByHashMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListenerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListenerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListenerServiceStub>() {
        @java.lang.Override
        public ListenerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListenerServiceStub(channel, callOptions);
        }
      };
    return ListenerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListenerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListenerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListenerServiceBlockingStub>() {
        @java.lang.Override
        public ListenerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListenerServiceBlockingStub(channel, callOptions);
        }
      };
    return ListenerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListenerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListenerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListenerServiceFutureStub>() {
        @java.lang.Override
        public ListenerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListenerServiceFutureStub(channel, callOptions);
        }
      };
    return ListenerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ListenerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addAddress(network.clusterone.grpc.service.listener.AddAddressRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.AddAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAddressMethod(), responseObserver);
    }

    /**
     */
    public void addTransaction(network.clusterone.grpc.service.listener.AddTransactionRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.AddTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTransactionMethod(), responseObserver);
    }

    /**
     */
    public void transactionsByAddress(network.clusterone.grpc.service.listener.TransactionsByAddressRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.TransactionsByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionsByAddressMethod(), responseObserver);
    }

    /**
     */
    public void transactionsByAccount(network.clusterone.grpc.service.listener.TransactionsByAccountRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.TransactionsByAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransactionsByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getTxByHash(network.clusterone.grpc.service.listener.GetTxByHashRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.GetTxByHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTxByHashMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.listener.AddAddressRequest,
                network.clusterone.grpc.service.listener.AddAddressResponse>(
                  this, METHODID_ADD_ADDRESS)))
          .addMethod(
            getAddTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.listener.AddTransactionRequest,
                network.clusterone.grpc.service.listener.AddTransactionResponse>(
                  this, METHODID_ADD_TRANSACTION)))
          .addMethod(
            getTransactionsByAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.listener.TransactionsByAddressRequest,
                network.clusterone.grpc.service.listener.TransactionsByAddressResponse>(
                  this, METHODID_TRANSACTIONS_BY_ADDRESS)))
          .addMethod(
            getTransactionsByAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.listener.TransactionsByAccountRequest,
                network.clusterone.grpc.service.listener.TransactionsByAccountResponse>(
                  this, METHODID_TRANSACTIONS_BY_ACCOUNT)))
          .addMethod(
            getGetTxByHashMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.listener.GetTxByHashRequest,
                network.clusterone.grpc.service.listener.GetTxByHashResponse>(
                  this, METHODID_GET_TX_BY_HASH)))
          .build();
    }
  }

  /**
   */
  public static final class ListenerServiceStub extends io.grpc.stub.AbstractAsyncStub<ListenerServiceStub> {
    private ListenerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListenerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListenerServiceStub(channel, callOptions);
    }

    /**
     */
    public void addAddress(network.clusterone.grpc.service.listener.AddAddressRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.AddAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTransaction(network.clusterone.grpc.service.listener.AddTransactionRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.AddTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transactionsByAddress(network.clusterone.grpc.service.listener.TransactionsByAddressRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.TransactionsByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionsByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transactionsByAccount(network.clusterone.grpc.service.listener.TransactionsByAccountRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.TransactionsByAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransactionsByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTxByHash(network.clusterone.grpc.service.listener.GetTxByHashRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.GetTxByHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTxByHashMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ListenerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListenerServiceBlockingStub> {
    private ListenerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListenerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListenerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public network.clusterone.grpc.service.listener.AddAddressResponse addAddress(network.clusterone.grpc.service.listener.AddAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.listener.AddTransactionResponse addTransaction(network.clusterone.grpc.service.listener.AddTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.listener.TransactionsByAddressResponse transactionsByAddress(network.clusterone.grpc.service.listener.TransactionsByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionsByAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.listener.TransactionsByAccountResponse transactionsByAccount(network.clusterone.grpc.service.listener.TransactionsByAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransactionsByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.listener.GetTxByHashResponse getTxByHash(network.clusterone.grpc.service.listener.GetTxByHashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTxByHashMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ListenerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ListenerServiceFutureStub> {
    private ListenerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListenerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListenerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.listener.AddAddressResponse> addAddress(
        network.clusterone.grpc.service.listener.AddAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.listener.AddTransactionResponse> addTransaction(
        network.clusterone.grpc.service.listener.AddTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.listener.TransactionsByAddressResponse> transactionsByAddress(
        network.clusterone.grpc.service.listener.TransactionsByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionsByAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.listener.TransactionsByAccountResponse> transactionsByAccount(
        network.clusterone.grpc.service.listener.TransactionsByAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransactionsByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.listener.GetTxByHashResponse> getTxByHash(
        network.clusterone.grpc.service.listener.GetTxByHashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTxByHashMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ADDRESS = 0;
  private static final int METHODID_ADD_TRANSACTION = 1;
  private static final int METHODID_TRANSACTIONS_BY_ADDRESS = 2;
  private static final int METHODID_TRANSACTIONS_BY_ACCOUNT = 3;
  private static final int METHODID_GET_TX_BY_HASH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ListenerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListenerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ADDRESS:
          serviceImpl.addAddress((network.clusterone.grpc.service.listener.AddAddressRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.AddAddressResponse>) responseObserver);
          break;
        case METHODID_ADD_TRANSACTION:
          serviceImpl.addTransaction((network.clusterone.grpc.service.listener.AddTransactionRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.AddTransactionResponse>) responseObserver);
          break;
        case METHODID_TRANSACTIONS_BY_ADDRESS:
          serviceImpl.transactionsByAddress((network.clusterone.grpc.service.listener.TransactionsByAddressRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.TransactionsByAddressResponse>) responseObserver);
          break;
        case METHODID_TRANSACTIONS_BY_ACCOUNT:
          serviceImpl.transactionsByAccount((network.clusterone.grpc.service.listener.TransactionsByAccountRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.TransactionsByAccountResponse>) responseObserver);
          break;
        case METHODID_GET_TX_BY_HASH:
          serviceImpl.getTxByHash((network.clusterone.grpc.service.listener.GetTxByHashRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.listener.GetTxByHashResponse>) responseObserver);
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

  private static abstract class ListenerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListenerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.clusterone.grpc.service.listener.ListenerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ListenerService");
    }
  }

  private static final class ListenerServiceFileDescriptorSupplier
      extends ListenerServiceBaseDescriptorSupplier {
    ListenerServiceFileDescriptorSupplier() {}
  }

  private static final class ListenerServiceMethodDescriptorSupplier
      extends ListenerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListenerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListenerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListenerServiceFileDescriptorSupplier())
              .addMethod(getAddAddressMethod())
              .addMethod(getAddTransactionMethod())
              .addMethod(getTransactionsByAddressMethod())
              .addMethod(getTransactionsByAccountMethod())
              .addMethod(getGetTxByHashMethod())
              .build();
        }
      }
    }
    return result;
  }
}
