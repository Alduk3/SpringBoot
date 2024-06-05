package com.riwi.riwiplatform.domain.repositories;

import com.riwi.riwiplatform.domain.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
