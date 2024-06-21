package com.riwi._01_librosya.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {

    @NotNull(message = "The reservation date is required")
    private Date reservationDate;

    @NotBlank(message = "The status is required")
    @Size(min = 0, max = 20, message = "The name is to long")
    private String status;

    @NotNull(message = "The user id is required")
    private Long userId;

    @NotNull(message = "The book id is required")
    private Long bookId;
}
