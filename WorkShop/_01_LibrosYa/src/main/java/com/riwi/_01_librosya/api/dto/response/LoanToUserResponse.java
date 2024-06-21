package com.riwi._01_librosya.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanToUserResponse {

    private Long id;

    private Date loanDate;

    private Date returnDate;

    private String status;

    private BookBasicResponse book;
}
