package com.notifyx.notificationapi.service;

import com.notifyx.notificationapi.dto.NotificationRequest;
import com.notifyx.notificationapi.model.NotificationEvent;
import com.notifyx.notificationapi.producer.NotificationProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class NotificationService {


    private final NotificationProducer producer;


    public String createNotification(NotificationRequest request){

        String id = UUID.randomUUID().toString();


        NotificationEvent event =
                NotificationEvent.builder()
                        .notificationId(id)
                        .userId(request.getUserId())
                        .channel(request.getChannel())
                        .templateId(request.getTemplateId())
                        .payload(request.getPayload())
                        .createdAt(Instant.now())
                        .build();


        producer.publish(event);


        return id;
    }
}