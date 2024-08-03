package com.example.TaskManagementSystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDate due_date;
    private LocalDateTime created_At;
    private LocalDateTime updated_At;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
