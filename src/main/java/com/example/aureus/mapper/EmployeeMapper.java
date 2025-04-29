package com.example.aureus.mapper;

import com.example.aureus.dto.employee.EmployeeRequestDTO;
import com.example.aureus.dto.employee.EmployeeResponseDTO;
import com.example.aureus.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEntity(EmployeeRequestDTO employeeRequestDTO);
    EmployeeResponseDTO toDTO(Employee employee);
}
