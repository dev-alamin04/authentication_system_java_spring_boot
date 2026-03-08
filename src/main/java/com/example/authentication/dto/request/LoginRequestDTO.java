package com.example.authentication.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDTO {

    @Email(message = "Invalid email address")
    @NotBlank(message = "Email is Required")
    private String email;

    @NotBlank(message = "password is Required")
    private String password;



}
