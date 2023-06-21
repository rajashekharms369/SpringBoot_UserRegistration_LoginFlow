package com.example.springboot_email_verificatino_demo.registration;

public record RegistrationRequest(String firstName, String lastName, String email, String password,
                                  String role) {

}
