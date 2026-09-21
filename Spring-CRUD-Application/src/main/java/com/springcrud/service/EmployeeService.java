package com.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.entity.Employee;
import com.springcrud.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repo;

    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
