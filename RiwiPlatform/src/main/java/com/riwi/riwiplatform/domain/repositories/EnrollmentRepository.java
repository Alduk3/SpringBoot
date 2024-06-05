package com.riwi.riwiplatform.domain.repositories;

import com.riwi.riwiplatform.domain.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
