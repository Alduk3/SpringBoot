package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Lesson;
import com.riwi.riwiplatform.domain.entities.Submission;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentResponse {
    private int id;
    private String title;
    private String description;
    private Date due_date;

    private LessonBasicResponse lesson;

    private List<SubmissionBasicResponse> submissions;
}
