package com.riwi.riwiplatform.api.dto.request;

import com.riwi.riwiplatform.domain.entities.Course;
import com.riwi.riwiplatform.domain.entities.User;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {

    @NotBlank(message = "The message is required")
    private String message;

    private Date sentDate;

    @NotNull(message = "The sender id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long sender_id;

    @NotNull(message = "The receiver id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long receiver_id;

    @NotNull(message = "The course id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long course_id;
}
