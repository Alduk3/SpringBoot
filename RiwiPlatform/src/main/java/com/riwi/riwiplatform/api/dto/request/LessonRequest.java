package com.riwi.riwiplatform.api.dto.request;

import com.riwi.riwiplatform.domain.entities.Course;
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
public class LessonRequest {

    @NotBlank(message = "The title is required")
    @Size(min = 1, max = 100, message = "The title is too long")
    private String title;

    @NotBlank(message = "The content is required")
    private String content;

    @NotNull(message = "The course id is required")
    @Min(value = 1, message = "The id can't be less than or equal to 0")
    private Long course_id;
}
