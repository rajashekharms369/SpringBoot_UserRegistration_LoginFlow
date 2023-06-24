package com.example.springboot_email_verificatino_demo.user;

import com.example.springboot_email_verificatino_demo.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();

    User registerUser(RegistrationRequest request) throws UserNameAlreadyExistsException;

    Optional<User> findByEmail(String Email);

    void saveUserVerificationToken(User theUser, String verificationToken);
}
