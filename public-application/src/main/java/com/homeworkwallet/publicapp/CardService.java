package com.homeworkwallet.publicapp;

import com.homeworkwallet.library.messaging.MessagingService;
import com.homeworkwallet.library.dto.CardDetails;
import org.springframework.stereotype.Service;

// Service which is responsible for card details operations from public application
@Service
public class CardService {

    private final MessagingService messagingService;

    public CardService(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public CardDetails getCardDetailsByNumber(String cardNumber) {
/*         here in future you will call messaging service with some route, passing some data and returning some data back to you. This is just mock
         while this isn't implemented yet.*/
        var mockResponse = new CardDetails("5105105105105100", "Vasja", "Pupkin");

        return mockResponse;
    }
}
