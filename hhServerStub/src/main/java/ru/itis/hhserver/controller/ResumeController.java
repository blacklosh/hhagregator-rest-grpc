package ru.itis.hhserver.controller;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.itis.hhserver.gprc.ResumeListResponse;
import ru.itis.hhserver.gprc.ResumeRequest;
import ru.itis.hhserver.gprc.ResumeServiceGrpc;
import ru.itis.hhserver.util.ResumeDatabaseUtil;

@Slf4j
@GrpcService
public class ResumeController extends ResumeServiceGrpc.ResumeServiceImplBase {

    private ResumeListResponse handleRequest(ResumeRequest request) {
        return ResumeDatabaseUtil.getResumeList(request);
    }

    @Override
    public StreamObserver<ResumeRequest> getResumeList(StreamObserver<ResumeListResponse> responseObserver) {
        return StreamObserverUtility.proxyStream(responseObserver, this::handleRequest);
    }

}
