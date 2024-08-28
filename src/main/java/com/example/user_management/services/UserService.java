package com.example.user_management.services;

import com.example.user_management.dtos.request.RegisterRequest;
import com.example.user_management.dtos.response.RegisterResponse;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    RegisterResponse register(RegisterRequest RegisterUser);

}
