package com.example.aureus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
