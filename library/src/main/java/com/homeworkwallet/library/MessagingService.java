package com.homeworkwallet.library;

import org.springframework.stereotype.Service;

@Service
public class MessagingService {

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public long getCardNumber () {
            return cardNumber;
        }

        public void setCardNumber ( long cardNumber){
            this.cardNumber = cardNumber;
        }

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        private String name;
        private String lastName;
        private long cardNumber;
        private int id;

    public String getClientInfo() {
        return getName() + getLastName() + getCardNumber() + getId();
    }

    }