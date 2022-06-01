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

    public CardDetails createCardDetails(CardDetails cardDetails) {
        var mockResponse = new CardDetails(cardDetails.getCardNumber(), cardDetails.getName(), cardDetails.getLastName());
        return mockResponse;
    }

    public CardDetails getCardDetailsByNumber(String cardNumber) {
        var mockResponse = new CardDetails("5105105105105100", "Vasja", "Pupkin");
        return mockResponse;
    }

    public CardDetails updateCardDetails(CardDetails cardDetails) {
        var mockResponse = new CardDetails(cardDetails.getCardNumber(), cardDetails.getName(), cardDetails.getLastName());
        return mockResponse;
    }

    public CardDetails deleteUser(String cardNumber) {
        var deletedMockResponse = new CardDetails(cardNumber, "Vasja", "Pupkin");
        return deletedMockResponse;
    }
}
