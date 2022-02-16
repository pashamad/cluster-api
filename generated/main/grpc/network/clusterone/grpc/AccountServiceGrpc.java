package network.clusterone.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: services/account/account.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "account.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.NewMnemonicRequest,
      network.clusterone.grpc.NewMnemonicResponse> getNewMnemonicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewMnemonic",
      requestType = network.clusterone.grpc.NewMnemonicRequest.class,
      responseType = network.clusterone.grpc.NewMnemonicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.NewMnemonicRequest,
      network.clusterone.grpc.NewMnemonicResponse> getNewMnemonicMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.NewMnemonicRequest, network.clusterone.grpc.NewMnemonicResponse> getNewMnemonicMethod;
    if ((getNewMnemonicMethod = AccountServiceGrpc.getNewMnemonicMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getNewMnemonicMethod = AccountServiceGrpc.getNewMnemonicMethod) == null) {
          AccountServiceGrpc.getNewMnemonicMethod = getNewMnemonicMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.NewMnemonicRequest, network.clusterone.grpc.NewMnemonicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewMnemonic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.NewMnemonicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.NewMnemonicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("NewMnemonic"))
              .build();
        }
      }
    }
    return getNewMnemonicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.GetSeedFromMnemonicRequest,
      network.clusterone.grpc.SeedFromMnemonicResponse> getGetSeedFromMnemonicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSeedFromMnemonic",
      requestType = network.clusterone.grpc.GetSeedFromMnemonicRequest.class,
      responseType = network.clusterone.grpc.SeedFromMnemonicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.GetSeedFromMnemonicRequest,
      network.clusterone.grpc.SeedFromMnemonicResponse> getGetSeedFromMnemonicMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.GetSeedFromMnemonicRequest, network.clusterone.grpc.SeedFromMnemonicResponse> getGetSeedFromMnemonicMethod;
    if ((getGetSeedFromMnemonicMethod = AccountServiceGrpc.getGetSeedFromMnemonicMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetSeedFromMnemonicMethod = AccountServiceGrpc.getGetSeedFromMnemonicMethod) == null) {
          AccountServiceGrpc.getGetSeedFromMnemonicMethod = getGetSeedFromMnemonicMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.GetSeedFromMnemonicRequest, network.clusterone.grpc.SeedFromMnemonicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSeedFromMnemonic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.GetSeedFromMnemonicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.SeedFromMnemonicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetSeedFromMnemonic"))
              .build();
        }
      }
    }
    return getGetSeedFromMnemonicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.GetMasterKeyFromMnemonicRequest,
      network.clusterone.grpc.MasterKeyFromMnemonicResponse> getGetMasterKeyFromMnemonicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMasterKeyFromMnemonic",
      requestType = network.clusterone.grpc.GetMasterKeyFromMnemonicRequest.class,
      responseType = network.clusterone.grpc.MasterKeyFromMnemonicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.GetMasterKeyFromMnemonicRequest,
      network.clusterone.grpc.MasterKeyFromMnemonicResponse> getGetMasterKeyFromMnemonicMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.GetMasterKeyFromMnemonicRequest, network.clusterone.grpc.MasterKeyFromMnemonicResponse> getGetMasterKeyFromMnemonicMethod;
    if ((getGetMasterKeyFromMnemonicMethod = AccountServiceGrpc.getGetMasterKeyFromMnemonicMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetMasterKeyFromMnemonicMethod = AccountServiceGrpc.getGetMasterKeyFromMnemonicMethod) == null) {
          AccountServiceGrpc.getGetMasterKeyFromMnemonicMethod = getGetMasterKeyFromMnemonicMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.GetMasterKeyFromMnemonicRequest, network.clusterone.grpc.MasterKeyFromMnemonicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMasterKeyFromMnemonic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.GetMasterKeyFromMnemonicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.MasterKeyFromMnemonicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetMasterKeyFromMnemonic"))
              .build();
        }
      }
    }
    return getGetMasterKeyFromMnemonicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.SeedDeriveToAddressHexRequest,
      network.clusterone.grpc.SeedDeriveToAddressHexResponse> getSeedDeriveToPublicKeyHexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SeedDeriveToPublicKeyHex",
      requestType = network.clusterone.grpc.SeedDeriveToAddressHexRequest.class,
      responseType = network.clusterone.grpc.SeedDeriveToAddressHexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.SeedDeriveToAddressHexRequest,
      network.clusterone.grpc.SeedDeriveToAddressHexResponse> getSeedDeriveToPublicKeyHexMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.SeedDeriveToAddressHexRequest, network.clusterone.grpc.SeedDeriveToAddressHexResponse> getSeedDeriveToPublicKeyHexMethod;
    if ((getSeedDeriveToPublicKeyHexMethod = AccountServiceGrpc.getSeedDeriveToPublicKeyHexMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSeedDeriveToPublicKeyHexMethod = AccountServiceGrpc.getSeedDeriveToPublicKeyHexMethod) == null) {
          AccountServiceGrpc.getSeedDeriveToPublicKeyHexMethod = getSeedDeriveToPublicKeyHexMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.SeedDeriveToAddressHexRequest, network.clusterone.grpc.SeedDeriveToAddressHexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SeedDeriveToPublicKeyHex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.SeedDeriveToAddressHexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.SeedDeriveToAddressHexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SeedDeriveToPublicKeyHex"))
              .build();
        }
      }
    }
    return getSeedDeriveToPublicKeyHexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.SeedDeriveToAddressHexRequest,
      network.clusterone.grpc.SeedDeriveToAddressHexResponse> getSeedDeriveToPrivateKeyHexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SeedDeriveToPrivateKeyHex",
      requestType = network.clusterone.grpc.SeedDeriveToAddressHexRequest.class,
      responseType = network.clusterone.grpc.SeedDeriveToAddressHexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.SeedDeriveToAddressHexRequest,
      network.clusterone.grpc.SeedDeriveToAddressHexResponse> getSeedDeriveToPrivateKeyHexMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.SeedDeriveToAddressHexRequest, network.clusterone.grpc.SeedDeriveToAddressHexResponse> getSeedDeriveToPrivateKeyHexMethod;
    if ((getSeedDeriveToPrivateKeyHexMethod = AccountServiceGrpc.getSeedDeriveToPrivateKeyHexMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSeedDeriveToPrivateKeyHexMethod = AccountServiceGrpc.getSeedDeriveToPrivateKeyHexMethod) == null) {
          AccountServiceGrpc.getSeedDeriveToPrivateKeyHexMethod = getSeedDeriveToPrivateKeyHexMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.SeedDeriveToAddressHexRequest, network.clusterone.grpc.SeedDeriveToAddressHexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SeedDeriveToPrivateKeyHex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.SeedDeriveToAddressHexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.SeedDeriveToAddressHexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SeedDeriveToPrivateKeyHex"))
              .build();
        }
      }
    }
    return getSeedDeriveToPrivateKeyHexMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void newMnemonic(network.clusterone.grpc.NewMnemonicRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.NewMnemonicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewMnemonicMethod(), responseObserver);
    }

    /**
     */
    public void getSeedFromMnemonic(network.clusterone.grpc.GetSeedFromMnemonicRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedFromMnemonicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSeedFromMnemonicMethod(), responseObserver);
    }

    /**
     */
    public void getMasterKeyFromMnemonic(network.clusterone.grpc.GetMasterKeyFromMnemonicRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.MasterKeyFromMnemonicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMasterKeyFromMnemonicMethod(), responseObserver);
    }

    /**
     */
    public void seedDeriveToPublicKeyHex(network.clusterone.grpc.SeedDeriveToAddressHexRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedDeriveToAddressHexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSeedDeriveToPublicKeyHexMethod(), responseObserver);
    }

    /**
     */
    public void seedDeriveToPrivateKeyHex(network.clusterone.grpc.SeedDeriveToAddressHexRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedDeriveToAddressHexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSeedDeriveToPrivateKeyHexMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewMnemonicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.NewMnemonicRequest,
                network.clusterone.grpc.NewMnemonicResponse>(
                  this, METHODID_NEW_MNEMONIC)))
          .addMethod(
            getGetSeedFromMnemonicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.GetSeedFromMnemonicRequest,
                network.clusterone.grpc.SeedFromMnemonicResponse>(
                  this, METHODID_GET_SEED_FROM_MNEMONIC)))
          .addMethod(
            getGetMasterKeyFromMnemonicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.GetMasterKeyFromMnemonicRequest,
                network.clusterone.grpc.MasterKeyFromMnemonicResponse>(
                  this, METHODID_GET_MASTER_KEY_FROM_MNEMONIC)))
          .addMethod(
            getSeedDeriveToPublicKeyHexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.SeedDeriveToAddressHexRequest,
                network.clusterone.grpc.SeedDeriveToAddressHexResponse>(
                  this, METHODID_SEED_DERIVE_TO_PUBLIC_KEY_HEX)))
          .addMethod(
            getSeedDeriveToPrivateKeyHexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.SeedDeriveToAddressHexRequest,
                network.clusterone.grpc.SeedDeriveToAddressHexResponse>(
                  this, METHODID_SEED_DERIVE_TO_PRIVATE_KEY_HEX)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void newMnemonic(network.clusterone.grpc.NewMnemonicRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.NewMnemonicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewMnemonicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSeedFromMnemonic(network.clusterone.grpc.GetSeedFromMnemonicRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedFromMnemonicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSeedFromMnemonicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMasterKeyFromMnemonic(network.clusterone.grpc.GetMasterKeyFromMnemonicRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.MasterKeyFromMnemonicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMasterKeyFromMnemonicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seedDeriveToPublicKeyHex(network.clusterone.grpc.SeedDeriveToAddressHexRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedDeriveToAddressHexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSeedDeriveToPublicKeyHexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seedDeriveToPrivateKeyHex(network.clusterone.grpc.SeedDeriveToAddressHexRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedDeriveToAddressHexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSeedDeriveToPrivateKeyHexMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public network.clusterone.grpc.NewMnemonicResponse newMnemonic(network.clusterone.grpc.NewMnemonicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewMnemonicMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.SeedFromMnemonicResponse getSeedFromMnemonic(network.clusterone.grpc.GetSeedFromMnemonicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSeedFromMnemonicMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.MasterKeyFromMnemonicResponse getMasterKeyFromMnemonic(network.clusterone.grpc.GetMasterKeyFromMnemonicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMasterKeyFromMnemonicMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.SeedDeriveToAddressHexResponse seedDeriveToPublicKeyHex(network.clusterone.grpc.SeedDeriveToAddressHexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSeedDeriveToPublicKeyHexMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.SeedDeriveToAddressHexResponse seedDeriveToPrivateKeyHex(network.clusterone.grpc.SeedDeriveToAddressHexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSeedDeriveToPrivateKeyHexMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.NewMnemonicResponse> newMnemonic(
        network.clusterone.grpc.NewMnemonicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewMnemonicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.SeedFromMnemonicResponse> getSeedFromMnemonic(
        network.clusterone.grpc.GetSeedFromMnemonicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSeedFromMnemonicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.MasterKeyFromMnemonicResponse> getMasterKeyFromMnemonic(
        network.clusterone.grpc.GetMasterKeyFromMnemonicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMasterKeyFromMnemonicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.SeedDeriveToAddressHexResponse> seedDeriveToPublicKeyHex(
        network.clusterone.grpc.SeedDeriveToAddressHexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSeedDeriveToPublicKeyHexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.SeedDeriveToAddressHexResponse> seedDeriveToPrivateKeyHex(
        network.clusterone.grpc.SeedDeriveToAddressHexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSeedDeriveToPrivateKeyHexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_MNEMONIC = 0;
  private static final int METHODID_GET_SEED_FROM_MNEMONIC = 1;
  private static final int METHODID_GET_MASTER_KEY_FROM_MNEMONIC = 2;
  private static final int METHODID_SEED_DERIVE_TO_PUBLIC_KEY_HEX = 3;
  private static final int METHODID_SEED_DERIVE_TO_PRIVATE_KEY_HEX = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_MNEMONIC:
          serviceImpl.newMnemonic((network.clusterone.grpc.NewMnemonicRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.NewMnemonicResponse>) responseObserver);
          break;
        case METHODID_GET_SEED_FROM_MNEMONIC:
          serviceImpl.getSeedFromMnemonic((network.clusterone.grpc.GetSeedFromMnemonicRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedFromMnemonicResponse>) responseObserver);
          break;
        case METHODID_GET_MASTER_KEY_FROM_MNEMONIC:
          serviceImpl.getMasterKeyFromMnemonic((network.clusterone.grpc.GetMasterKeyFromMnemonicRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.MasterKeyFromMnemonicResponse>) responseObserver);
          break;
        case METHODID_SEED_DERIVE_TO_PUBLIC_KEY_HEX:
          serviceImpl.seedDeriveToPublicKeyHex((network.clusterone.grpc.SeedDeriveToAddressHexRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedDeriveToAddressHexResponse>) responseObserver);
          break;
        case METHODID_SEED_DERIVE_TO_PRIVATE_KEY_HEX:
          serviceImpl.seedDeriveToPrivateKeyHex((network.clusterone.grpc.SeedDeriveToAddressHexRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.SeedDeriveToAddressHexResponse>) responseObserver);
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

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.clusterone.grpc.AccountServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getNewMnemonicMethod())
              .addMethod(getGetSeedFromMnemonicMethod())
              .addMethod(getGetMasterKeyFromMnemonicMethod())
              .addMethod(getSeedDeriveToPublicKeyHexMethod())
              .addMethod(getSeedDeriveToPrivateKeyHexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
