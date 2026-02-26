package com.yuriolivs.notification.shared.domain.schedule.dto;

import java.util.List;
import java.util.UUID;

public record SchedulePayloadRequestDTO(
        List<UUID> ids
) { }
