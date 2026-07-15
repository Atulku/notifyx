package com.notifyx.notificationapi.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.Map;

@Data
@Builder
public class NotificationEvent {

    private String notificationId;

    private String userId;

    private String channel;

    private String templateId;

    private Map<String,Object> payload;

    private Instant createdAt;
}