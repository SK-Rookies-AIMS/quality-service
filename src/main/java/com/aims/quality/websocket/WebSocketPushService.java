package com.aims.quality.websocket;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebSocketPushService {

    private final SimpMessagingTemplate messagingTemplate;

    public void sendSummary(Object summary){

        messagingTemplate.convertAndSend(
                "/topic/summary",
                summary
        );
    }

    public void sendProcess(Object process){

        messagingTemplate.convertAndSend(
                "/topic/process",
                process
        );
    }

    public void sendDrive(Object drive){

        messagingTemplate.convertAndSend(
                "/topic/drive-detail",
                drive
        );
    }

    public void sendStatus(Object status){

        messagingTemplate.convertAndSend(
                "/topic/status-detail",
                status
        );
    }

    @PostConstruct
    public void init() {
        System.out.println(messagingTemplate.getClass());
    }
}