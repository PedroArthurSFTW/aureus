package com.example.aureus.service;

import com.example.aureus.dto.role.RoleRequestDTO;
import com.example.aureus.dto.role.RoleResponseDTO;
import com.example.aureus.mapper.RoleMapper;
import com.example.aureus.model.Role;
import com.example.aureus.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleResponseDTO createRole(RoleRequestDTO roleRequestDTO) {
        Role role = roleMapper.toEntity(roleRequestDTO);
        Role savedRole = roleRepository.save(role);
        return roleMapper.toDto(savedRole);
    }

    public RoleResponseDTO getRoleById(Long id) {
        return roleMapper.toDto(roleRepository.findById(id).orElse(null));
    }

    public List<RoleResponseDTO> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roles.stream()
                .map(roleMapper::toDto)
                .collect(Collectors.toList());
    }
}
