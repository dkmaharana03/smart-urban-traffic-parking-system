package com.smartcity.auth.dto;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterResponse {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String role;

    private String message;

}