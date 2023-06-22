package com.example.springboot_email_verificatino_demo.user;

import com.example.springboot_email_verificatino_demo.registration.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepostory;
    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User registerUser(RegistrationRequest request) {
        return null;
    }

    @Override
    public Optional<User> findByEmail(String Email) {
        return Optional.empty();
    }
}
