package com.example.javaspringbootangular4.controllers;

import com.example.javaspringbootangular4.models.Employee;
import com.example.javaspringbootangular4.sevices.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/findAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Employee> findAll(){
        return service.findAll();
    }

    @PostMapping("/insert")
    @CrossOrigin(origins = "http://localhost:4200/addEmployee" , maxAge = 3600)
    public Employee save(@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping("/findById/{id}")
    public Employee findbyId(@PathVariable("id") Long id){
        return service.findById(id).isPresent()?service.findById(id).get():null;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Long id){
        return service.deleteById(id);
    }


}
