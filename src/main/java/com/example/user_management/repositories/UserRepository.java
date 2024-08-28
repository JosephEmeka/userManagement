package com.example.user_management.repositories;

import com.example.user_management.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
//    User findById(String Id);
}
