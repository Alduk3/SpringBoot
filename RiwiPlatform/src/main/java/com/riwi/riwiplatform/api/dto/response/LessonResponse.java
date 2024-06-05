package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Assignment;
import com.riwi.riwiplatform.domain.entities.Course;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonResponse {
    private Long id;

    private String title;
    private String content;

    private CourseBasicResponse course;

    private List<AssignmentBasicResponse> assignments;
}
