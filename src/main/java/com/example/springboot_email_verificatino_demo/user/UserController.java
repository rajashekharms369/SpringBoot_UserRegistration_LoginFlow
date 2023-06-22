package com.example.springboot_email_verificatino_demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    public ResponseEntity<List<User>> getAllUsers(){
        List<User> list = userService.getUsers();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
