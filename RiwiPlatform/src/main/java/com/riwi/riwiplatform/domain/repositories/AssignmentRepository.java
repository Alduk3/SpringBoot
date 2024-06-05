package com.riwi.riwiplatform.domain.repositories;

import com.riwi.riwiplatform.domain.entities.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
