package com.riwi.riwiplatform.infrastructure.services;

import com.riwi.riwiplatform.api.dto.request.SubmissionRequest;
import com.riwi.riwiplatform.api.dto.response.SubmissionResponse;
import com.riwi.riwiplatform.infrastructure.abstract_services.ISubmissionService;
import com.riwi.riwiplatform.utils.enums.SortType;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubmissionService implements ISubmissionService {
    @Override
    public SubmissionResponse create(SubmissionRequest request) {
        return null;
    }

    @Override
    public SubmissionResponse get(Long id) {
        return null;
    }

    @Override
    public SubmissionResponse update(SubmissionRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SubmissionResponse> getAll(int page, int size, SortType sort) {
        return null;
    }
}
