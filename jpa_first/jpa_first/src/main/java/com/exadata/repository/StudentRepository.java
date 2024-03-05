package com.exadata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exadata.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
