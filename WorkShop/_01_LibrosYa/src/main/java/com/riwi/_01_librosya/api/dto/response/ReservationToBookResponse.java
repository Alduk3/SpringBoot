package com.riwi._01_librosya.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationToBookResponse {
    private Long id;

    private Date reservationDate;

    private String status;

    private UserBasicResponse user;
}
