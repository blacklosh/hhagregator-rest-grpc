package ru.itis.hhclient.service;

import ru.itis.hhclient.dto.Sorting;
import ru.itis.hhclient.dto.ResumeListResponseDto;

public interface ResumeSearchService {

    ResumeListResponseDto getResumeList(Sorting sorting);

}
