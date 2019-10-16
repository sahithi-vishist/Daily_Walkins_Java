package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LocalitiesModel;

public interface LocalitiesRepository extends JpaRepository<LocalitiesModel, Integer> {
	
public List<LocalitiesModel> findByCity(String city);
	
}
