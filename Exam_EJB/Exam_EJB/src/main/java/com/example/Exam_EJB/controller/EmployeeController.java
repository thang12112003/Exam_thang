package com.example.Exam_EJB.controller;

import com.example.Exam_EJB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("employees", employeeService.findAllEmployees());
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm() {
        return "create";
    }

    @PostMapping("/create")
    public String createEmployee(@RequestParam String name, @RequestParam double salary) {
        employeeService.createEmployee(name, salary);
        return "redirect:/index";
    }
}
