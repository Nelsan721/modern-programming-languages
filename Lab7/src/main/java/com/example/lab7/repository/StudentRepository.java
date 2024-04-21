package com.example.lab7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lab7.entity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long>{
}
