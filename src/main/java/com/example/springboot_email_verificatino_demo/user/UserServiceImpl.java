package com.example.springboot_email_verificatino_demo.user;

import com.example.springboot_email_verificatino_demo.registration.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepostory;
    @Override
    public List<User> getUsers() {
        return userRepostory.findAll();
    }

    @Override
    public User registerUser(RegistrationRequest request) throws UserNameAlreadyExistsException {
        Optional<User> user = this.findByEmail(request.email());
        if(user.isPresent()){
            throw new UserNameAlreadyExistsException("User with email "+ request.email()+" Already Exists");
        }
        var newUser = new User();
        newUser.setFirstName(request.firstName());
        newUser.setLastName(request.lastName());
        newUser.setEmail(request.email());
        newUser.setPassword(request.password());
        newUser.setRole(request.role());
        return userRepostory.save(newUser);
    }

    @Override
    public Optional<User> findByEmail(String Email) {
        return userRepostory.findByEmail(Email);
    }
}
