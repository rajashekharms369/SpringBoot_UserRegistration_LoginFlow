package com.example.springboot_email_verificatino_demo.registration;

import com.example.springboot_email_verificatino_demo.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class VerficationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    private Date expirationTime;

    private static final int EXPIRATION_TIME = 15;

    @OneToOne
    private User user;

    public VerficationToken(String token, User user) {
        this.token = token;
        this.user = user;
        this.expirationTime = this.getTokenExpirationTime();
    }

    private Date getTokenExpirationTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        calendar.add(Calendar.MINUTE, EXPIRATION_TIME);
        return new Date(calendar.getTime().getTime());
    }
}
