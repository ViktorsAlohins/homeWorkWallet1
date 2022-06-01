package com.homeworkwallet.publicapp;

import com.homeworkwallet.library.dto.CardDetails;
import com.homeworkwallet.library.messaging.MessagingService;
import org.springframework.stereotype.Service;

// Service which is responsible for card details operations from public application
@Service
public class CardService {

    private final MessagingService messagingService;

    public CardService(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public CardDetails createCardDetails() {
        var mockResponse = new CardDetails("5105105105105100", "Pupka", "Vasin");
        return mockResponse;
    }

    public CardDetails getCardDetailsByNumber(String cardNumber) {
/*         here in future you will call messaging service with some route, passing some data and returning some data back to you. This is just mock
         while this isn't implemented yet.*/
        var mockResponse = new CardDetails("5105105105105100", "Vasja", "Pupkin");

        return mockResponse;
    }

    public CardDetails updateCardDetails(String cardNumber, String name, String lastName) {
        var updatedMockResponse = new CardDetails("50511337228814488", "Petja", "Popkin");
        return updatedMockResponse;
    }

    public CardDetails deletedUser(boolean isUserDeleted) {
        var deletedMockResponse = new CardDetails("0", "0", "0");
        return deletedMockResponse;
    }
}
