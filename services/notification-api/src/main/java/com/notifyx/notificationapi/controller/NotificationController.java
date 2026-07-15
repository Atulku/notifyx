package com.notifyx.notificationapi.controller;

import com.notifyx.notificationapi.dto.NotificationRequest;
import com.notifyx.notificationapi.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/v1/notifications")
@RequiredArgsConstructor
public class NotificationController {


    private final NotificationService service;


    @PostMapping
    public ResponseEntity<?> send(
            @RequestBody NotificationRequest request){

        String id = service.createNotification(request);

        return ResponseEntity.accepted().body(
                Map.of(
                        "notificationId", id,
                        "status", "ACCEPTED"
                )
        );
    }
}