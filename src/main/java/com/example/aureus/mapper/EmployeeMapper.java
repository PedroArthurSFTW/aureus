package com.example.aureus.mapper;

import com.example.aureus.dto.employee.EmployeeRequestDTO;
import com.example.aureus.dto.employee.EmployeeResponseDTO;
import com.example.aureus.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    Employee toEntity(EmployeeRequestDTO employeeRequestDTO);
    EmployeeResponseDTO toDTO(Employee employee);
}
