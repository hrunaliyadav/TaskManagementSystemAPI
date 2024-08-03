package com.example.TaskManagementSystem.services;

import com.example.TaskManagementSystem.models.Task;

import java.util.List;

public interface TaskService {
    public Task createTask(Task task);
    public List<Task> getAllTasks();
    public Task updateTask(Task task);
    public void deleteTask(Long taskId);
}
