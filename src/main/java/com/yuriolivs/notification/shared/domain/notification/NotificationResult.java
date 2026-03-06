package com.yuriolivs.notification.shared.domain.notification;

import com.yuriolivs.notification.shared.domain.schedule.enums.ScheduleStatus;
import lombok.ToString;

import java.util.UUID;

@ToString
public class NotificationResult {
    private UUID id;
    private UUID scheduleId;
    private ScheduleStatus status;
    private String message;

    public NotificationResult() {}

    public NotificationResult(
            UUID id,
            UUID scheduleId,
            ScheduleStatus status,
            String message
    ) {
        this.id = id;
        this.scheduleId = scheduleId;
        this.message = message;
        this.status = status;
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

    public ScheduleStatus getStatus() {
        return status;
    }

    public void setStatus(ScheduleStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
