package com.homeworkwallet.library;

import org.springframework.stereotype.Service;

@Service
public class MessagingService implements PutClientDetails{

    @Override
    public String clientName() {
        return "John";
    }

    @Override
    public String clientLastName() {
        return "Cooper";
    }

    @Override
    public int clientId() {
        return 1;
    }

    @Override
    public long clientCardNumber() {
        return 2853049571289385L;
    }
}