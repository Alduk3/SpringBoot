package com.riwi._01_librosya.domain.repositories;

import com.riwi._01_librosya.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
