package com.develhope.controller_protection_01.repositories;

import com.develhope.controller_protection_01.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String registered);
}
