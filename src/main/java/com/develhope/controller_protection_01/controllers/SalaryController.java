package com.develhope.controller_protection_01.controllers;

import com.develhope.controller_protection_01.entities.Roles;
import com.develhope.controller_protection_01.entities.Salary;
import com.develhope.controller_protection_01.servicies.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salary")
@PreAuthorize("hasRole('"+ Roles.ADMIN +"')")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping()
    public List<Salary> getSalaries(){
        return salaryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Salary> getSalary(@PathVariable Long id){
        return salaryService.findById(id);
    }

    @PostMapping("/create")
    public void  createSalary(@RequestBody Salary salary){
        salaryService.save(salary);
    }
}
