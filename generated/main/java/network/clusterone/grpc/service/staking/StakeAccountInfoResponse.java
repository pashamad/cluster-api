// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/staking/staking.proto

package network.clusterone.grpc.service.staking;

/**
 * Protobuf type {@code solana_stake.StakeAccountInfoResponse}
 */
public final class StakeAccountInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:solana_stake.StakeAccountInfoResponse)
    StakeAccountInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StakeAccountInfoResponse.newBuilder() to construct.
  private StakeAccountInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StakeAccountInfoResponse() {
    amount_ = "";
    owner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StakeAccountInfoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StakeAccountInfoResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            amount_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            owner_ = s;
            break;
          }
          case 24: {

            excutable_ = input.readBool();
            break;
          }
          case 32: {

            rentEpoch_ = input.readUInt64();
            break;
          }
          case 42: {
            network.clusterone.grpc.service.staking.StakeAccount.Builder subBuilder = null;
            if (stakeAccount_ != null) {
              subBuilder = stakeAccount_.toBuilder();
            }
            stakeAccount_ = input.readMessage(network.clusterone.grpc.service.staking.StakeAccount.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stakeAccount_);
              stakeAccount_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            network.clusterone.grpc.messages.response.Status.Builder subBuilder = null;
            if (retStatus_ != null) {
              subBuilder = retStatus_.toBuilder();
            }
            retStatus_ = input.readMessage(network.clusterone.grpc.messages.response.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(retStatus_);
              retStatus_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_StakeAccountInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_StakeAccountInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.clusterone.grpc.service.staking.StakeAccountInfoResponse.class, network.clusterone.grpc.service.staking.StakeAccountInfoResponse.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private volatile java.lang.Object amount_;
  /**
   * <code>string Amount = 1;</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string Amount = 1;</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_FIELD_NUMBER = 2;
  private volatile java.lang.Object owner_;
  /**
   * <code>string Owner = 2;</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <code>string Owner = 2;</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXCUTABLE_FIELD_NUMBER = 3;
  private boolean excutable_;
  /**
   * <code>bool Excutable = 3;</code>
   * @return The excutable.
   */
  @java.lang.Override
  public boolean getExcutable() {
    return excutable_;
  }

  public static final int RENTEPOCH_FIELD_NUMBER = 4;
  private long rentEpoch_;
  /**
   * <code>uint64 RentEpoch = 4;</code>
   * @return The rentEpoch.
   */
  @java.lang.Override
  public long getRentEpoch() {
    return rentEpoch_;
  }

  public static final int STAKEACCOUNT_FIELD_NUMBER = 5;
  private network.clusterone.grpc.service.staking.StakeAccount stakeAccount_;
  /**
   * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
   * @return Whether the stakeAccount field is set.
   */
  @java.lang.Override
  public boolean hasStakeAccount() {
    return stakeAccount_ != null;
  }
  /**
   * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
   * @return The stakeAccount.
   */
  @java.lang.Override
  public network.clusterone.grpc.service.staking.StakeAccount getStakeAccount() {
    return stakeAccount_ == null ? network.clusterone.grpc.service.staking.StakeAccount.getDefaultInstance() : stakeAccount_;
  }
  /**
   * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
   */
  @java.lang.Override
  public network.clusterone.grpc.service.staking.StakeAccountOrBuilder getStakeAccountOrBuilder() {
    return getStakeAccount();
  }

  public static final int RET_STATUS_FIELD_NUMBER = 6;
  private network.clusterone.grpc.messages.response.Status retStatus_;
  /**
   * <code>.response.Status ret_status = 6;</code>
   * @return Whether the retStatus field is set.
   */
  @java.lang.Override
  public boolean hasRetStatus() {
    return retStatus_ != null;
  }
  /**
   * <code>.response.Status ret_status = 6;</code>
   * @return The retStatus.
   */
  @java.lang.Override
  public network.clusterone.grpc.messages.response.Status getRetStatus() {
    return retStatus_ == null ? network.clusterone.grpc.messages.response.Status.getDefaultInstance() : retStatus_;
  }
  /**
   * <code>.response.Status ret_status = 6;</code>
   */
  @java.lang.Override
  public network.clusterone.grpc.messages.response.StatusOrBuilder getRetStatusOrBuilder() {
    return getRetStatus();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, owner_);
    }
    if (excutable_ != false) {
      output.writeBool(3, excutable_);
    }
    if (rentEpoch_ != 0L) {
      output.writeUInt64(4, rentEpoch_);
    }
    if (stakeAccount_ != null) {
      output.writeMessage(5, getStakeAccount());
    }
    if (retStatus_ != null) {
      output.writeMessage(6, getRetStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, owner_);
    }
    if (excutable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, excutable_);
    }
    if (rentEpoch_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, rentEpoch_);
    }
    if (stakeAccount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getStakeAccount());
    }
    if (retStatus_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getRetStatus());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof network.clusterone.grpc.service.staking.StakeAccountInfoResponse)) {
      return super.equals(obj);
    }
    network.clusterone.grpc.service.staking.StakeAccountInfoResponse other = (network.clusterone.grpc.service.staking.StakeAccountInfoResponse) obj;

    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (getExcutable()
        != other.getExcutable()) return false;
    if (getRentEpoch()
        != other.getRentEpoch()) return false;
    if (hasStakeAccount() != other.hasStakeAccount()) return false;
    if (hasStakeAccount()) {
      if (!getStakeAccount()
          .equals(other.getStakeAccount())) return false;
    }
    if (hasRetStatus() != other.hasRetStatus()) return false;
    if (hasRetStatus()) {
      if (!getRetStatus()
          .equals(other.getRetStatus())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + EXCUTABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getExcutable());
    hash = (37 * hash) + RENTEPOCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRentEpoch());
    if (hasStakeAccount()) {
      hash = (37 * hash) + STAKEACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getStakeAccount().hashCode();
    }
    if (hasRetStatus()) {
      hash = (37 * hash) + RET_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getRetStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(network.clusterone.grpc.service.staking.StakeAccountInfoResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code solana_stake.StakeAccountInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:solana_stake.StakeAccountInfoResponse)
      network.clusterone.grpc.service.staking.StakeAccountInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_StakeAccountInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_StakeAccountInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.clusterone.grpc.service.staking.StakeAccountInfoResponse.class, network.clusterone.grpc.service.staking.StakeAccountInfoResponse.Builder.class);
    }

    // Construct using network.clusterone.grpc.service.staking.StakeAccountInfoResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      amount_ = "";

      owner_ = "";

      excutable_ = false;

      rentEpoch_ = 0L;

      if (stakeAccountBuilder_ == null) {
        stakeAccount_ = null;
      } else {
        stakeAccount_ = null;
        stakeAccountBuilder_ = null;
      }
      if (retStatusBuilder_ == null) {
        retStatus_ = null;
      } else {
        retStatus_ = null;
        retStatusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_StakeAccountInfoResponse_descriptor;
    }

    @java.lang.Override
    public network.clusterone.grpc.service.staking.StakeAccountInfoResponse getDefaultInstanceForType() {
      return network.clusterone.grpc.service.staking.StakeAccountInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.clusterone.grpc.service.staking.StakeAccountInfoResponse build() {
      network.clusterone.grpc.service.staking.StakeAccountInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.clusterone.grpc.service.staking.StakeAccountInfoResponse buildPartial() {
      network.clusterone.grpc.service.staking.StakeAccountInfoResponse result = new network.clusterone.grpc.service.staking.StakeAccountInfoResponse(this);
      result.amount_ = amount_;
      result.owner_ = owner_;
      result.excutable_ = excutable_;
      result.rentEpoch_ = rentEpoch_;
      if (stakeAccountBuilder_ == null) {
        result.stakeAccount_ = stakeAccount_;
      } else {
        result.stakeAccount_ = stakeAccountBuilder_.build();
      }
      if (retStatusBuilder_ == null) {
        result.retStatus_ = retStatus_;
      } else {
        result.retStatus_ = retStatusBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof network.clusterone.grpc.service.staking.StakeAccountInfoResponse) {
        return mergeFrom((network.clusterone.grpc.service.staking.StakeAccountInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.clusterone.grpc.service.staking.StakeAccountInfoResponse other) {
      if (other == network.clusterone.grpc.service.staking.StakeAccountInfoResponse.getDefaultInstance()) return this;
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        onChanged();
      }
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        onChanged();
      }
      if (other.getExcutable() != false) {
        setExcutable(other.getExcutable());
      }
      if (other.getRentEpoch() != 0L) {
        setRentEpoch(other.getRentEpoch());
      }
      if (other.hasStakeAccount()) {
        mergeStakeAccount(other.getStakeAccount());
      }
      if (other.hasRetStatus()) {
        mergeRetStatus(other.getRetStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      network.clusterone.grpc.service.staking.StakeAccountInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.clusterone.grpc.service.staking.StakeAccountInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string Amount = 1;</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Amount = 1;</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Amount = 1;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Amount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string Amount = 1;</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      amount_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object owner_ = "";
    /**
     * <code>string Owner = 2;</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Owner = 2;</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Owner = 2;</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      owner_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Owner = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      
      owner_ = getDefaultInstance().getOwner();
      onChanged();
      return this;
    }
    /**
     * <code>string Owner = 2;</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      owner_ = value;
      onChanged();
      return this;
    }

    private boolean excutable_ ;
    /**
     * <code>bool Excutable = 3;</code>
     * @return The excutable.
     */
    @java.lang.Override
    public boolean getExcutable() {
      return excutable_;
    }
    /**
     * <code>bool Excutable = 3;</code>
     * @param value The excutable to set.
     * @return This builder for chaining.
     */
    public Builder setExcutable(boolean value) {
      
      excutable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool Excutable = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExcutable() {
      
      excutable_ = false;
      onChanged();
      return this;
    }

    private long rentEpoch_ ;
    /**
     * <code>uint64 RentEpoch = 4;</code>
     * @return The rentEpoch.
     */
    @java.lang.Override
    public long getRentEpoch() {
      return rentEpoch_;
    }
    /**
     * <code>uint64 RentEpoch = 4;</code>
     * @param value The rentEpoch to set.
     * @return This builder for chaining.
     */
    public Builder setRentEpoch(long value) {
      
      rentEpoch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 RentEpoch = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRentEpoch() {
      
      rentEpoch_ = 0L;
      onChanged();
      return this;
    }

    private network.clusterone.grpc.service.staking.StakeAccount stakeAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.clusterone.grpc.service.staking.StakeAccount, network.clusterone.grpc.service.staking.StakeAccount.Builder, network.clusterone.grpc.service.staking.StakeAccountOrBuilder> stakeAccountBuilder_;
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     * @return Whether the stakeAccount field is set.
     */
    public boolean hasStakeAccount() {
      return stakeAccountBuilder_ != null || stakeAccount_ != null;
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     * @return The stakeAccount.
     */
    public network.clusterone.grpc.service.staking.StakeAccount getStakeAccount() {
      if (stakeAccountBuilder_ == null) {
        return stakeAccount_ == null ? network.clusterone.grpc.service.staking.StakeAccount.getDefaultInstance() : stakeAccount_;
      } else {
        return stakeAccountBuilder_.getMessage();
      }
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     */
    public Builder setStakeAccount(network.clusterone.grpc.service.staking.StakeAccount value) {
      if (stakeAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stakeAccount_ = value;
        onChanged();
      } else {
        stakeAccountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     */
    public Builder setStakeAccount(
        network.clusterone.grpc.service.staking.StakeAccount.Builder builderForValue) {
      if (stakeAccountBuilder_ == null) {
        stakeAccount_ = builderForValue.build();
        onChanged();
      } else {
        stakeAccountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     */
    public Builder mergeStakeAccount(network.clusterone.grpc.service.staking.StakeAccount value) {
      if (stakeAccountBuilder_ == null) {
        if (stakeAccount_ != null) {
          stakeAccount_ =
            network.clusterone.grpc.service.staking.StakeAccount.newBuilder(stakeAccount_).mergeFrom(value).buildPartial();
        } else {
          stakeAccount_ = value;
        }
        onChanged();
      } else {
        stakeAccountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     */
    public Builder clearStakeAccount() {
      if (stakeAccountBuilder_ == null) {
        stakeAccount_ = null;
        onChanged();
      } else {
        stakeAccount_ = null;
        stakeAccountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     */
    public network.clusterone.grpc.service.staking.StakeAccount.Builder getStakeAccountBuilder() {
      
      onChanged();
      return getStakeAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     */
    public network.clusterone.grpc.service.staking.StakeAccountOrBuilder getStakeAccountOrBuilder() {
      if (stakeAccountBuilder_ != null) {
        return stakeAccountBuilder_.getMessageOrBuilder();
      } else {
        return stakeAccount_ == null ?
            network.clusterone.grpc.service.staking.StakeAccount.getDefaultInstance() : stakeAccount_;
      }
    }
    /**
     * <code>.solana_stake.StakeAccount StakeAccount = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.clusterone.grpc.service.staking.StakeAccount, network.clusterone.grpc.service.staking.StakeAccount.Builder, network.clusterone.grpc.service.staking.StakeAccountOrBuilder> 
        getStakeAccountFieldBuilder() {
      if (stakeAccountBuilder_ == null) {
        stakeAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.clusterone.grpc.service.staking.StakeAccount, network.clusterone.grpc.service.staking.StakeAccount.Builder, network.clusterone.grpc.service.staking.StakeAccountOrBuilder>(
                getStakeAccount(),
                getParentForChildren(),
                isClean());
        stakeAccount_ = null;
      }
      return stakeAccountBuilder_;
    }

    private network.clusterone.grpc.messages.response.Status retStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.clusterone.grpc.messages.response.Status, network.clusterone.grpc.messages.response.Status.Builder, network.clusterone.grpc.messages.response.StatusOrBuilder> retStatusBuilder_;
    /**
     * <code>.response.Status ret_status = 6;</code>
     * @return Whether the retStatus field is set.
     */
    public boolean hasRetStatus() {
      return retStatusBuilder_ != null || retStatus_ != null;
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     * @return The retStatus.
     */
    public network.clusterone.grpc.messages.response.Status getRetStatus() {
      if (retStatusBuilder_ == null) {
        return retStatus_ == null ? network.clusterone.grpc.messages.response.Status.getDefaultInstance() : retStatus_;
      } else {
        return retStatusBuilder_.getMessage();
      }
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     */
    public Builder setRetStatus(network.clusterone.grpc.messages.response.Status value) {
      if (retStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retStatus_ = value;
        onChanged();
      } else {
        retStatusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     */
    public Builder setRetStatus(
        network.clusterone.grpc.messages.response.Status.Builder builderForValue) {
      if (retStatusBuilder_ == null) {
        retStatus_ = builderForValue.build();
        onChanged();
      } else {
        retStatusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     */
    public Builder mergeRetStatus(network.clusterone.grpc.messages.response.Status value) {
      if (retStatusBuilder_ == null) {
        if (retStatus_ != null) {
          retStatus_ =
            network.clusterone.grpc.messages.response.Status.newBuilder(retStatus_).mergeFrom(value).buildPartial();
        } else {
          retStatus_ = value;
        }
        onChanged();
      } else {
        retStatusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     */
    public Builder clearRetStatus() {
      if (retStatusBuilder_ == null) {
        retStatus_ = null;
        onChanged();
      } else {
        retStatus_ = null;
        retStatusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     */
    public network.clusterone.grpc.messages.response.Status.Builder getRetStatusBuilder() {
      
      onChanged();
      return getRetStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     */
    public network.clusterone.grpc.messages.response.StatusOrBuilder getRetStatusOrBuilder() {
      if (retStatusBuilder_ != null) {
        return retStatusBuilder_.getMessageOrBuilder();
      } else {
        return retStatus_ == null ?
            network.clusterone.grpc.messages.response.Status.getDefaultInstance() : retStatus_;
      }
    }
    /**
     * <code>.response.Status ret_status = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.clusterone.grpc.messages.response.Status, network.clusterone.grpc.messages.response.Status.Builder, network.clusterone.grpc.messages.response.StatusOrBuilder> 
        getRetStatusFieldBuilder() {
      if (retStatusBuilder_ == null) {
        retStatusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.clusterone.grpc.messages.response.Status, network.clusterone.grpc.messages.response.Status.Builder, network.clusterone.grpc.messages.response.StatusOrBuilder>(
                getRetStatus(),
                getParentForChildren(),
                isClean());
        retStatus_ = null;
      }
      return retStatusBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:solana_stake.StakeAccountInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:solana_stake.StakeAccountInfoResponse)
  private static final network.clusterone.grpc.service.staking.StakeAccountInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.clusterone.grpc.service.staking.StakeAccountInfoResponse();
  }

  public static network.clusterone.grpc.service.staking.StakeAccountInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StakeAccountInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<StakeAccountInfoResponse>() {
    @java.lang.Override
    public StakeAccountInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StakeAccountInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StakeAccountInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StakeAccountInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.clusterone.grpc.service.staking.StakeAccountInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

