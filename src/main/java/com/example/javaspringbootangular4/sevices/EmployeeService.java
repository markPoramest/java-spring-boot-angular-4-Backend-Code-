package com.example.javaspringbootangular4.sevices;

import com.example.javaspringbootangular4.models.Employee;
import com.example.javaspringbootangular4.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> findAll(){
        return repository.findAll();
    }

    public Employee save(Employee employee){
        return repository.save(employee);
    }

    public Optional<Employee> findById(Long id){
        return  repository.findById(id);
    }

    public boolean deleteById(Long id){
        if(findById(id).isPresent()){
            repository.deleteById(id);
            return  true;
        }
        return false;
    }
}
