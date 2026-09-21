package com.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.entity.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

}