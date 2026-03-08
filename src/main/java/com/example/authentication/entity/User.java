package com.example.authentication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false)
    private  String name ;
    @Column(nullable = false,unique = true)
    private  String email;

    @Column(nullable = false)
    private String password;

    private boolean isVerified = false;
    private boolean isActive = true;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    public  enum Role{
        USER,ADMIN
    }




}

