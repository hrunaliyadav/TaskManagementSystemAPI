package com.example.TaskManagementSystem.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class Password_Encoder {
    @Bean
    public BCryptPasswordEncoder getbcryptpasswordencoder(){
        return new BCryptPasswordEncoder();
    }
}
