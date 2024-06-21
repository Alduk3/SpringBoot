package com.riwi._01_librosya.infrastructure.abstract_services;

import com.riwi._01_librosya.api.dto.request.ReservationRequest;
import com.riwi._01_librosya.api.dto.response.ReservationResponse;

public interface IReservationService extends CRUD<ReservationRequest, ReservationResponse, Long> {
}
