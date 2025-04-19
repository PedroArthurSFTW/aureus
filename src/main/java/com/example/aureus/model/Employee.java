package com.example.aureus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @OneToMany(mappedBy = "manager")
    private List<Account> managedAccounts;
}
