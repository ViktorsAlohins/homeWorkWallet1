package com.homeworkwallet.secureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.homeworkwallet.library", "com.homeworkwallet.secureapp"})
public class SecureApp {

    public static void main(String[] args) {
        SpringApplication.run(SecureApp.class, args);
    }
}


