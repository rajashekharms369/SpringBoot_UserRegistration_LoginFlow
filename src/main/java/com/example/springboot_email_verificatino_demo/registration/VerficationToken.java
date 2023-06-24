package com.example.springboot_email_verificatino_demo.registration;

import com.example.springboot_email_verificatino_demo.user.User;

import java.util.Date;

public class VerficationToken {
    private Long id;
    private String token;
    private Date expirationTime;
    private User user;
}
