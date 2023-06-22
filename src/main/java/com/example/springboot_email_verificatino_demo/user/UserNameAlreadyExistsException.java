package com.example.springboot_email_verificatino_demo.user;

public class UserNameAlreadyExistsException extends Throwable {
    public UserNameAlreadyExistsException() {
    }

    public UserNameAlreadyExistsException(String message) {
        super(message);
    }
}
