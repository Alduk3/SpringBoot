package com.riwi.riwiplatform.api.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentRequest {
    @NotBlank(message = "The title is required")
    @Size(min = 0, max = 100, message = "The name is to long")
    private String title;

    @NotBlank(message = "The description is required")
    private String description;

    private Date due_date;

    @NotNull(message = "The lesson id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long lesson_id;

}
