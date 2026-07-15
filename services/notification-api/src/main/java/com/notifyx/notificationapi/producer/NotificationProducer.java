package com.notifyx.notificationapi.producer;

import com.notifyx.notificationapi.model.NotificationEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class NotificationProducer {

    private final KafkaTemplate<String, NotificationEvent> kafkaTemplate;


    public void publish(NotificationEvent event){

        kafkaTemplate.send(
                "notification-events",
                event.getNotificationId(),
                event
        );
    }
}