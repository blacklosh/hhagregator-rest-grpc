package ru.itis.hhclient.service.impl;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;
import ru.itis.hhclient.dto.ResumeResponseDto;
import ru.itis.hhclient.gprc.ResumeListResponse;
import ru.itis.hhclient.gprc.ResumeRequest;
import ru.itis.hhclient.gprc.ResumeServiceGrpc;
import ru.itis.hhclient.mapper.ResumeMapper;
import ru.itis.hhclient.service.ResumeSearchEngine;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class ServerStubSearchEngineImpl implements ResumeSearchEngine {

    @GrpcClient("serverstub")
    ResumeServiceGrpc.ResumeServiceStub service;

    private final ResumeMapper mapper;

    @Override
    public List<ResumeResponseDto> getResumeList(ResumeRequest request) {
        final ResumeListResponse[] response = {null};
        final StreamObserver<ResumeListResponse> responseObserver = new StreamObserver<>() {
            @Override
            public void onNext(ResumeListResponse response1) {
                log.info("Next result found");
                response[0] = response1;
            }

            @Override
            public void onError(Throwable throwable) {
                log.error("Error occured", throwable);
            }

            @Override
            public void onCompleted() {
                log.info("Request finished");
            }
        };
        final StreamObserver<ResumeRequest> request1 = service.getResumeList(responseObserver);
        request1.onNext(request);
        request1.onCompleted();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response[0].getListList().stream().map(mapper::toDto).toList();
    }
}
