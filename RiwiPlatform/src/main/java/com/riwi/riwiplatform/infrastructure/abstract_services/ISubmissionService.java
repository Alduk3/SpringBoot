package com.riwi.riwiplatform.infrastructure.abstract_services;

import com.riwi.riwiplatform.api.dto.request.SubmissionRequest;
import com.riwi.riwiplatform.api.dto.response.SubmissionResponse;

public interface ISubmissionService extends CRUDService<SubmissionRequest, SubmissionResponse, Long> {
}
