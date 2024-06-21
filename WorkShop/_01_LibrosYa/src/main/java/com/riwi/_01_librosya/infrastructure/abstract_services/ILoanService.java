package com.riwi._01_librosya.infrastructure.abstract_services;

import com.riwi._01_librosya.api.dto.request.LoanRequest;
import com.riwi._01_librosya.api.dto.response.LoanResponse;

public interface ILoanService extends CRUD<LoanRequest, LoanResponse, Long> {
}
