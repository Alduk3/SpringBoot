package com.riwi._01_librosya.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicResponse {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String fullName;

    private String role;
}
