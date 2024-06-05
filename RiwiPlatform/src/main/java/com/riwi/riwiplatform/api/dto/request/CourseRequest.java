package com.riwi.riwiplatform.api.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequest {

    @NotBlank(message = "The name is required")
    @Size(min = 0, max = 100, message = "The name is to long")
    private String name;

    @NotBlank(message = "The description is required")
    private String description;

    @NotNull(message = "The user id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long user_id;
}
