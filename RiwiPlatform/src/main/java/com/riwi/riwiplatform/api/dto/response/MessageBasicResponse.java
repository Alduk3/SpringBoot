package com.riwi.riwiplatform.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageBasicResponse {
    private Long id;

    private String message;
    private Date sentDate;
}
