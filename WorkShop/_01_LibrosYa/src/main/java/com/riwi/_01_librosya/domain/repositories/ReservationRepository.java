package com.riwi._01_librosya.domain.repositories;

import com.riwi._01_librosya.domain.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
