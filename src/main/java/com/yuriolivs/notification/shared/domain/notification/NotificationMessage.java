package com.yuriolivs.notification.shared.domain.notification;

import com.yuriolivs.notification.shared.domain.notification.enums.NotificationChannel;
import com.yuriolivs.notification.shared.domain.notification.enums.NotificationPriority;

import java.util.Map;
import java.util.UUID;

public class NotificationMessage {
    private UUID id;
    private NotificationPriority priority;
    private Map<String, String> payload;
    private NotificationChannel channel;
    private UUID scheduleId;

    public NotificationMessage() {}

    public NotificationMessage(
            UUID id,
            NotificationPriority priority,
            Map<String, String> payload,
            NotificationChannel channel
    ) {
        this.id = id;
        this.priority = priority;
        this.payload = payload;
        this.channel = channel;
    }

    public NotificationMessage(
            UUID id,
            NotificationPriority priority,
            Map<String, String> payload,
            NotificationChannel channel,
            UUID scheduleId
    ) {
        this.id = id;
        this.priority = priority;
        this.payload = payload;
        this.channel = channel;
        this.scheduleId = scheduleId;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
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

    public UUID getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(UUID scheduleId) {
        this.scheduleId = scheduleId;
    }
}
