package com.riwi.riwiplatform.infrastructure.abstract_services;

import com.riwi.riwiplatform.api.dto.request.CourseRequest;
import com.riwi.riwiplatform.api.dto.response.CourseResponse;

public interface ICourseService extends CRUDService<CourseRequest, CourseResponse, Long> {
}
