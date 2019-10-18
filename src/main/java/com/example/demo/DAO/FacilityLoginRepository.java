package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FacilityLoginModel;

public interface FacilityLoginRepository extends JpaRepository<FacilityLoginModel, Integer>{

	 FacilityLoginModel findByEmail(String email);
	
}
