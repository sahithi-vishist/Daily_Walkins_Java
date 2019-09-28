package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CitiesModel;

public interface CitiesRepository extends JpaRepository<CitiesModel, Integer> { 

	
}
