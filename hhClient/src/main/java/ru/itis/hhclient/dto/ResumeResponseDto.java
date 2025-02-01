package ru.itis.hhclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResumeResponseDto {

    private String title;

    private String description;

    private String company;

    private String location;

    private String link;

    private String experience;

    private String salary;

}
