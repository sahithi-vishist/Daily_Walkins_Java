package com.example.demo.DAO;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FacilityLoginModel;
import com.example.demo.model.FacilityRegistrationModel;



public interface FacilityRegistrationRepository extends JpaRepository<FacilityRegistrationModel, Integer>{

	public List<FacilityRegistrationModel> findByAvailabilityDates(String date);
	public List<FacilityRegistrationModel> findByFacilityId(FacilityLoginModel loginObj);
	
}
