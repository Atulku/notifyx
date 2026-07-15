package com.notifyx.notificationapi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Map;

@Data
public class NotificationRequest {

    @NotBlank
    private String userId;

    @NotBlank
    private String channel;

    @NotBlank
    private String templateId;

    private Map<String, Object> payload;
}