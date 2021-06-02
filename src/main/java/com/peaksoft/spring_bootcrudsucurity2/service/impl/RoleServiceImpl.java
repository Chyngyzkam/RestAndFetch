package com.peaksoft.spring_bootcrudsucurity2.service.impl;
import com.peaksoft.spring_bootcrudsucurity2.entity.Role;
import com.peaksoft.spring_bootcrudsucurity2.repository.RoleRepository;
import com.peaksoft.spring_bootcrudsucurity2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository userRepository) {
        this.roleRepository = userRepository;
    }


    @Override
    public List<String> getRoleNamesToList() {
        return roleRepository.getRoleNamesToList();
    }

    @Override
    public Role getRoleByName(String name) {
        List<Role>roles=getAllRoles();
        return roles.stream().filter(x->x.getRole().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}

