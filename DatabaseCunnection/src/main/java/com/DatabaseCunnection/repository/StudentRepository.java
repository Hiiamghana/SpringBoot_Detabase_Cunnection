package com.DatabaseCunnection.repository;

import com.DatabaseCunnection.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
