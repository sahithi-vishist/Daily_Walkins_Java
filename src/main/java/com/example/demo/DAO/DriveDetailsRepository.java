package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DriveDetailsModel;

public interface DriveDetailsRepository extends JpaRepository<DriveDetailsModel,Integer> {

}
