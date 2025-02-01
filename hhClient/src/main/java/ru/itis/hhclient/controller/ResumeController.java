package ru.itis.hhclient.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.hhclient.dto.Sorting;
import ru.itis.hhclient.dto.ResumeListResponseDto;
import ru.itis.hhclient.service.ResumeSearchService;

@Slf4j
@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeSearchService searchService;

    @GetMapping
    public ResumeListResponseDto getResumeList(@RequestParam Sorting sorting) {
        return searchService.getResumeList(sorting);
    }

}
