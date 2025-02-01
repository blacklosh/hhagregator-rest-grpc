package ru.itis.hhclient.mapper;

import org.springframework.stereotype.Component;
import ru.itis.hhclient.dto.ResumeListResponseDto;
import ru.itis.hhclient.dto.ResumeResponseDto;
import ru.itis.hhclient.gprc.ResumeListResponse;
import ru.itis.hhclient.gprc.SingleResumeResponse;

@Component
public class ResumeMapper {

    public ResumeResponseDto toDto(SingleResumeResponse response) {
        return ResumeResponseDto.builder()
                .title(response.getTitle())
                .description(response.getDescription())
                .company(response.getCompany())
                .link(response.getLink())
                .location(response.getLocation())
                .experience(response.getExperience())
                .salary(response.getSalary())
                .build();
    }

    public ResumeListResponseDto toDto(ResumeListResponse response) {
        return ResumeListResponseDto.builder()
                .items(response.getListList().stream().map(this::toDto).toList())
                .build();
    }

}
