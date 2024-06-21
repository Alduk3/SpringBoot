package com.riwi._01_librosya.api.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    @NotBlank(message = "The title is required")
    @Size(max = 100, message = "the title is to long")
    private String title;

    @NotBlank(message = "The author is required")
    @Size(max = 100, message = "the author is to long")
    private String author;

    @NotNull(message = "The publication year is required")
    private Integer publicationYear;

    @NotBlank(message = "The genre is required")
    @Size(max = 50, message = "the genre is to long")
    private String genre;

    @NotBlank(message = "The isbn is required")
    @Size(max = 20, message = "the isbn is to long")
    private String isbn;
}
