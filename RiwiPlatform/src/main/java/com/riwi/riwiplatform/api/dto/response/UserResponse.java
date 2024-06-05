package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Course;
import com.riwi.riwiplatform.domain.entities.Enrollment;
import com.riwi.riwiplatform.domain.entities.Message;
import com.riwi.riwiplatform.utils.enums.UserRole;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String full_name;
    private UserRole role;
    private List<EnrollmentBasicResponse> enrollments;
    private List<CourseBasicResponse> courses;
    private List<SubmissionBasicResponse> submissions;
    private List<MessageBasicResponse> messages_receiver;
    private List<MessageBasicResponse> messages_sender;
}
