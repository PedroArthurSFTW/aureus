package com.example.aureus.dto.role;

import jakarta.validation.constraints.NotNull;

public record RoleRequestDTO(
        @NotNull
        String name,
        @NotNull
        Boolean isActive
) {
}
