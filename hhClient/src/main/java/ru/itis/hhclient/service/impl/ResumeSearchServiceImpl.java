package ru.itis.hhclient.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itis.hhclient.dto.Sorting;
import ru.itis.hhclient.dto.ResumeListResponseDto;
import ru.itis.hhclient.dto.ResumeResponseDto;
import ru.itis.hhclient.gprc.ResumeRequest;
import ru.itis.hhclient.service.ResumeSearchEngine;
import ru.itis.hhclient.service.ResumeSearchService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ResumeSearchServiceImpl implements ResumeSearchService {

    private final List<ResumeSearchEngine> searchEngines;

    @Override
    public ResumeListResponseDto getResumeList(Sorting sorting) {
        ResumeRequest request = ResumeRequest.newBuilder()
                .setSorting(sorting.name())
                .build();

        ResumeListResponseDto result = ResumeListResponseDto.builder()
                .items(new ArrayList<>())
                .build();

        for(ResumeSearchEngine engine : searchEngines) {
            result.getItems().addAll(engine.getResumeList(request));
        }

        if(searchEngines.size() > 1) {
            if(Sorting.ASC.equals(sorting)) {
                result.getItems().sort(Comparator.comparing(ResumeResponseDto::getSalary));
            } else {
                result.getItems().sort(Comparator.comparing(ResumeResponseDto::getSalary, Comparator.reverseOrder()));
            }
        }

        return result;
    }
}
