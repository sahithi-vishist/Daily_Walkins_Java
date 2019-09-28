package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DesignationModel;

public interface DesignationRepository extends JpaRepository<DesignationModel,Integer> {

}
