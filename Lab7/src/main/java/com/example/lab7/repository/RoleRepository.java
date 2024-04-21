package com.example.lab7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab7.entity.Role;
public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByName (String name);
}
