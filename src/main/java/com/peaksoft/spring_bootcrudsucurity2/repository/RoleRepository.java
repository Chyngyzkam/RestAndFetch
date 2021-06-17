package com.peaksoft.spring_bootcrudsucurity2.repository;

import com.peaksoft.spring_bootcrudsucurity2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("select role from Role")
    List<String> getRoleNamesToList();
}

