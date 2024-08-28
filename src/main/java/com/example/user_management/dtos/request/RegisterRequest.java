package com.example.user_management.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterRequest {
    private String name;
    private String phoneNumber;
    private String emailAddress;
}
