package com.yuriolivs.notification.shared.domain.schedule.dto;

import java.util.UUID;

public record SchedulePayloadDTO(
        UUID id,
        String payload
) {}
