package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SalaryModel;

public interface SalaryRepository extends JpaRepository<SalaryModel, Integer> {

}
