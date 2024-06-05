package com.riwi.riwiplatform.api.dto.response;

import com.riwi.riwiplatform.utils.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicResponse {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String full_name;
    private UserRole role;
}
