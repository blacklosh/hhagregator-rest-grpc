package ru.itis.hhserver.gprc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: resume.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResumeServiceGrpc {

  private ResumeServiceGrpc() {}

  public static final String SERVICE_NAME = "ResumeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ResumeRequest, ResumeListResponse> getGetResumeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResumeList",
      requestType = ResumeRequest.class,
      responseType = ResumeListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ResumeRequest,
      ResumeListResponse> getGetResumeListMethod() {
    io.grpc.MethodDescriptor<ResumeRequest, ResumeListResponse> getGetResumeListMethod;
    if ((getGetResumeListMethod = ResumeServiceGrpc.getGetResumeListMethod) == null) {
      synchronized (ResumeServiceGrpc.class) {
        if ((getGetResumeListMethod = ResumeServiceGrpc.getGetResumeListMethod) == null) {
          ResumeServiceGrpc.getGetResumeListMethod = getGetResumeListMethod =
              io.grpc.MethodDescriptor.<ResumeRequest, ResumeListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResumeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ResumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ResumeListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResumeServiceMethodDescriptorSupplier("getResumeList"))
              .build();
        }
      }
    }
    return getGetResumeListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResumeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResumeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResumeServiceStub>() {
        @Override
        public ResumeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResumeServiceStub(channel, callOptions);
        }
      };
    return ResumeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResumeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResumeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResumeServiceBlockingStub>() {
        @Override
        public ResumeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResumeServiceBlockingStub(channel, callOptions);
        }
      };
    return ResumeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResumeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResumeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResumeServiceFutureStub>() {
        @Override
        public ResumeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResumeServiceFutureStub(channel, callOptions);
        }
      };
    return ResumeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<ResumeRequest> getResumeList(
        io.grpc.stub.StreamObserver<ResumeListResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetResumeListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ResumeService.
   */
  public static abstract class ResumeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return ResumeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ResumeService.
   */
  public static final class ResumeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ResumeServiceStub> {
    private ResumeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ResumeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResumeServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ResumeRequest> getResumeList(
        io.grpc.stub.StreamObserver<ResumeListResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetResumeListMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ResumeService.
   */
  public static final class ResumeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ResumeServiceBlockingStub> {
    private ResumeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ResumeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResumeServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ResumeService.
   */
  public static final class ResumeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ResumeServiceFutureStub> {
    private ResumeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ResumeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResumeServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_RESUME_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESUME_LIST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getResumeList(
              (io.grpc.stub.StreamObserver<ResumeListResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetResumeListMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              ResumeRequest,
              ResumeListResponse>(
                service, METHODID_GET_RESUME_LIST)))
        .build();
  }

  private static abstract class ResumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResumeServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Resume.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResumeService");
    }
  }

  private static final class ResumeServiceFileDescriptorSupplier
      extends ResumeServiceBaseDescriptorSupplier {
    ResumeServiceFileDescriptorSupplier() {}
  }

  private static final class ResumeServiceMethodDescriptorSupplier
      extends ResumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResumeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ResumeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResumeServiceFileDescriptorSupplier())
              .addMethod(getGetResumeListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
