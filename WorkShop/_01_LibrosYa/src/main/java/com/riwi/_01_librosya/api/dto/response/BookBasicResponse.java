package com.riwi._01_librosya.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBasicResponse {
    private Long id;

    private String title;

    private String author;

    private Integer publicationYear;

    private String genre;

    private String isbn;
}
