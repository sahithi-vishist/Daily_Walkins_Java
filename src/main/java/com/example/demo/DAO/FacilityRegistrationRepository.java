package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FacilityRegistrationModel;

public interface FacilityRegistrationRepository extends JpaRepository<FacilityRegistrationModel, Integer>{

}
