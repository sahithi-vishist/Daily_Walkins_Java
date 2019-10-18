package com.example.demo.DAO;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CompanyNameModel;

public interface CompanyNameRepository extends JpaRepository<CompanyNameModel, Integer> {

	
}
