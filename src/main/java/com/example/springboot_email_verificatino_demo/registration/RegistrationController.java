package com.example.springboot_email_verificatino_demo.registration;

import com.example.springboot_email_verificatino_demo.user.User;
import com.example.springboot_email_verificatino_demo.user.UserNameAlreadyExistsException;
import com.example.springboot_email_verificatino_demo.user.UserRepository;
import com.example.springboot_email_verificatino_demo.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegistrationController {

    @Autowired
    private final UserService userService;

    @PostMapping
    public String registerUser(RegistrationRequest registrationRequest) throws UserNameAlreadyExistsException {
        User user = userService.registerUser(registrationRequest);
//        publish registration event
        return "Success, Please Check you email to complete the registration and then login";
    }



}
