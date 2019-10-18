package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LocationsFormsModel;

public interface LocationsFormsRepository extends JpaRepository<LocationsFormsModel, Integer>{
	

}
