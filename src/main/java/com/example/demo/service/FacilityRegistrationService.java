package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FacilityLoginModel;
import com.example.demo.model.FacilityRegistrationModel;

public interface FacilityRegistrationService {
	
	public FacilityRegistrationModel savefaciltyregistration(FacilityRegistrationModel facilityregistrationModel);
	public List<FacilityRegistrationModel> getfaciltyregistration();
	public FacilityRegistrationModel updatefaciltyregistration(FacilityRegistrationModel facilityregistrationModel);
	public void deletefaciltyregistration(Integer id);
	public FacilityRegistrationModel getById(Integer id);
    public List<FacilityRegistrationModel> getByDate(String date);
    public List<FacilityRegistrationModel> getByFacilityId(FacilityLoginModel loginObj);
}
