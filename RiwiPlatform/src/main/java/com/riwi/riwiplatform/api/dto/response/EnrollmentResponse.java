package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Course;
import com.riwi.riwiplatform.domain.entities.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class EnrollmentResponse {
    private Long id;
    private Date enrollmentDate;

    private UserBasicResponse user;

    private CourseBasicResponse course;
}
