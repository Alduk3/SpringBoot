package com.riwi._01_librosya.api.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "Username is required")
    @Size(min = 0, max = 50, message = "The username is to long")
    private String username;

    @NotNull(message = "The password is required")
    @Size(min = 0, max = 100, message = "The password is to long")
    private String password;

    @NotNull(message = "the email is required")
    @Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", message = "Your email is not valid")
    @Size(min = 0, max = 100, message = "The email is to long")
    private String email;

    @NotNull(message = "The full name is required")
    @Size(min = 0, max = 100, message = "The full name is to long")
    private String fullName;

    @NotNull(message = "The role is required")
    @Size(min = 0, max = 20, message = "The role is to long")
    private String role;
}
