package com.example.springboot_email_verificatino_demo.event;

import com.example.springboot_email_verificatino_demo.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {
    private User user;

    private String applicationUrl;

    public RegistrationCompleteEvent(Object source, String applicationUrl) {
        super(source);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }

}
