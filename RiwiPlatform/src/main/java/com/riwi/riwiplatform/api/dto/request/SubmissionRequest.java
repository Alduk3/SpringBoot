package com.riwi.riwiplatform.api.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionRequest {
    @NotBlank(message = "The content is required ")
    private String content;

    @NotBlank(message = "Submission date is required")
    private Date submission_date;

    @DecimalMin(value = "0.01", message = "The grade value can't be less than 0")
    private BigDecimal grade;

    @NotNull(message = "The user id is required")
    @Min(value = 1, message = "the id can't be less than 0")
    private Long user_id;

    @NotNull(message = "The assignment id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long assignment_id;
}
