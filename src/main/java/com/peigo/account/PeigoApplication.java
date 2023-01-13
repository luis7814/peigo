package com.peigo.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PeigoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeigoApplication.class, args);
        System.out.println("pass " + new BCryptPasswordEncoder().encode("peigo"));
    }

}
