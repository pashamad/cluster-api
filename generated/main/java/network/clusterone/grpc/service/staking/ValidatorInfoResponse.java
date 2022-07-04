// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/staking/staking.proto

package network.clusterone.grpc.service.staking;

/**
 * Protobuf type {@code solana_stake.ValidatorInfoResponse}
 */
public final class ValidatorInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:solana_stake.ValidatorInfoResponse)
    ValidatorInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorInfoResponse.newBuilder() to construct.
  private ValidatorInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorInfoResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidatorInfoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidatorInfoResponse(
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
            network.clusterone.grpc.service.staking.Validator.Builder subBuilder = null;
            if (info_ != null) {
              subBuilder = info_.toBuilder();
            }
            info_ = input.readMessage(network.clusterone.grpc.service.staking.Validator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(info_);
              info_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
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
    return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_ValidatorInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_ValidatorInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.clusterone.grpc.service.staking.ValidatorInfoResponse.class, network.clusterone.grpc.service.staking.ValidatorInfoResponse.Builder.class);
  }

  public static final int INFO_FIELD_NUMBER = 1;
  private network.clusterone.grpc.service.staking.Validator info_;
  /**
   * <code>.solana_stake.Validator Info = 1;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <code>.solana_stake.Validator Info = 1;</code>
   * @return The info.
   */
  @java.lang.Override
  public network.clusterone.grpc.service.staking.Validator getInfo() {
    return info_ == null ? network.clusterone.grpc.service.staking.Validator.getDefaultInstance() : info_;
  }
  /**
   * <code>.solana_stake.Validator Info = 1;</code>
   */
  @java.lang.Override
  public network.clusterone.grpc.service.staking.ValidatorOrBuilder getInfoOrBuilder() {
    return getInfo();
  }

  public static final int RET_STATUS_FIELD_NUMBER = 2;
  private network.clusterone.grpc.messages.response.Status retStatus_;
  /**
   * <code>.response.Status ret_status = 2;</code>
   * @return Whether the retStatus field is set.
   */
  @java.lang.Override
  public boolean hasRetStatus() {
    return retStatus_ != null;
  }
  /**
   * <code>.response.Status ret_status = 2;</code>
   * @return The retStatus.
   */
  @java.lang.Override
  public network.clusterone.grpc.messages.response.Status getRetStatus() {
    return retStatus_ == null ? network.clusterone.grpc.messages.response.Status.getDefaultInstance() : retStatus_;
  }
  /**
   * <code>.response.Status ret_status = 2;</code>
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
    if (info_ != null) {
      output.writeMessage(1, getInfo());
    }
    if (retStatus_ != null) {
      output.writeMessage(2, getRetStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInfo());
    }
    if (retStatus_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRetStatus());
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
    if (!(obj instanceof network.clusterone.grpc.service.staking.ValidatorInfoResponse)) {
      return super.equals(obj);
    }
    network.clusterone.grpc.service.staking.ValidatorInfoResponse other = (network.clusterone.grpc.service.staking.ValidatorInfoResponse) obj;

    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
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
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    if (hasRetStatus()) {
      hash = (37 * hash) + RET_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getRetStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse parseFrom(
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
  public static Builder newBuilder(network.clusterone.grpc.service.staking.ValidatorInfoResponse prototype) {
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
   * Protobuf type {@code solana_stake.ValidatorInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:solana_stake.ValidatorInfoResponse)
      network.clusterone.grpc.service.staking.ValidatorInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_ValidatorInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_ValidatorInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.clusterone.grpc.service.staking.ValidatorInfoResponse.class, network.clusterone.grpc.service.staking.ValidatorInfoResponse.Builder.class);
    }

    // Construct using network.clusterone.grpc.service.staking.ValidatorInfoResponse.newBuilder()
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
      if (infoBuilder_ == null) {
        info_ = null;
      } else {
        info_ = null;
        infoBuilder_ = null;
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
      return network.clusterone.grpc.service.staking.StakingServiceProto.internal_static_solana_stake_ValidatorInfoResponse_descriptor;
    }

    @java.lang.Override
    public network.clusterone.grpc.service.staking.ValidatorInfoResponse getDefaultInstanceForType() {
      return network.clusterone.grpc.service.staking.ValidatorInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.clusterone.grpc.service.staking.ValidatorInfoResponse build() {
      network.clusterone.grpc.service.staking.ValidatorInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.clusterone.grpc.service.staking.ValidatorInfoResponse buildPartial() {
      network.clusterone.grpc.service.staking.ValidatorInfoResponse result = new network.clusterone.grpc.service.staking.ValidatorInfoResponse(this);
      if (infoBuilder_ == null) {
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
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
      if (other instanceof network.clusterone.grpc.service.staking.ValidatorInfoResponse) {
        return mergeFrom((network.clusterone.grpc.service.staking.ValidatorInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.clusterone.grpc.service.staking.ValidatorInfoResponse other) {
      if (other == network.clusterone.grpc.service.staking.ValidatorInfoResponse.getDefaultInstance()) return this;
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
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
      network.clusterone.grpc.service.staking.ValidatorInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.clusterone.grpc.service.staking.ValidatorInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private network.clusterone.grpc.service.staking.Validator info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.clusterone.grpc.service.staking.Validator, network.clusterone.grpc.service.staking.Validator.Builder, network.clusterone.grpc.service.staking.ValidatorOrBuilder> infoBuilder_;
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return infoBuilder_ != null || info_ != null;
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     * @return The info.
     */
    public network.clusterone.grpc.service.staking.Validator getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? network.clusterone.grpc.service.staking.Validator.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     */
    public Builder setInfo(network.clusterone.grpc.service.staking.Validator value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     */
    public Builder setInfo(
        network.clusterone.grpc.service.staking.Validator.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     */
    public Builder mergeInfo(network.clusterone.grpc.service.staking.Validator value) {
      if (infoBuilder_ == null) {
        if (info_ != null) {
          info_ =
            network.clusterone.grpc.service.staking.Validator.newBuilder(info_).mergeFrom(value).buildPartial();
        } else {
          info_ = value;
        }
        onChanged();
      } else {
        infoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = null;
        onChanged();
      } else {
        info_ = null;
        infoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     */
    public network.clusterone.grpc.service.staking.Validator.Builder getInfoBuilder() {
      
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     */
    public network.clusterone.grpc.service.staking.ValidatorOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            network.clusterone.grpc.service.staking.Validator.getDefaultInstance() : info_;
      }
    }
    /**
     * <code>.solana_stake.Validator Info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.clusterone.grpc.service.staking.Validator, network.clusterone.grpc.service.staking.Validator.Builder, network.clusterone.grpc.service.staking.ValidatorOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.clusterone.grpc.service.staking.Validator, network.clusterone.grpc.service.staking.Validator.Builder, network.clusterone.grpc.service.staking.ValidatorOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private network.clusterone.grpc.messages.response.Status retStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.clusterone.grpc.messages.response.Status, network.clusterone.grpc.messages.response.Status.Builder, network.clusterone.grpc.messages.response.StatusOrBuilder> retStatusBuilder_;
    /**
     * <code>.response.Status ret_status = 2;</code>
     * @return Whether the retStatus field is set.
     */
    public boolean hasRetStatus() {
      return retStatusBuilder_ != null || retStatus_ != null;
    }
    /**
     * <code>.response.Status ret_status = 2;</code>
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
     * <code>.response.Status ret_status = 2;</code>
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
     * <code>.response.Status ret_status = 2;</code>
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
     * <code>.response.Status ret_status = 2;</code>
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
     * <code>.response.Status ret_status = 2;</code>
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
     * <code>.response.Status ret_status = 2;</code>
     */
    public network.clusterone.grpc.messages.response.Status.Builder getRetStatusBuilder() {
      
      onChanged();
      return getRetStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.response.Status ret_status = 2;</code>
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
     * <code>.response.Status ret_status = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:solana_stake.ValidatorInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:solana_stake.ValidatorInfoResponse)
  private static final network.clusterone.grpc.service.staking.ValidatorInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.clusterone.grpc.service.staking.ValidatorInfoResponse();
  }

  public static network.clusterone.grpc.service.staking.ValidatorInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorInfoResponse>() {
    @java.lang.Override
    public ValidatorInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidatorInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidatorInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.clusterone.grpc.service.staking.ValidatorInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

