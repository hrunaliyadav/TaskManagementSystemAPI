package com.example.TaskManagementSystem.services;

import com.example.TaskManagementSystem.models.User;

public interface UserService {
    public User register(String username, String password);
    public User findByusername(String username);


}
