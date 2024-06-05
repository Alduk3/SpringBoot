package com.riwi.riwiplatform.api.dto.request;

import jakarta.validation.constraints.Min;
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
public class EnrollmentRequest {
    private Date enrollmentDate;

    @NotNull(message = "The user id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long user_id;

    @NotNull(message = "The course id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long course_id;
}
