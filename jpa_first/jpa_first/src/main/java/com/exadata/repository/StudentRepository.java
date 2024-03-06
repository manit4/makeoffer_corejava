package com.exadata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exadata.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	@Query(value = "select * from student inner join address on student_id = id", nativeQuery = true)
	public List<Student> getStudent();

}
