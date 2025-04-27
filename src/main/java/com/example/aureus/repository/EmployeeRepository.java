package com.example.aureus.repository;

import com.example.aureus.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    List<Employee> findByNameContaining(String name);
    List<Employee> findByIsManager(Boolean isManager);
}
