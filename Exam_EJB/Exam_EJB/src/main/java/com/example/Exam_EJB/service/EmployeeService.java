package com.example.Exam_EJB.service;

import com.example.Exam_EJB.model.Employee;
import com.example.Exam_EJB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void createEmployee(String name, double salary) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setSalary(salary);
        employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
