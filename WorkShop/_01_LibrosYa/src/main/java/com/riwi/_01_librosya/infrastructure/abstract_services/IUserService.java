package com.riwi._01_librosya.infrastructure.abstract_services;

import com.riwi._01_librosya.api.dto.request.UserRequest;
import com.riwi._01_librosya.api.dto.response.UserResponse;

public interface IUserService extends CRUD<UserRequest, UserResponse, Long> {
}
