package com.yuriolivs.notification.shared.domain.schedule.dto;

import java.util.List;

public record ScheduledPayloadResponseDTO(
        List<SchedulePayloadDTO> list
) {}
