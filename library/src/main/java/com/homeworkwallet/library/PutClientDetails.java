package com.homeworkwallet.library;

import org.springframework.stereotype.Service;

@Service

public interface PutClientDetails {

        String clientName();
        String clientLastName();
        int clientId();
        long clientCardNumber();
}
