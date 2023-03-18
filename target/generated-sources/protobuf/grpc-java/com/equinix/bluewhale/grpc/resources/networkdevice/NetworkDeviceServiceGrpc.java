package com.equinix.bluewhale.grpc.resources.networkdevice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: network_device.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetworkDeviceServiceGrpc {

  private NetworkDeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "network_device.NetworkDeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest,
      com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse> getGetNetworkDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkDevice",
      requestType = com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest.class,
      responseType = com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest,
      com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse> getGetNetworkDeviceMethod() {
    io.grpc.MethodDescriptor<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest, com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse> getGetNetworkDeviceMethod;
    if ((getGetNetworkDeviceMethod = NetworkDeviceServiceGrpc.getGetNetworkDeviceMethod) == null) {
      synchronized (NetworkDeviceServiceGrpc.class) {
        if ((getGetNetworkDeviceMethod = NetworkDeviceServiceGrpc.getGetNetworkDeviceMethod) == null) {
          NetworkDeviceServiceGrpc.getGetNetworkDeviceMethod = getGetNetworkDeviceMethod =
              io.grpc.MethodDescriptor.<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest, com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNetworkDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkDeviceServiceMethodDescriptorSupplier("GetNetworkDevice"))
              .build();
        }
      }
    }
    return getGetNetworkDeviceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkDeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkDeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkDeviceServiceStub>() {
        @java.lang.Override
        public NetworkDeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkDeviceServiceStub(channel, callOptions);
        }
      };
    return NetworkDeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkDeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkDeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkDeviceServiceBlockingStub>() {
        @java.lang.Override
        public NetworkDeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkDeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return NetworkDeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkDeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkDeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkDeviceServiceFutureStub>() {
        @java.lang.Override
        public NetworkDeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkDeviceServiceFutureStub(channel, callOptions);
        }
      };
    return NetworkDeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NetworkDeviceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNetworkDevice(com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNetworkDeviceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNetworkDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest,
                com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse>(
                  this, METHODID_GET_NETWORK_DEVICE)))
          .build();
    }
  }

  /**
   */
  public static final class NetworkDeviceServiceStub extends io.grpc.stub.AbstractAsyncStub<NetworkDeviceServiceStub> {
    private NetworkDeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkDeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkDeviceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNetworkDevice(com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest request,
        io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNetworkDeviceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetworkDeviceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetworkDeviceServiceBlockingStub> {
    private NetworkDeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkDeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkDeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse getNetworkDevice(com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNetworkDeviceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetworkDeviceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NetworkDeviceServiceFutureStub> {
    private NetworkDeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkDeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkDeviceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse> getNetworkDevice(
        com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNetworkDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NETWORK_DEVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkDeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkDeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NETWORK_DEVICE:
          serviceImpl.getNetworkDevice((com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.equinix.bluewhale.grpc.resources.networkdevice.GetNetworkDeviceResponse>) responseObserver);
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

  private static abstract class NetworkDeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkDeviceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.equinix.bluewhale.grpc.resources.networkdevice.NetworkDeviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkDeviceService");
    }
  }

  private static final class NetworkDeviceServiceFileDescriptorSupplier
      extends NetworkDeviceServiceBaseDescriptorSupplier {
    NetworkDeviceServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkDeviceServiceMethodDescriptorSupplier
      extends NetworkDeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkDeviceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkDeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkDeviceServiceFileDescriptorSupplier())
              .addMethod(getGetNetworkDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
