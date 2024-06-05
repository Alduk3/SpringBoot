package com.riwi.riwiplatform.api.dto.request;

import com.riwi.riwiplatform.utils.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "The username is required")
    @Size(min = 0, max = 50)
    private String username;

    @NotBlank(message = "The password is required")
    @Size(min = 8)
    private String password;

    @NotBlank(message = "The email is required")
    @Size(min = 0, max = 100)
    private String email;

    @NotBlank(message = "The Full name is required")
    @Size(min = 0, max = 100)
    private String full_name;

    @NotNull(message = "The role is required")
    private UserRole role;
}
