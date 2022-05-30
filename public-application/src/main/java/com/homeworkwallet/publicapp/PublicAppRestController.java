package com.homeworkwallet.publicapp;

import com.homeworkwallet.library.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicAppRestController {

    private final MessagingService messagingService;
    private final PutClientDetails putClientDetails;
    private final RemoveClientDetails removeClientDetails;
    private final UpdateClientDetails updateClientDetails;

    public PublicAppRestController(MessagingService messagingService, PutClientDetails putClientDetails, RemoveClientDetails removeClientDetails, UpdateClientDetails updateClientDetails) {
        this.messagingService = messagingService;
        this.putClientDetails = putClientDetails;
        this.removeClientDetails = removeClientDetails;
        this.updateClientDetails = updateClientDetails;
    }

    @GetMapping
    public String get() {
        return messagingService.clientName() + messagingService.clientLastName() +messagingService.clientId() + messagingService.clientCardNumber() + removeClientDetails.remove() + updateClientDetails.updated();
    }
}
