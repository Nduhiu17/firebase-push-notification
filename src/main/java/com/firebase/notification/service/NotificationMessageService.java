package com.firebase.notification.service;

import com.firebase.notification.requests.NotificationMessageRequest;
import org.springframework.http.ResponseEntity;

public interface NotificationMessageService {

    ResponseEntity createNotificationMessage(NotificationMessageRequest request);

}
