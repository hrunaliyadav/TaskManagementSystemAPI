package com.example.TaskManagementSystem.services;

import com.example.TaskManagementSystem.exceptions.Userexist;
import com.example.TaskManagementSystem.models.User;
import com.example.TaskManagementSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User register(String username, String password) {
        if (userRepository.findByUsername(username) != null) {
            throw new Userexist("User Already Exist");
        }
        //create new user
        User user = new User();
        user.setUsername(username);
        user.setPassword(bCryptPasswordEncoder.encode(password));
        return userRepository.save(user);
    }

    @Override
    public User findByusername(String username) {
        return userRepository.findByUsername(username);
    }
}
