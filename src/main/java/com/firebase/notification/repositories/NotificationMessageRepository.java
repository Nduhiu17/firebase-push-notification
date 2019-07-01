package com.firebase.notification.repositories;

import com.firebase.notification.documents.NotificationMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationMessageRepository extends MongoRepository<NotificationMessage,Integer> {
}
