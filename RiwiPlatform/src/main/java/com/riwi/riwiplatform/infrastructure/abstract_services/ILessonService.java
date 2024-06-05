package com.riwi.riwiplatform.infrastructure.abstract_services;

import com.riwi.riwiplatform.api.dto.request.LessonRequest;
import com.riwi.riwiplatform.api.dto.response.LessonResponse;

public interface ILessonService extends CRUDService<LessonRequest, LessonResponse, Long> {
}
