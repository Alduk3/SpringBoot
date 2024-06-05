package com.riwi.riwiplatform.infrastructure.abstract_services;

import com.riwi.riwiplatform.api.dto.request.EnrollmentRequest;
import com.riwi.riwiplatform.api.dto.response.EnrollmentResponse;

public interface IEnrollmentService extends CRUDService<EnrollmentRequest, EnrollmentResponse, Long> {
}
