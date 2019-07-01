package com.firebase.notification.service;


import com.firebase.notification.documents.NotificationMessage;
import com.firebase.notification.repositories.NotificationMessageRepository;
import com.firebase.notification.requests.NotificationMessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;


@Service
@Transactional
public class NotificationMessageServiceImpl implements NotificationMessageService {
    private final NotificationMessageRepository notificationMessageRepository;

    @Autowired
    public NotificationMessageServiceImpl(NotificationMessageRepository notificationMessageRepository) {
        this.notificationMessageRepository = notificationMessageRepository;
    }


    @Override
    public ResponseEntity createNotificationMessage(NotificationMessageRequest request) {
        Map<String,Object> map = new HashMap<>();

        NotificationMessage notificationMessage = new NotificationMessage();
        notificationMessage.setMsgBody(request.getMsgBody());
        notificationMessage.setPhone(request.getPhone());
        notificationMessage.setEmail(request.getEmail());
        notificationMessage.setPriority(request.getPriority());

        NotificationMessage saved = this.notificationMessageRepository.save(notificationMessage);


        map.put("message","Notification message created");
        map.put("message body",saved.getMsgBody());
        map.put("message email",saved.getEmail());
        map.put("message phone number",saved.getPhone());
        map.put("message priority",saved.getPriority());
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
