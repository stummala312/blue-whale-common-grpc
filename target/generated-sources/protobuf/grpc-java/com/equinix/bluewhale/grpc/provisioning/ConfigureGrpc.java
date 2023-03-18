package com.equinix.bluewhale.grpc.provisioning;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: network_service_configure.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConfigureGrpc {

  private ConfigureGrpc() {}

  public static final String SERVICE_NAME = "Configure";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Configure",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigureMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigureMethod;
    if ((getConfigureMethod = ConfigureGrpc.getConfigureMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getConfigureMethod = ConfigureGrpc.getConfigureMethod) == null) {
          ConfigureGrpc.getConfigureMethod = getConfigureMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Configure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("Configure"))
              .build();
        }
      }
    }
    return getConfigureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigureAndSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureAndSubscribe",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigureAndSubscribeMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigureAndSubscribeMethod;
    if ((getConfigureAndSubscribeMethod = ConfigureGrpc.getConfigureAndSubscribeMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getConfigureAndSubscribeMethod = ConfigureGrpc.getConfigureAndSubscribeMethod) == null) {
          ConfigureGrpc.getConfigureAndSubscribeMethod = getConfigureAndSubscribeMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureAndSubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("ConfigureAndSubscribe"))
              .build();
        }
      }
    }
    return getConfigureAndSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getUpdateConfigStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConfigStatus",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getUpdateConfigStatusMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getUpdateConfigStatusMethod;
    if ((getUpdateConfigStatusMethod = ConfigureGrpc.getUpdateConfigStatusMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getUpdateConfigStatusMethod = ConfigureGrpc.getUpdateConfigStatusMethod) == null) {
          ConfigureGrpc.getUpdateConfigStatusMethod = getUpdateConfigStatusMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConfigStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("UpdateConfigStatus"))
              .build();
        }
      }
    }
    return getUpdateConfigStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigStatus",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigStatusMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getConfigStatusMethod;
    if ((getConfigStatusMethod = ConfigureGrpc.getConfigStatusMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getConfigStatusMethod = ConfigureGrpc.getConfigStatusMethod) == null) {
          ConfigureGrpc.getConfigStatusMethod = getConfigStatusMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("ConfigStatus"))
              .build();
        }
      }
    }
    return getConfigStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getReplaceConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplaceConfiguration",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getReplaceConfigurationMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> getReplaceConfigurationMethod;
    if ((getReplaceConfigurationMethod = ConfigureGrpc.getReplaceConfigurationMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getReplaceConfigurationMethod = ConfigureGrpc.getReplaceConfigurationMethod) == null) {
          ConfigureGrpc.getReplaceConfigurationMethod = getReplaceConfigurationMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplaceConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("ReplaceConfiguration"))
              .build();
        }
      }
    }
    return getReplaceConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> getDriftDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DriftDetect",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> getDriftDetectMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> getDriftDetectMethod;
    if ((getDriftDetectMethod = ConfigureGrpc.getDriftDetectMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getDriftDetectMethod = ConfigureGrpc.getDriftDetectMethod) == null) {
          ConfigureGrpc.getDriftDetectMethod = getDriftDetectMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DriftDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("DriftDetect"))
              .build();
        }
      }
    }
    return getDriftDetectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> getInstanceDriftDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstanceDriftDetect",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> getInstanceDriftDetectMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> getInstanceDriftDetectMethod;
    if ((getInstanceDriftDetectMethod = ConfigureGrpc.getInstanceDriftDetectMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getInstanceDriftDetectMethod = ConfigureGrpc.getInstanceDriftDetectMethod) == null) {
          ConfigureGrpc.getInstanceDriftDetectMethod = getInstanceDriftDetectMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstanceDriftDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("InstanceDriftDetect"))
              .build();
        }
      }
    }
    return getInstanceDriftDetectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse> getJournalOnlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JournalOnly",
      requestType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest.class,
      responseType = com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest,
      com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse> getJournalOnlyMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse> getJournalOnlyMethod;
    if ((getJournalOnlyMethod = ConfigureGrpc.getJournalOnlyMethod) == null) {
      synchronized (ConfigureGrpc.class) {
        if ((getJournalOnlyMethod = ConfigureGrpc.getJournalOnlyMethod) == null) {
          ConfigureGrpc.getJournalOnlyMethod = getJournalOnlyMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest, com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JournalOnly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigureMethodDescriptorSupplier("JournalOnly"))
              .build();
        }
      }
    }
    return getJournalOnlyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigureStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigureStub>() {
        @java.lang.Override
        public ConfigureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigureStub(channel, callOptions);
        }
      };
    return ConfigureStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigureBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigureBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigureBlockingStub>() {
        @java.lang.Override
        public ConfigureBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigureBlockingStub(channel, callOptions);
        }
      };
    return ConfigureBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigureFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigureFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigureFutureStub>() {
        @java.lang.Override
        public ConfigureFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigureFutureStub(channel, callOptions);
        }
      };
    return ConfigureFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConfigureImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Main entrypoint for instance network configuration requests.
     * Restriction on subfields interface_a / interface_b (in ConfigurationRequest.instance_config.network_modes.*):
     * 1. Do not change device_hostname field between the calls to this rpc (even when it's a letter capitalization
     * or conversion to/from fully qualified domain name).
     * 2. If there is a Configuration already applied on the same combination of interface_a.device_hostname
     * and interface_a.name as this call has, the current call should retain also the same interface_b.device_hostname
     * and interface_b.name (i.e. interface_a and interface_b are now permanently bundled).
     * To switch to a different interface_b you must first configure UnenrolledMode. Such Configuration, if applied,
     * unbundles interface_b from interface_a, and allows the subsequent call to freely change interface_b.
     * </pre>
     */
    public void configure(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Same as Configure followed by ConfigStatus.
     * </pre>
     */
    public void configureAndSubscribe(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureAndSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an additional entry to the journal, given a config_id to update the status of that configuration sequence
     * </pre>
     */
    public void updateConfigStatus(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConfigStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Use UUID returned in ConfigStatusMessage to subscribe to stream of status updates
     * </pre>
     */
    public void configStatus(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Primarily for use between controller and agent,
     * sends current configuration and new configuration so agent can generate the necessary config to change / replace
     * </pre>
     */
    public void replaceConfiguration(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Determines if the switch config matches the intended state
     * </pre>
     */
    public void driftDetect(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDriftDetectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Determines if the instance's config matches the intended state
     * </pre>
     */
    public void instanceDriftDetect(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstanceDriftDetectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Same as Configure but does not alter anything on network switches. Stores request in the database as the current
     * configuration. It is the caller's responsibility to have it applied onto the network switches.
     * </pre>
     */
    public void journalOnly(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJournalOnlyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConfigureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>(
                  this, METHODID_CONFIGURE)))
          .addMethod(
            getConfigureAndSubscribeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>(
                  this, METHODID_CONFIGURE_AND_SUBSCRIBE)))
          .addMethod(
            getUpdateConfigStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>(
                  this, METHODID_UPDATE_CONFIG_STATUS)))
          .addMethod(
            getConfigStatusMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>(
                  this, METHODID_CONFIG_STATUS)))
          .addMethod(
            getReplaceConfigurationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>(
                  this, METHODID_REPLACE_CONFIGURATION)))
          .addMethod(
            getDriftDetectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse>(
                  this, METHODID_DRIFT_DETECT)))
          .addMethod(
            getInstanceDriftDetectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse>(
                  this, METHODID_INSTANCE_DRIFT_DETECT)))
          .addMethod(
            getJournalOnlyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest,
                com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse>(
                  this, METHODID_JOURNAL_ONLY)))
          .build();
    }
  }

  /**
   */
  public static final class ConfigureStub extends io.grpc.stub.AbstractAsyncStub<ConfigureStub> {
    private ConfigureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Main entrypoint for instance network configuration requests.
     * Restriction on subfields interface_a / interface_b (in ConfigurationRequest.instance_config.network_modes.*):
     * 1. Do not change device_hostname field between the calls to this rpc (even when it's a letter capitalization
     * or conversion to/from fully qualified domain name).
     * 2. If there is a Configuration already applied on the same combination of interface_a.device_hostname
     * and interface_a.name as this call has, the current call should retain also the same interface_b.device_hostname
     * and interface_b.name (i.e. interface_a and interface_b are now permanently bundled).
     * To switch to a different interface_b you must first configure UnenrolledMode. Such Configuration, if applied,
     * unbundles interface_b from interface_a, and allows the subsequent call to freely change interface_b.
     * </pre>
     */
    public void configure(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Same as Configure followed by ConfigStatus.
     * </pre>
     */
    public void configureAndSubscribe(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getConfigureAndSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an additional entry to the journal, given a config_id to update the status of that configuration sequence
     * </pre>
     */
    public void updateConfigStatus(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConfigStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Use UUID returned in ConfigStatusMessage to subscribe to stream of status updates
     * </pre>
     */
    public void configStatus(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getConfigStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Primarily for use between controller and agent,
     * sends current configuration and new configuration so agent can generate the necessary config to change / replace
     * </pre>
     */
    public void replaceConfiguration(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Determines if the switch config matches the intended state
     * </pre>
     */
    public void driftDetect(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDriftDetectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Determines if the instance's config matches the intended state
     * </pre>
     */
    public void instanceDriftDetect(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstanceDriftDetectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Same as Configure but does not alter anything on network switches. Stores request in the database as the current
     * configuration. It is the caller's responsibility to have it applied onto the network switches.
     * </pre>
     */
    public void journalOnly(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJournalOnlyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConfigureBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConfigureBlockingStub> {
    private ConfigureBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigureBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigureBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Main entrypoint for instance network configuration requests.
     * Restriction on subfields interface_a / interface_b (in ConfigurationRequest.instance_config.network_modes.*):
     * 1. Do not change device_hostname field between the calls to this rpc (even when it's a letter capitalization
     * or conversion to/from fully qualified domain name).
     * 2. If there is a Configuration already applied on the same combination of interface_a.device_hostname
     * and interface_a.name as this call has, the current call should retain also the same interface_b.device_hostname
     * and interface_b.name (i.e. interface_a and interface_b are now permanently bundled).
     * To switch to a different interface_b you must first configure UnenrolledMode. Such Configuration, if applied,
     * unbundles interface_b from interface_a, and allows the subsequent call to freely change interface_b.
     * </pre>
     */
    public com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage configure(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Same as Configure followed by ConfigStatus.
     * </pre>
     */
    public java.util.Iterator<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> configureAndSubscribe(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getConfigureAndSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an additional entry to the journal, given a config_id to update the status of that configuration sequence
     * </pre>
     */
    public com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage updateConfigStatus(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConfigStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Use UUID returned in ConfigStatusMessage to subscribe to stream of status updates
     * </pre>
     */
    public java.util.Iterator<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> configStatus(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getConfigStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Primarily for use between controller and agent,
     * sends current configuration and new configuration so agent can generate the necessary config to change / replace
     * </pre>
     */
    public com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage replaceConfiguration(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Determines if the switch config matches the intended state
     * </pre>
     */
    public com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse driftDetect(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDriftDetectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Determines if the instance's config matches the intended state
     * </pre>
     */
    public com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse instanceDriftDetect(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstanceDriftDetectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Same as Configure but does not alter anything on network switches. Stores request in the database as the current
     * configuration. It is the caller's responsibility to have it applied onto the network switches.
     * </pre>
     */
    public com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse journalOnly(com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJournalOnlyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConfigureFutureStub extends io.grpc.stub.AbstractFutureStub<ConfigureFutureStub> {
    private ConfigureFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigureFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigureFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Main entrypoint for instance network configuration requests.
     * Restriction on subfields interface_a / interface_b (in ConfigurationRequest.instance_config.network_modes.*):
     * 1. Do not change device_hostname field between the calls to this rpc (even when it's a letter capitalization
     * or conversion to/from fully qualified domain name).
     * 2. If there is a Configuration already applied on the same combination of interface_a.device_hostname
     * and interface_a.name as this call has, the current call should retain also the same interface_b.device_hostname
     * and interface_b.name (i.e. interface_a and interface_b are now permanently bundled).
     * To switch to a different interface_b you must first configure UnenrolledMode. Such Configuration, if applied,
     * unbundles interface_b from interface_a, and allows the subsequent call to freely change interface_b.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> configure(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an additional entry to the journal, given a config_id to update the status of that configuration sequence
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> updateConfigStatus(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConfigStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Primarily for use between controller and agent,
     * sends current configuration and new configuration so agent can generate the necessary config to change / replace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage> replaceConfiguration(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Determines if the switch config matches the intended state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> driftDetect(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDriftDetectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Determines if the instance's config matches the intended state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse> instanceDriftDetect(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstanceDriftDetectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Same as Configure but does not alter anything on network switches. Stores request in the database as the current
     * configuration. It is the caller's responsibility to have it applied onto the network switches.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse> journalOnly(
        com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJournalOnlyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONFIGURE = 0;
  private static final int METHODID_CONFIGURE_AND_SUBSCRIBE = 1;
  private static final int METHODID_UPDATE_CONFIG_STATUS = 2;
  private static final int METHODID_CONFIG_STATUS = 3;
  private static final int METHODID_REPLACE_CONFIGURATION = 4;
  private static final int METHODID_DRIFT_DETECT = 5;
  private static final int METHODID_INSTANCE_DRIFT_DETECT = 6;
  private static final int METHODID_JOURNAL_ONLY = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigureImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigureImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONFIGURE:
          serviceImpl.configure((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>) responseObserver);
          break;
        case METHODID_CONFIGURE_AND_SUBSCRIBE:
          serviceImpl.configureAndSubscribe((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>) responseObserver);
          break;
        case METHODID_UPDATE_CONFIG_STATUS:
          serviceImpl.updateConfigStatus((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.UpdateConfigStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>) responseObserver);
          break;
        case METHODID_CONFIG_STATUS:
          serviceImpl.configStatus((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>) responseObserver);
          break;
        case METHODID_REPLACE_CONFIGURATION:
          serviceImpl.replaceConfiguration((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ReplaceConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.ConfigStatusMessage>) responseObserver);
          break;
        case METHODID_DRIFT_DETECT:
          serviceImpl.driftDetect((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse>) responseObserver);
          break;
        case METHODID_INSTANCE_DRIFT_DETECT:
          serviceImpl.instanceDriftDetect((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.InstanceDriftDetectRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.DriftDetectResponse>) responseObserver);
          break;
        case METHODID_JOURNAL_ONLY:
          serviceImpl.journalOnly((com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.JournalOnlyResponse>) responseObserver);
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

  private static abstract class ConfigureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigureBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.equinix.bluewhale.grpc.provisioning.NetworkServiceConfigure.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Configure");
    }
  }

  private static final class ConfigureFileDescriptorSupplier
      extends ConfigureBaseDescriptorSupplier {
    ConfigureFileDescriptorSupplier() {}
  }

  private static final class ConfigureMethodDescriptorSupplier
      extends ConfigureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigureMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConfigureGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigureFileDescriptorSupplier())
              .addMethod(getConfigureMethod())
              .addMethod(getConfigureAndSubscribeMethod())
              .addMethod(getUpdateConfigStatusMethod())
              .addMethod(getConfigStatusMethod())
              .addMethod(getReplaceConfigurationMethod())
              .addMethod(getDriftDetectMethod())
              .addMethod(getInstanceDriftDetectMethod())
              .addMethod(getJournalOnlyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
