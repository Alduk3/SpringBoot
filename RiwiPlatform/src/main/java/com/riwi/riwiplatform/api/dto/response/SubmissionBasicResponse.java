package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Assignment;
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
public class SubmissionBasicResponse {
    private Long id;
    private String content;
    private Date submission_date;
    private BigDecimal grade;
    //private Assignment assignment;
}

