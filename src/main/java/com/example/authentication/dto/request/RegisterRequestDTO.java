package com.example.authentication.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequestDTO {
    @NotBlank(message = "Name is required")
    private  String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6,message = "password must be 6 characters ")
    private String password;

    @NotBlank(message = "Confirm password is required")
    private String confirmPassword;

}
