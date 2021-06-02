package com.peaksoft.spring_bootcrudsucurity2.service;


import com.peaksoft.spring_bootcrudsucurity2.entity.Role;

import java.util.List;

public interface RoleService {

    List<String> getRoleNamesToList();

    Role getRoleByName(String name);

    List<Role> getAllRoles();
}


