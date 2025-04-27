package com.example.aureus.dto.employee;

import java.time.LocalDate;
import java.util.UUID;

public record EmployeeResponseDTO (
        UUID id,
        String name,
        LocalDate dateOfBirth,
        Boolean isManager
){}
