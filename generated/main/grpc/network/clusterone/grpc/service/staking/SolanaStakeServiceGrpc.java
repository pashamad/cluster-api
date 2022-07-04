package network.clusterone.grpc.service.staking;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: services/staking/staking.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SolanaStakeServiceGrpc {

  private SolanaStakeServiceGrpc() {}

  public static final String SERVICE_NAME = "solana_stake.SolanaStakeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.ValidatorInfoRequest,
      network.clusterone.grpc.service.staking.ValidatorInfoResponse> getValidatorInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorInfo",
      requestType = network.clusterone.grpc.service.staking.ValidatorInfoRequest.class,
      responseType = network.clusterone.grpc.service.staking.ValidatorInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.ValidatorInfoRequest,
      network.clusterone.grpc.service.staking.ValidatorInfoResponse> getValidatorInfoMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.ValidatorInfoRequest, network.clusterone.grpc.service.staking.ValidatorInfoResponse> getValidatorInfoMethod;
    if ((getValidatorInfoMethod = SolanaStakeServiceGrpc.getValidatorInfoMethod) == null) {
      synchronized (SolanaStakeServiceGrpc.class) {
        if ((getValidatorInfoMethod = SolanaStakeServiceGrpc.getValidatorInfoMethod) == null) {
          SolanaStakeServiceGrpc.getValidatorInfoMethod = getValidatorInfoMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.staking.ValidatorInfoRequest, network.clusterone.grpc.service.staking.ValidatorInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.ValidatorInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.ValidatorInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SolanaStakeServiceMethodDescriptorSupplier("ValidatorInfo"))
              .build();
        }
      }
    }
    return getValidatorInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.ValidatorsListRequest,
      network.clusterone.grpc.service.staking.ValidatorsListResponse> getValidatorsListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorsList",
      requestType = network.clusterone.grpc.service.staking.ValidatorsListRequest.class,
      responseType = network.clusterone.grpc.service.staking.ValidatorsListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.ValidatorsListRequest,
      network.clusterone.grpc.service.staking.ValidatorsListResponse> getValidatorsListMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.ValidatorsListRequest, network.clusterone.grpc.service.staking.ValidatorsListResponse> getValidatorsListMethod;
    if ((getValidatorsListMethod = SolanaStakeServiceGrpc.getValidatorsListMethod) == null) {
      synchronized (SolanaStakeServiceGrpc.class) {
        if ((getValidatorsListMethod = SolanaStakeServiceGrpc.getValidatorsListMethod) == null) {
          SolanaStakeServiceGrpc.getValidatorsListMethod = getValidatorsListMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.staking.ValidatorsListRequest, network.clusterone.grpc.service.staking.ValidatorsListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorsList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.ValidatorsListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.ValidatorsListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SolanaStakeServiceMethodDescriptorSupplier("ValidatorsList"))
              .build();
        }
      }
    }
    return getValidatorsListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.CreateStakeAccountRequest,
      network.clusterone.grpc.service.staking.CreateStakeAccountResponse> getCreateStakeAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStakeAccount",
      requestType = network.clusterone.grpc.service.staking.CreateStakeAccountRequest.class,
      responseType = network.clusterone.grpc.service.staking.CreateStakeAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.CreateStakeAccountRequest,
      network.clusterone.grpc.service.staking.CreateStakeAccountResponse> getCreateStakeAccountMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.CreateStakeAccountRequest, network.clusterone.grpc.service.staking.CreateStakeAccountResponse> getCreateStakeAccountMethod;
    if ((getCreateStakeAccountMethod = SolanaStakeServiceGrpc.getCreateStakeAccountMethod) == null) {
      synchronized (SolanaStakeServiceGrpc.class) {
        if ((getCreateStakeAccountMethod = SolanaStakeServiceGrpc.getCreateStakeAccountMethod) == null) {
          SolanaStakeServiceGrpc.getCreateStakeAccountMethod = getCreateStakeAccountMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.staking.CreateStakeAccountRequest, network.clusterone.grpc.service.staking.CreateStakeAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStakeAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.CreateStakeAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.CreateStakeAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SolanaStakeServiceMethodDescriptorSupplier("CreateStakeAccount"))
              .build();
        }
      }
    }
    return getCreateStakeAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.DelegateStakeRequest,
      network.clusterone.grpc.service.staking.DelegateStakeResponse> getDelegateStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegateStake",
      requestType = network.clusterone.grpc.service.staking.DelegateStakeRequest.class,
      responseType = network.clusterone.grpc.service.staking.DelegateStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.DelegateStakeRequest,
      network.clusterone.grpc.service.staking.DelegateStakeResponse> getDelegateStakeMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.DelegateStakeRequest, network.clusterone.grpc.service.staking.DelegateStakeResponse> getDelegateStakeMethod;
    if ((getDelegateStakeMethod = SolanaStakeServiceGrpc.getDelegateStakeMethod) == null) {
      synchronized (SolanaStakeServiceGrpc.class) {
        if ((getDelegateStakeMethod = SolanaStakeServiceGrpc.getDelegateStakeMethod) == null) {
          SolanaStakeServiceGrpc.getDelegateStakeMethod = getDelegateStakeMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.staking.DelegateStakeRequest, network.clusterone.grpc.service.staking.DelegateStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegateStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.DelegateStakeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.DelegateStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SolanaStakeServiceMethodDescriptorSupplier("DelegateStake"))
              .build();
        }
      }
    }
    return getDelegateStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.DeactivateStakeRequest,
      network.clusterone.grpc.service.staking.DeactivateStakeResponse> getDeactivateStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateStake",
      requestType = network.clusterone.grpc.service.staking.DeactivateStakeRequest.class,
      responseType = network.clusterone.grpc.service.staking.DeactivateStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.DeactivateStakeRequest,
      network.clusterone.grpc.service.staking.DeactivateStakeResponse> getDeactivateStakeMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.DeactivateStakeRequest, network.clusterone.grpc.service.staking.DeactivateStakeResponse> getDeactivateStakeMethod;
    if ((getDeactivateStakeMethod = SolanaStakeServiceGrpc.getDeactivateStakeMethod) == null) {
      synchronized (SolanaStakeServiceGrpc.class) {
        if ((getDeactivateStakeMethod = SolanaStakeServiceGrpc.getDeactivateStakeMethod) == null) {
          SolanaStakeServiceGrpc.getDeactivateStakeMethod = getDeactivateStakeMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.staking.DeactivateStakeRequest, network.clusterone.grpc.service.staking.DeactivateStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.DeactivateStakeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.DeactivateStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SolanaStakeServiceMethodDescriptorSupplier("DeactivateStake"))
              .build();
        }
      }
    }
    return getDeactivateStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.StakeActivationStatusRequest,
      network.clusterone.grpc.service.staking.StakeActivationStatusResponse> getStakeActivationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeActivationStatus",
      requestType = network.clusterone.grpc.service.staking.StakeActivationStatusRequest.class,
      responseType = network.clusterone.grpc.service.staking.StakeActivationStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.StakeActivationStatusRequest,
      network.clusterone.grpc.service.staking.StakeActivationStatusResponse> getStakeActivationStatusMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.StakeActivationStatusRequest, network.clusterone.grpc.service.staking.StakeActivationStatusResponse> getStakeActivationStatusMethod;
    if ((getStakeActivationStatusMethod = SolanaStakeServiceGrpc.getStakeActivationStatusMethod) == null) {
      synchronized (SolanaStakeServiceGrpc.class) {
        if ((getStakeActivationStatusMethod = SolanaStakeServiceGrpc.getStakeActivationStatusMethod) == null) {
          SolanaStakeServiceGrpc.getStakeActivationStatusMethod = getStakeActivationStatusMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.staking.StakeActivationStatusRequest, network.clusterone.grpc.service.staking.StakeActivationStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeActivationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.StakeActivationStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.StakeActivationStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SolanaStakeServiceMethodDescriptorSupplier("StakeActivationStatus"))
              .build();
        }
      }
    }
    return getStakeActivationStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.StakeAccountInfoRequest,
      network.clusterone.grpc.service.staking.StakeAccountInfoResponse> getStakeAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeAccountInfo",
      requestType = network.clusterone.grpc.service.staking.StakeAccountInfoRequest.class,
      responseType = network.clusterone.grpc.service.staking.StakeAccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.StakeAccountInfoRequest,
      network.clusterone.grpc.service.staking.StakeAccountInfoResponse> getStakeAccountInfoMethod() {
    io.grpc.MethodDescriptor<network.clusterone.grpc.service.staking.StakeAccountInfoRequest, network.clusterone.grpc.service.staking.StakeAccountInfoResponse> getStakeAccountInfoMethod;
    if ((getStakeAccountInfoMethod = SolanaStakeServiceGrpc.getStakeAccountInfoMethod) == null) {
      synchronized (SolanaStakeServiceGrpc.class) {
        if ((getStakeAccountInfoMethod = SolanaStakeServiceGrpc.getStakeAccountInfoMethod) == null) {
          SolanaStakeServiceGrpc.getStakeAccountInfoMethod = getStakeAccountInfoMethod =
              io.grpc.MethodDescriptor.<network.clusterone.grpc.service.staking.StakeAccountInfoRequest, network.clusterone.grpc.service.staking.StakeAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.StakeAccountInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.clusterone.grpc.service.staking.StakeAccountInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SolanaStakeServiceMethodDescriptorSupplier("StakeAccountInfo"))
              .build();
        }
      }
    }
    return getStakeAccountInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SolanaStakeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SolanaStakeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SolanaStakeServiceStub>() {
        @java.lang.Override
        public SolanaStakeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SolanaStakeServiceStub(channel, callOptions);
        }
      };
    return SolanaStakeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SolanaStakeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SolanaStakeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SolanaStakeServiceBlockingStub>() {
        @java.lang.Override
        public SolanaStakeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SolanaStakeServiceBlockingStub(channel, callOptions);
        }
      };
    return SolanaStakeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SolanaStakeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SolanaStakeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SolanaStakeServiceFutureStub>() {
        @java.lang.Override
        public SolanaStakeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SolanaStakeServiceFutureStub(channel, callOptions);
        }
      };
    return SolanaStakeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SolanaStakeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void validatorInfo(network.clusterone.grpc.service.staking.ValidatorInfoRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.ValidatorInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorInfoMethod(), responseObserver);
    }

    /**
     */
    public void validatorsList(network.clusterone.grpc.service.staking.ValidatorsListRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.ValidatorsListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorsListMethod(), responseObserver);
    }

    /**
     */
    public void createStakeAccount(network.clusterone.grpc.service.staking.CreateStakeAccountRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.CreateStakeAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStakeAccountMethod(), responseObserver);
    }

    /**
     */
    public void delegateStake(network.clusterone.grpc.service.staking.DelegateStakeRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.DelegateStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateStakeMethod(), responseObserver);
    }

    /**
     */
    public void deactivateStake(network.clusterone.grpc.service.staking.DeactivateStakeRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.DeactivateStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateStakeMethod(), responseObserver);
    }

    /**
     */
    public void stakeActivationStatus(network.clusterone.grpc.service.staking.StakeActivationStatusRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.StakeActivationStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeActivationStatusMethod(), responseObserver);
    }

    /**
     */
    public void stakeAccountInfo(network.clusterone.grpc.service.staking.StakeAccountInfoRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.StakeAccountInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeAccountInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidatorInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.staking.ValidatorInfoRequest,
                network.clusterone.grpc.service.staking.ValidatorInfoResponse>(
                  this, METHODID_VALIDATOR_INFO)))
          .addMethod(
            getValidatorsListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.staking.ValidatorsListRequest,
                network.clusterone.grpc.service.staking.ValidatorsListResponse>(
                  this, METHODID_VALIDATORS_LIST)))
          .addMethod(
            getCreateStakeAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.staking.CreateStakeAccountRequest,
                network.clusterone.grpc.service.staking.CreateStakeAccountResponse>(
                  this, METHODID_CREATE_STAKE_ACCOUNT)))
          .addMethod(
            getDelegateStakeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.staking.DelegateStakeRequest,
                network.clusterone.grpc.service.staking.DelegateStakeResponse>(
                  this, METHODID_DELEGATE_STAKE)))
          .addMethod(
            getDeactivateStakeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.staking.DeactivateStakeRequest,
                network.clusterone.grpc.service.staking.DeactivateStakeResponse>(
                  this, METHODID_DEACTIVATE_STAKE)))
          .addMethod(
            getStakeActivationStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.staking.StakeActivationStatusRequest,
                network.clusterone.grpc.service.staking.StakeActivationStatusResponse>(
                  this, METHODID_STAKE_ACTIVATION_STATUS)))
          .addMethod(
            getStakeAccountInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                network.clusterone.grpc.service.staking.StakeAccountInfoRequest,
                network.clusterone.grpc.service.staking.StakeAccountInfoResponse>(
                  this, METHODID_STAKE_ACCOUNT_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class SolanaStakeServiceStub extends io.grpc.stub.AbstractAsyncStub<SolanaStakeServiceStub> {
    private SolanaStakeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SolanaStakeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SolanaStakeServiceStub(channel, callOptions);
    }

    /**
     */
    public void validatorInfo(network.clusterone.grpc.service.staking.ValidatorInfoRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.ValidatorInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validatorsList(network.clusterone.grpc.service.staking.ValidatorsListRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.ValidatorsListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorsListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createStakeAccount(network.clusterone.grpc.service.staking.CreateStakeAccountRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.CreateStakeAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStakeAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delegateStake(network.clusterone.grpc.service.staking.DelegateStakeRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.DelegateStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivateStake(network.clusterone.grpc.service.staking.DeactivateStakeRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.DeactivateStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stakeActivationStatus(network.clusterone.grpc.service.staking.StakeActivationStatusRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.StakeActivationStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeActivationStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stakeAccountInfo(network.clusterone.grpc.service.staking.StakeAccountInfoRequest request,
        io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.StakeAccountInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SolanaStakeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SolanaStakeServiceBlockingStub> {
    private SolanaStakeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SolanaStakeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SolanaStakeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public network.clusterone.grpc.service.staking.ValidatorInfoResponse validatorInfo(network.clusterone.grpc.service.staking.ValidatorInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.staking.ValidatorsListResponse validatorsList(network.clusterone.grpc.service.staking.ValidatorsListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorsListMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.staking.CreateStakeAccountResponse createStakeAccount(network.clusterone.grpc.service.staking.CreateStakeAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStakeAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.staking.DelegateStakeResponse delegateStake(network.clusterone.grpc.service.staking.DelegateStakeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.staking.DeactivateStakeResponse deactivateStake(network.clusterone.grpc.service.staking.DeactivateStakeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.staking.StakeActivationStatusResponse stakeActivationStatus(network.clusterone.grpc.service.staking.StakeActivationStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeActivationStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.clusterone.grpc.service.staking.StakeAccountInfoResponse stakeAccountInfo(network.clusterone.grpc.service.staking.StakeAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeAccountInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SolanaStakeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SolanaStakeServiceFutureStub> {
    private SolanaStakeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SolanaStakeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SolanaStakeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.staking.ValidatorInfoResponse> validatorInfo(
        network.clusterone.grpc.service.staking.ValidatorInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.staking.ValidatorsListResponse> validatorsList(
        network.clusterone.grpc.service.staking.ValidatorsListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorsListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.staking.CreateStakeAccountResponse> createStakeAccount(
        network.clusterone.grpc.service.staking.CreateStakeAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStakeAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.staking.DelegateStakeResponse> delegateStake(
        network.clusterone.grpc.service.staking.DelegateStakeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.staking.DeactivateStakeResponse> deactivateStake(
        network.clusterone.grpc.service.staking.DeactivateStakeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.staking.StakeActivationStatusResponse> stakeActivationStatus(
        network.clusterone.grpc.service.staking.StakeActivationStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeActivationStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.clusterone.grpc.service.staking.StakeAccountInfoResponse> stakeAccountInfo(
        network.clusterone.grpc.service.staking.StakeAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeAccountInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATOR_INFO = 0;
  private static final int METHODID_VALIDATORS_LIST = 1;
  private static final int METHODID_CREATE_STAKE_ACCOUNT = 2;
  private static final int METHODID_DELEGATE_STAKE = 3;
  private static final int METHODID_DEACTIVATE_STAKE = 4;
  private static final int METHODID_STAKE_ACTIVATION_STATUS = 5;
  private static final int METHODID_STAKE_ACCOUNT_INFO = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SolanaStakeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SolanaStakeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATOR_INFO:
          serviceImpl.validatorInfo((network.clusterone.grpc.service.staking.ValidatorInfoRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.ValidatorInfoResponse>) responseObserver);
          break;
        case METHODID_VALIDATORS_LIST:
          serviceImpl.validatorsList((network.clusterone.grpc.service.staking.ValidatorsListRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.ValidatorsListResponse>) responseObserver);
          break;
        case METHODID_CREATE_STAKE_ACCOUNT:
          serviceImpl.createStakeAccount((network.clusterone.grpc.service.staking.CreateStakeAccountRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.CreateStakeAccountResponse>) responseObserver);
          break;
        case METHODID_DELEGATE_STAKE:
          serviceImpl.delegateStake((network.clusterone.grpc.service.staking.DelegateStakeRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.DelegateStakeResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_STAKE:
          serviceImpl.deactivateStake((network.clusterone.grpc.service.staking.DeactivateStakeRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.DeactivateStakeResponse>) responseObserver);
          break;
        case METHODID_STAKE_ACTIVATION_STATUS:
          serviceImpl.stakeActivationStatus((network.clusterone.grpc.service.staking.StakeActivationStatusRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.StakeActivationStatusResponse>) responseObserver);
          break;
        case METHODID_STAKE_ACCOUNT_INFO:
          serviceImpl.stakeAccountInfo((network.clusterone.grpc.service.staking.StakeAccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<network.clusterone.grpc.service.staking.StakeAccountInfoResponse>) responseObserver);
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

  private static abstract class SolanaStakeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SolanaStakeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.clusterone.grpc.service.staking.StakingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SolanaStakeService");
    }
  }

  private static final class SolanaStakeServiceFileDescriptorSupplier
      extends SolanaStakeServiceBaseDescriptorSupplier {
    SolanaStakeServiceFileDescriptorSupplier() {}
  }

  private static final class SolanaStakeServiceMethodDescriptorSupplier
      extends SolanaStakeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SolanaStakeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SolanaStakeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SolanaStakeServiceFileDescriptorSupplier())
              .addMethod(getValidatorInfoMethod())
              .addMethod(getValidatorsListMethod())
              .addMethod(getCreateStakeAccountMethod())
              .addMethod(getDelegateStakeMethod())
              .addMethod(getDeactivateStakeMethod())
              .addMethod(getStakeActivationStatusMethod())
              .addMethod(getStakeAccountInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
