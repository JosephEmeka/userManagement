package com.example.user_management.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterResponse {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String message;
}
