package com.dydata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dydata.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
