package com.example.springboot_email_verificatino_demo.event;

import com.example.springboot_email_verificatino_demo.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {
    private User user;

    private String applicationUrl;

    public RegistrationCompleteEvent(Object source, User user, String applicationUrl) {
        super(source);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }

}
