package ru.itis.hhclient.service;

import ru.itis.hhclient.dto.ResumeListResponseDto;
import ru.itis.hhclient.dto.ResumeResponseDto;
import ru.itis.hhclient.gprc.ResumeRequest;

import java.util.List;

public interface ResumeSearchEngine {

    List<ResumeResponseDto> getResumeList(ResumeRequest request);
    
}
