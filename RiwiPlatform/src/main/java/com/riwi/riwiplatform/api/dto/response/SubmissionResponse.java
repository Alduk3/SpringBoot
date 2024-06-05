package com.riwi.riwiplatform.api.dto.response;


import com.riwi.riwiplatform.domain.entities.Assignment;
import com.riwi.riwiplatform.domain.entities.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class SubmissionResponse {
    private Long id;
    private String content;
    private Date submission_date;
    private BigDecimal grade;
    private UserBasicResponse user;

    private AssignmentBasicResponse assignment;
}
