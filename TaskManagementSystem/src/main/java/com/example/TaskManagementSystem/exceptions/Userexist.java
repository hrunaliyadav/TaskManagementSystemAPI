package com.example.TaskManagementSystem.exceptions;

public class Userexist extends RuntimeException{
    public Userexist() {
    }

    public Userexist(String message) {
        super(message);
    }

    public Userexist(String message, Throwable cause) {
        super(message, cause);
    }
}
