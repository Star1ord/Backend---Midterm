package com.midterm.midterm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ModelController {

    private List<Employee> employees = new ArrayList<>();

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/employees")
    public String students(Model model) {
        model.addAttribute("employees", employees);
        return "employees";
    }

    @GetMapping("/addEmployee")
    public String add(Model model) {
        model.addAttribute("employees", new Employee());
        return "addEmployee";
    }

    @PostMapping("/addEmployee")
    public String addStudent(@ModelAttribute Employee employee) {
        employees.add(employee);
        System.out.println(employee.getFirstname() + " " + employee.getLastname() + " "
                + employee.getSalary() + " " + employee.getAge());
        return "redirect:/employees";
    }
}