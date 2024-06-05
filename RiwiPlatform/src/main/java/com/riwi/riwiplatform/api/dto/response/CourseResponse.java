package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Enrollment;
import com.riwi.riwiplatform.domain.entities.Message;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {
    private int id;

    private String name;
    private String description;


    private UserBasicResponse user;


    private List<EnrollmentBasicResponse> enrollments;

    private List<LessonBasicResponse> lessons;

    private List<MessageBasicResponse> messages;
}
