package com.example.springboot_email_verificatino_demo.listener;

import com.example.springboot_email_verificatino_demo.event.RegistrationCompleteEvent;
import com.example.springboot_email_verificatino_demo.user.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
//        1. Get the newly registered User
        User theUser = event.getUser();
//        2. Create a verification token for the user
        String verificationToken = UUID.randomUUID().toString();
//        3. Save the verification token for the user.

//        4. Build the verification URL to be sent to the user.
        String url = event.getApplicationUrl()+"/register/verifyYourEmail?token="+verificationToken;
//        5. Send the email
        log.info("Click the link to verify your registration: {}", url);
    }
}
