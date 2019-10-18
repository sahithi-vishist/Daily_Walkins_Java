package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeesModel;

public interface EmployeesRepository extends JpaRepository<EmployeesModel, Integer>{

}
