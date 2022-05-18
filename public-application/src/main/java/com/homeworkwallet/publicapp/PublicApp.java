package com.homeworkwallet.publicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.homeworkwallet.library", "com.homeworkwallet.publicapp"})

public class PublicApp {
    public static void main(String[] args) {
        SpringApplication.run(PublicApp.class, args);
    }
}


