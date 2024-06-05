package com.riwi.riwiplatform.infrastructure.services;

import com.riwi.riwiplatform.api.dto.request.LessonRequest;
import com.riwi.riwiplatform.api.dto.response.LessonResponse;
import com.riwi.riwiplatform.infrastructure.abstract_services.ILessonService;
import com.riwi.riwiplatform.utils.enums.SortType;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LessonService implements ILessonService {
    @Override
    public LessonResponse create(LessonRequest request) {
        return null;
    }

    @Override
    public LessonResponse get(Long id) {
        return null;
    }

    @Override
    public LessonResponse update(LessonRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<LessonResponse> getAll(int page, int size, SortType sort) {
        return null;
    }
}
