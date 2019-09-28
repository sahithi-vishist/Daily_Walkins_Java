package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DriveProfilesModel;

public interface DriveProfilesRepository extends JpaRepository<DriveProfilesModel, Integer> {

}
