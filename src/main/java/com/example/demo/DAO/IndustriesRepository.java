package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.IndustriesModel;

public interface IndustriesRepository extends JpaRepository<IndustriesModel, Integer> {

}
