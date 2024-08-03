package com.example.TaskManagementSystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Task> tasks;
}
