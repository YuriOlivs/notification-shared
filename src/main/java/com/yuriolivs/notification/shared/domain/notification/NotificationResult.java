package com.yuriolivs.notification.shared.domain.notification;

import java.util.UUID;

public class NotificationResult {
    private UUID id;
    private UUID scheduleId;
    private boolean successful;
    private String message;

    public NotificationResult() {}

    public NotificationResult(
            UUID id,
            UUID scheduleId,
            boolean successful,
            String message
    ) {
        this.id = id;
        this.scheduleId = scheduleId;
        this.successful = successful;
        this.message = message;
    }

    public NotificationResult(
            UUID id,
            UUID scheduleId
    ) {
        this.id = id;
        this.scheduleId = scheduleId;
    }

    public static NotificationResult from(NotificationMessage message) {
        return new NotificationResult(
                message.getId(),
                message.getScheduleId()
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(UUID scheduleId) {
        this.scheduleId = scheduleId;
    }

    public boolean success() {
        return successful;
    }

    public void setSuccess(boolean wasSucessful) {
        this.successful = wasSucessful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
