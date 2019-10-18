package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RecruiterRegistrationModel;

public interface RecruiterRegistrationRepository extends JpaRepository<RecruiterRegistrationModel, Integer>{
public RecruiterRegistrationModel findByEmail(String email);
}
