package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeeLoginDetailsModel;

public interface EmployeeLoginDetailsRepository extends JpaRepository<EmployeeLoginDetailsModel, Integer> {

}
