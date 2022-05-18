package com.homeworkwallet.publicapp;

import com.homeworkwallet.library.MessagingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicAppRestController {

    private final MessagingService messagingService;

    public PublicAppRestController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @GetMapping
    public String get() {
        return messagingService.sendMessage();
    }
}
