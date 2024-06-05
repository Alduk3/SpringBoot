package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Course;
import com.riwi.riwiplatform.domain.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    private Long id;

    private String message;
    private Date sentDate;


    private UserBasicResponse sender;


    private UserBasicResponse receiver;


    private CourseBasicResponse course;
}
