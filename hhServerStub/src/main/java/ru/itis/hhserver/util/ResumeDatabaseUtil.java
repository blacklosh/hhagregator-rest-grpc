package ru.itis.hhserver.util;

import lombok.experimental.UtilityClass;
import ru.itis.hhserver.gprc.ResumeListResponse;
import ru.itis.hhserver.gprc.ResumeRequest;
import ru.itis.hhserver.gprc.SingleResumeResponse;

@UtilityClass
public class ResumeDatabaseUtil {

    private final SingleResumeResponse firstResume = SingleResumeResponse.newBuilder()
            .setTitle("First")
            .setDescription("No")
            .setCompany("Company1")
            .setExperience("1 year")
            .setSalary("1.000$")
            .setLink("dot.net")
            .setLocation("Kazan")
            .build();

    private final SingleResumeResponse secondResume = SingleResumeResponse.newBuilder()
            .setTitle("Second")
            .setDescription("No no")
            .setCompany("Company2")
            .setExperience("2 year")
            .setSalary("2.000$")
            .setLink("java.ru")
            .setLocation("Moscow")
            .build();

    public ResumeListResponse getResumeList(ResumeRequest rq) {
        if(rq.getSorting().equals("ASC")) {
            return ResumeListResponse.newBuilder()
                    .addList(firstResume)
                    .addList(secondResume)
                    .build();
        } else {
            return ResumeListResponse.newBuilder()
                    .addList(secondResume)
                    .addList(firstResume)
                    .build();
        }
    }

}
