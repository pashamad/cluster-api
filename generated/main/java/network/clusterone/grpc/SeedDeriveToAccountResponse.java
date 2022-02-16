// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/account.proto

package network.clusterone.grpc;

/**
 * Protobuf type {@code account.SeedDeriveToAccountResponse}
 */
public final class SeedDeriveToAccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:account.SeedDeriveToAccountResponse)
    SeedDeriveToAccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SeedDeriveToAccountResponse.newBuilder() to construct.
  private SeedDeriveToAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeedDeriveToAccountResponse() {
    privateKey_ = "";
    publicKey_ = "";
    publicAddr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SeedDeriveToAccountResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SeedDeriveToAccountResponse(
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

            privateKey_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            publicKey_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            publicAddr_ = s;
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
    return network.clusterone.grpc.AccountServiceProto.internal_static_account_SeedDeriveToAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.clusterone.grpc.AccountServiceProto.internal_static_account_SeedDeriveToAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.clusterone.grpc.SeedDeriveToAccountResponse.class, network.clusterone.grpc.SeedDeriveToAccountResponse.Builder.class);
  }

  public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object privateKey_;
  /**
   * <code>string private_key = 1;</code>
   * @return The privateKey.
   */
  @java.lang.Override
  public java.lang.String getPrivateKey() {
    java.lang.Object ref = privateKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      privateKey_ = s;
      return s;
    }
  }
  /**
   * <code>string private_key = 1;</code>
   * @return The bytes for privateKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrivateKeyBytes() {
    java.lang.Object ref = privateKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      privateKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object publicKey_;
  /**
   * <code>string public_key = 2;</code>
   * @return The publicKey.
   */
  @java.lang.Override
  public java.lang.String getPublicKey() {
    java.lang.Object ref = publicKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicKey_ = s;
      return s;
    }
  }
  /**
   * <code>string public_key = 2;</code>
   * @return The bytes for publicKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublicKeyBytes() {
    java.lang.Object ref = publicKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publicKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_ADDR_FIELD_NUMBER = 3;
  private volatile java.lang.Object publicAddr_;
  /**
   * <code>string public_addr = 3;</code>
   * @return The publicAddr.
   */
  @java.lang.Override
  public java.lang.String getPublicAddr() {
    java.lang.Object ref = publicAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicAddr_ = s;
      return s;
    }
  }
  /**
   * <code>string public_addr = 3;</code>
   * @return The bytes for publicAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublicAddrBytes() {
    java.lang.Object ref = publicAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publicAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privateKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, privateKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, publicKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicAddr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, publicAddr_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privateKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, privateKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, publicKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicAddr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, publicAddr_);
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
    if (!(obj instanceof network.clusterone.grpc.SeedDeriveToAccountResponse)) {
      return super.equals(obj);
    }
    network.clusterone.grpc.SeedDeriveToAccountResponse other = (network.clusterone.grpc.SeedDeriveToAccountResponse) obj;

    if (!getPrivateKey()
        .equals(other.getPrivateKey())) return false;
    if (!getPublicKey()
        .equals(other.getPublicKey())) return false;
    if (!getPublicAddr()
        .equals(other.getPublicAddr())) return false;
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
    hash = (37 * hash) + PRIVATE_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPrivateKey().hashCode();
    hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKey().hashCode();
    hash = (37 * hash) + PUBLIC_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getPublicAddr().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.clusterone.grpc.SeedDeriveToAccountResponse parseFrom(
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
  public static Builder newBuilder(network.clusterone.grpc.SeedDeriveToAccountResponse prototype) {
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
   * Protobuf type {@code account.SeedDeriveToAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:account.SeedDeriveToAccountResponse)
      network.clusterone.grpc.SeedDeriveToAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.clusterone.grpc.AccountServiceProto.internal_static_account_SeedDeriveToAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.clusterone.grpc.AccountServiceProto.internal_static_account_SeedDeriveToAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.clusterone.grpc.SeedDeriveToAccountResponse.class, network.clusterone.grpc.SeedDeriveToAccountResponse.Builder.class);
    }

    // Construct using network.clusterone.grpc.SeedDeriveToAccountResponse.newBuilder()
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
      privateKey_ = "";

      publicKey_ = "";

      publicAddr_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.clusterone.grpc.AccountServiceProto.internal_static_account_SeedDeriveToAccountResponse_descriptor;
    }

    @java.lang.Override
    public network.clusterone.grpc.SeedDeriveToAccountResponse getDefaultInstanceForType() {
      return network.clusterone.grpc.SeedDeriveToAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.clusterone.grpc.SeedDeriveToAccountResponse build() {
      network.clusterone.grpc.SeedDeriveToAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.clusterone.grpc.SeedDeriveToAccountResponse buildPartial() {
      network.clusterone.grpc.SeedDeriveToAccountResponse result = new network.clusterone.grpc.SeedDeriveToAccountResponse(this);
      result.privateKey_ = privateKey_;
      result.publicKey_ = publicKey_;
      result.publicAddr_ = publicAddr_;
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
      if (other instanceof network.clusterone.grpc.SeedDeriveToAccountResponse) {
        return mergeFrom((network.clusterone.grpc.SeedDeriveToAccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.clusterone.grpc.SeedDeriveToAccountResponse other) {
      if (other == network.clusterone.grpc.SeedDeriveToAccountResponse.getDefaultInstance()) return this;
      if (!other.getPrivateKey().isEmpty()) {
        privateKey_ = other.privateKey_;
        onChanged();
      }
      if (!other.getPublicKey().isEmpty()) {
        publicKey_ = other.publicKey_;
        onChanged();
      }
      if (!other.getPublicAddr().isEmpty()) {
        publicAddr_ = other.publicAddr_;
        onChanged();
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
      network.clusterone.grpc.SeedDeriveToAccountResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.clusterone.grpc.SeedDeriveToAccountResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object privateKey_ = "";
    /**
     * <code>string private_key = 1;</code>
     * @return The privateKey.
     */
    public java.lang.String getPrivateKey() {
      java.lang.Object ref = privateKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        privateKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string private_key = 1;</code>
     * @return The bytes for privateKey.
     */
    public com.google.protobuf.ByteString
        getPrivateKeyBytes() {
      java.lang.Object ref = privateKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        privateKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string private_key = 1;</code>
     * @param value The privateKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      privateKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string private_key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivateKey() {
      
      privateKey_ = getDefaultInstance().getPrivateKey();
      onChanged();
      return this;
    }
    /**
     * <code>string private_key = 1;</code>
     * @param value The bytes for privateKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      privateKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object publicKey_ = "";
    /**
     * <code>string public_key = 2;</code>
     * @return The publicKey.
     */
    public java.lang.String getPublicKey() {
      java.lang.Object ref = publicKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string public_key = 2;</code>
     * @return The bytes for publicKey.
     */
    public com.google.protobuf.ByteString
        getPublicKeyBytes() {
      java.lang.Object ref = publicKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publicKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string public_key = 2;</code>
     * @param value The publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publicKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string public_key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPublicKey() {
      
      publicKey_ = getDefaultInstance().getPublicKey();
      onChanged();
      return this;
    }
    /**
     * <code>string public_key = 2;</code>
     * @param value The bytes for publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      publicKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object publicAddr_ = "";
    /**
     * <code>string public_addr = 3;</code>
     * @return The publicAddr.
     */
    public java.lang.String getPublicAddr() {
      java.lang.Object ref = publicAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string public_addr = 3;</code>
     * @return The bytes for publicAddr.
     */
    public com.google.protobuf.ByteString
        getPublicAddrBytes() {
      java.lang.Object ref = publicAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publicAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string public_addr = 3;</code>
     * @param value The publicAddr to set.
     * @return This builder for chaining.
     */
    public Builder setPublicAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publicAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string public_addr = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPublicAddr() {
      
      publicAddr_ = getDefaultInstance().getPublicAddr();
      onChanged();
      return this;
    }
    /**
     * <code>string public_addr = 3;</code>
     * @param value The bytes for publicAddr to set.
     * @return This builder for chaining.
     */
    public Builder setPublicAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      publicAddr_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:account.SeedDeriveToAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:account.SeedDeriveToAccountResponse)
  private static final network.clusterone.grpc.SeedDeriveToAccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.clusterone.grpc.SeedDeriveToAccountResponse();
  }

  public static network.clusterone.grpc.SeedDeriveToAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeedDeriveToAccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<SeedDeriveToAccountResponse>() {
    @java.lang.Override
    public SeedDeriveToAccountResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SeedDeriveToAccountResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SeedDeriveToAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeedDeriveToAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.clusterone.grpc.SeedDeriveToAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

