package com.example.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.pojo.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

    // You can add custom query methods if needed
}
