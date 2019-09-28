package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CreateDriveModel;

public interface CreateDriveRepository extends JpaRepository<CreateDriveModel, Integer>{

}