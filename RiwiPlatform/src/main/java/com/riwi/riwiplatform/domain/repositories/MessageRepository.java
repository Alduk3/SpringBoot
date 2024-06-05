package com.riwi.riwiplatform.domain.repositories;

import com.riwi.riwiplatform.domain.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
