package com.homeworkwallet.library;

import org.springframework.stereotype.Service;

@Service

public class PutClientDetails {
    public static void main(String[] args) {

        MessagingService messagingService = new MessagingService();

        messagingService.setName("John");
        messagingService.setLastName("Cooper");
        messagingService.setCardNumber(5478172389123859l);
        messagingService.setId(1);

    }
}
