package com.riwi._01_librosya.domain.repositories;

import com.riwi._01_librosya.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
