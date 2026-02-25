package com.yuriolivs.notification.shared.domain.notification;

import com.yuriolivs.notification.shared.domain.notification.enums.NotificationPriority;

import java.util.Map;
import java.util.UUID;

public class NotificationSend {
    private UUID id;
    private NotificationPriority priority;
    private Map<String, String> payload;

    public NotificationSend(UUID id, NotificationPriority priority, Map<String, String> payload) {
        this.id = id;
        this.priority = priority;
        this.payload = payload;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public NotificationPriority getPriority() {
        return priority;
    }

    public void setPriority(NotificationPriority priority) {
        this.priority = priority;
    }

    public Map<String, String> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, String> payload) {
        this.payload = payload;
    }
}
