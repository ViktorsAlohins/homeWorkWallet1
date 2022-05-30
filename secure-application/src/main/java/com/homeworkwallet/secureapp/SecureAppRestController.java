package com.homeworkwallet.secureapp;

import com.homeworkwallet.library.messaging.MessagingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureAppRestController {

    private final MessagingService messagingService;

    public SecureAppRestController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @GetMapping
    public String get() {
        return "mock";
    }
}
