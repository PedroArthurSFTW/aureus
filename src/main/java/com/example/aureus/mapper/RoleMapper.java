package com.example.aureus.mapper;

import com.example.aureus.dto.role.RoleRequestDTO;
import com.example.aureus.dto.role.RoleResponseDTO;
import com.example.aureus.model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toEntity(RoleRequestDTO roleRequestDTO);
    RoleResponseDTO toDto(Role role);
}
