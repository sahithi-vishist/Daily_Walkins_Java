package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FacilityLoginModel;

public interface FacilityLoginService {
	
FacilityLoginModel saveFacility(FacilityLoginModel facilityLoginModel);
	
	List<FacilityLoginModel> getFacility();
	  public FacilityLoginModel getFacility(String email,String password);
    

}
