package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.domain.entities.Lesson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentBasicResponse {

    private int id;
    private String title;
    private String description;
    private Date due_date;

    //private Lesson lesson;

}
