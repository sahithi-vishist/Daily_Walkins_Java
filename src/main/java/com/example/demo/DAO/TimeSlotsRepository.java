package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TimeSlotsModel;

public interface TimeSlotsRepository extends JpaRepository<TimeSlotsModel, Integer> {
	


}
