package com.riwi.riwiplatform.infrastructure.abstract_services;

import com.riwi.riwiplatform.api.dto.request.UserRequest;
import com.riwi.riwiplatform.api.dto.response.UserResponse;

public interface IUserService extends CRUDService<UserRequest, UserResponse, Long>{
    public String FIELD_BY_SORT = "fisrtname";
}
