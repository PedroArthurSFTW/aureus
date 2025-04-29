package com.example.aureus.model;

import jakarta.persistence.*;
import lombok.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @NotNull
    @Past
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @OneToOne(mappedBy = "employee")
    private User user;

    @Column(name = "is_manager")
    private Boolean isManager;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @OneToMany(mappedBy = "manager")
    private List<Account> managedAccounts;
}
