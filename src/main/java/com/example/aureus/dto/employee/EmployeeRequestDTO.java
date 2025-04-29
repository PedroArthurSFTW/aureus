package com.example.aureus.dto.employee;

import com.example.aureus.model.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record EmployeeRequestDTO (
    @NotBlank(message = "Name cannot be blank")
    @Size(max = 100, message = "Name must be less than 100 characters")
    String name,

    @NotNull
    @Past(message = "Date of birth must be in the past")
    LocalDate dateOfBirth,

    @NotNull(message = "Manager status cannot be null")
    Boolean isManager,

    @NotNull(message = "role id cannot be null")
    Role role
    ){}
