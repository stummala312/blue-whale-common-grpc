// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: network_device.proto

package com.equinix.bluewhale.grpc.resources.networkdevice;

/**
 * Protobuf type {@code network_device.GetNetworkDeviceResponse}
 */
public final class GetNetworkDeviceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:network_device.GetNetworkDeviceResponse)
    GetNetworkDeviceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNetworkDeviceResponse.newBuilder() to construct.
  private GetNetworkDeviceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNetworkDeviceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNetworkDeviceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetNetworkDeviceResponse(
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
            com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.Builder subBuilder = null;
            if (networkDevice_ != null) {
              subBuilder = networkDevice_.toBuilder();
            }
            networkDevice_ = input.readMessage(com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(networkDevice_);
              networkDevice_ = subBuilder.buildPartial();
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
    return com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceProto.internal_static_network_device_GetNetworkDeviceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceProto.internal_static_network_device_GetNetworkDeviceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.class, com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.Builder.class);
  }

  public static final int NETWORK_DEVICE_FIELD_NUMBER = 1;
  private com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto networkDevice_;
  /**
   * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
   * @return Whether the networkDevice field is set.
   */
  @java.lang.Override
  public boolean hasNetworkDevice() {
    return networkDevice_ != null;
  }
  /**
   * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
   * @return The networkDevice.
   */
  @java.lang.Override
  public com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto getNetworkDevice() {
    return networkDevice_ == null ? com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.getDefaultInstance() : networkDevice_;
  }
  /**
   * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
   */
  @java.lang.Override
  public com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDtoOrBuilder getNetworkDeviceOrBuilder() {
    return getNetworkDevice();
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
    if (networkDevice_ != null) {
      output.writeMessage(1, getNetworkDevice());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (networkDevice_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNetworkDevice());
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
    if (!(obj instanceof com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse)) {
      return super.equals(obj);
    }
    com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse other = (com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse) obj;

    if (hasNetworkDevice() != other.hasNetworkDevice()) return false;
    if (hasNetworkDevice()) {
      if (!getNetworkDevice()
          .equals(other.getNetworkDevice())) return false;
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
    if (hasNetworkDevice()) {
      hash = (37 * hash) + NETWORK_DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkDevice().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parseFrom(
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
  public static Builder newBuilder(com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse prototype) {
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
   * Protobuf type {@code network_device.GetNetworkDeviceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:network_device.GetNetworkDeviceResponse)
      com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceProto.internal_static_network_device_GetNetworkDeviceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceProto.internal_static_network_device_GetNetworkDeviceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.class, com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.Builder.class);
    }

    // Construct using com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.newBuilder()
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
      if (networkDeviceBuilder_ == null) {
        networkDevice_ = null;
      } else {
        networkDevice_ = null;
        networkDeviceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceProto.internal_static_network_device_GetNetworkDeviceResponse_descriptor;
    }

    @java.lang.Override
    public com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse getDefaultInstanceForType() {
      return com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse build() {
      com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse buildPartial() {
      com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse result = new com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse(this);
      if (networkDeviceBuilder_ == null) {
        result.networkDevice_ = networkDevice_;
      } else {
        result.networkDevice_ = networkDeviceBuilder_.build();
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
      if (other instanceof com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse) {
        return mergeFrom((com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse other) {
      if (other == com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.getDefaultInstance()) return this;
      if (other.hasNetworkDevice()) {
        mergeNetworkDevice(other.getNetworkDevice());
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
      com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto networkDevice_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto, com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.Builder, com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDtoOrBuilder> networkDeviceBuilder_;
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     * @return Whether the networkDevice field is set.
     */
    public boolean hasNetworkDevice() {
      return networkDeviceBuilder_ != null || networkDevice_ != null;
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     * @return The networkDevice.
     */
    public com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto getNetworkDevice() {
      if (networkDeviceBuilder_ == null) {
        return networkDevice_ == null ? com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.getDefaultInstance() : networkDevice_;
      } else {
        return networkDeviceBuilder_.getMessage();
      }
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     */
    public Builder setNetworkDevice(com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto value) {
      if (networkDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        networkDevice_ = value;
        onChanged();
      } else {
        networkDeviceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     */
    public Builder setNetworkDevice(
        com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.Builder builderForValue) {
      if (networkDeviceBuilder_ == null) {
        networkDevice_ = builderForValue.build();
        onChanged();
      } else {
        networkDeviceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     */
    public Builder mergeNetworkDevice(com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto value) {
      if (networkDeviceBuilder_ == null) {
        if (networkDevice_ != null) {
          networkDevice_ =
            com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.newBuilder(networkDevice_).mergeFrom(value).buildPartial();
        } else {
          networkDevice_ = value;
        }
        onChanged();
      } else {
        networkDeviceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     */
    public Builder clearNetworkDevice() {
      if (networkDeviceBuilder_ == null) {
        networkDevice_ = null;
        onChanged();
      } else {
        networkDevice_ = null;
        networkDeviceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     */
    public com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.Builder getNetworkDeviceBuilder() {
      
      onChanged();
      return getNetworkDeviceFieldBuilder().getBuilder();
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     */
    public com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDtoOrBuilder getNetworkDeviceOrBuilder() {
      if (networkDeviceBuilder_ != null) {
        return networkDeviceBuilder_.getMessageOrBuilder();
      } else {
        return networkDevice_ == null ?
            com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.getDefaultInstance() : networkDevice_;
      }
    }
    /**
     * <code>.network_device.NetworkDeviceDto network_device = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto, com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.Builder, com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDtoOrBuilder> 
        getNetworkDeviceFieldBuilder() {
      if (networkDeviceBuilder_ == null) {
        networkDeviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto, com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDto.Builder, com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceDtoOrBuilder>(
                getNetworkDevice(),
                getParentForChildren(),
                isClean());
        networkDevice_ = null;
      }
      return networkDeviceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:network_device.GetNetworkDeviceResponse)
  }

  // @@protoc_insertion_point(class_scope:network_device.GetNetworkDeviceResponse)
  private static final com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse();
  }

  public static com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNetworkDeviceResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetNetworkDeviceResponse>() {
    @java.lang.Override
    public GetNetworkDeviceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetNetworkDeviceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetNetworkDeviceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNetworkDeviceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
