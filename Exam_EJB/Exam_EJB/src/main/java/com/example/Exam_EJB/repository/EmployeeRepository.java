package com.example.Exam_EJB.repository;

import com.example.Exam_EJB.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
