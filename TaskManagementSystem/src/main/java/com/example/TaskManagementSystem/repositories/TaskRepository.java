package com.example.TaskManagementSystem.repositories;

import com.example.TaskManagementSystem.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
    List<Task> findByPriority(String priority);
    List<Task> findByDueDate(String dueDate);
    List<Task> findByTitleContainingOrDescriptionContaining(String title, String description);
}
