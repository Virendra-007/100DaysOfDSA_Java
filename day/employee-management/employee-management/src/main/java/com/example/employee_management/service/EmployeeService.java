package com.example.employee_management.service;

import com.example.employee_management.model.Employee;
import com.example.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee emp) {
        return repo.save(emp);
    }

    public Employee updateEmployee(Long id, Employee empDetails) {
        Employee emp = repo.findById(id).orElse(null);
        if (emp != null) {
            emp.setName(empDetails.getName());
            emp.setEmail(empDetails.getEmail());
            emp.setDepartment(empDetails.getDepartment());
            return repo.save(emp);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
