package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LocalitiesModel;

public interface LocalitiesRepository extends JpaRepository<LocalitiesModel, Integer> {

	
}
