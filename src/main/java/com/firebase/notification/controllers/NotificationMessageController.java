package com.firebase.notification.controllers;

import com.firebase.notification.requests.NotificationMessageRequest;
import com.firebase.notification.service.NotificationMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NotificationMessageController {
    private final NotificationMessageService notificationMessageService;

    @Autowired
    public NotificationMessageController(NotificationMessageService notificationMessageService) {
        this.notificationMessageService = notificationMessageService;
    }

    @PostMapping("/create-notification")
    public ResponseEntity createNotificationMessage(@Valid @RequestBody NotificationMessageRequest request){
        return this.notificationMessageService.createNotificationMessage(request);
    }
}
