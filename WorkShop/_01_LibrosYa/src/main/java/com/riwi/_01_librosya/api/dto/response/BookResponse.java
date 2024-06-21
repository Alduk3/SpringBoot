package com.riwi._01_librosya.api.dto.response;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private Long id;

    private String title;

    private String author;

    private Integer publicationYear;

    private String genre;

    private String isbn;

    private List<ReservationToBookResponse> reservations;

    private List<LoanToBookResponse> loans;
}
