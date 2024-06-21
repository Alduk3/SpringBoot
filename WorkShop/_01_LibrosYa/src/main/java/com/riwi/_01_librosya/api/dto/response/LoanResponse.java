package com.riwi._01_librosya.api.dto.response;

import com.riwi._01_librosya.domain.entities.Book;
import com.riwi._01_librosya.domain.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {

    private Long id;

    private Date loanDate;

    private Date returnDate;

    private String status;

    private UserBasicResponse user;

    private BookBasicResponse book;
}
