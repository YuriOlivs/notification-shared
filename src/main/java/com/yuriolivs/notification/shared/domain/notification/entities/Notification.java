package com.yuriolivs.notification.shared.domain.notification.entities;

import com.yuriolivs.notification.shared.domain.notification.enums.NotificationChannel;
import com.yuriolivs.notification.shared.domain.notification.enums.NotificationPriority;
import com.yuriolivs.notification.shared.domain.notification.enums.NotificationStatus;
import com.yuriolivs.notification.shared.domain.notification.enums.NotificationType;

import java.time.LocalDateTime;
import java.util.UUID;

public class Notification {
    private UUID id;

    private String idempotencyKey;

    private NotificationChannel channel;

    private String recipient;

    private String template;

    private NotificationType type;

    private NotificationStatus status;

    private NotificationPriority priority;

    private LocalDateTime createdAt;

    private String payload;

    public Notification(
        String idempotencyKey,
        NotificationChannel channel,
        String recipient,
        String template,
        NotificationType type,
        NotificationStatus status,
        NotificationPriority priority,
        LocalDateTime createdAt,
        String payload
    ) {
        this.idempotencyKey = idempotencyKey;
        this.channel = channel;
        this.recipient = recipient;
        this.template = template;
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
        this.payload = payload;
    }

    public UUID getId() {
        return id;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public NotificationStatus getStatus() {
        return status;
    }

    public void setStatus(NotificationStatus status) {
        this.status = status;
    }

    public NotificationPriority getPriority() {
        return priority;
    }

    public void setPriority(NotificationPriority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
