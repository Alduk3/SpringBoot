package com.riwi._01_librosya.infrastructure.abstract_services;

import com.riwi._01_librosya.api.dto.request.BookRequest;
import com.riwi._01_librosya.api.dto.response.BookResponse;

public interface IBookService extends CRUD<BookRequest, BookResponse, Long> {
}
