package com.homeworkwallet.library.dto;

// Object describing card details in REST API and what you will pass in messaging service between applications as well
// read what DTO means https://www.baeldung.com/java-dto-pattern
public class CardDetails {
    String cardNumber;
    String name;
    String lastName;

    public CardDetails(String cardNumber, String name, String lastName) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
