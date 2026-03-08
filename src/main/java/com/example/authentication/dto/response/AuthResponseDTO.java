package com.example.authentication.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponseDTO {
    private String name;
    private String email;
    private String role;
    private String token;
}
