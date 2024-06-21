package com.riwi._01_librosya.api.dto.response;


import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String fullName;

    private String role;

    private List<ReservationToUserResponse> reservations;

    private List<LoanToUserResponse> loans;
}
