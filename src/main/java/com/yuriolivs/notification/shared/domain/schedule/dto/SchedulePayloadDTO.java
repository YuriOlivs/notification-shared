package com.yuriolivs.notification.shared.domain.schedule.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record SchedulePayloadDTO(
        @NotNull
        UUID id,

        @NotBlank
        String payload
) {}
