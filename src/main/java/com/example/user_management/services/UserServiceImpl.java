package com.example.user_management.services;

import com.example.user_management.data.model.User;
import com.example.user_management.dtos.request.RegisterRequest;
import com.example.user_management.dtos.response.RegisterResponse;
import com.example.user_management.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public  final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public RegisterResponse register(RegisterRequest registerUser) {
        User user = new User();
        user.setName(registerUser.getName());
        user.setPhoneNumber(registerUser.getPhoneNumber());
        user.setEmailAddress(registerUser.getEmailAddress());
        userRepository.save(user);

        RegisterResponse registerUserResponse = new RegisterResponse();
        registerUserResponse.setMessage("User Registered successfully");
        return registerUserResponse;
    }
}
