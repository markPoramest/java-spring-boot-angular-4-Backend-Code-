package com.example.javaspringbootangular4.repositories;

import com.example.javaspringbootangular4.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
     public Employee findByUsername(String username);
}
