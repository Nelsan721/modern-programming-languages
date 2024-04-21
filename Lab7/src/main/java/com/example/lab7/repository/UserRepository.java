package com.example.lab7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab7.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
