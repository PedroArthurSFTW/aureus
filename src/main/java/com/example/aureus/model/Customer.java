package com.example.aureus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "resgistration_at")
    private LocalDateTime registrationAt;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "biling_adress")
    private String bilingAddress;
}
