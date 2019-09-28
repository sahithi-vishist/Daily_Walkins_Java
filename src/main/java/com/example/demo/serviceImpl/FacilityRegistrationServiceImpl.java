package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.FacilityRegistrationRepository;
import com.example.demo.model.FacilityRegistrationModel;
import com.example.demo.service.FacilityRegistrationService;


@Service
public class FacilityRegistrationServiceImpl implements FacilityRegistrationService{
	
	@Autowired
	FacilityRegistrationRepository facilityRegistrationRepository;


	@Override
	public FacilityRegistrationModel savefaciltyregistration(FacilityRegistrationModel facilityregistrationModel) {
		return facilityRegistrationRepository.save(facilityregistrationModel);
	}

	@Override
	public List<FacilityRegistrationModel> getfaciltyregistration() {
		return facilityRegistrationRepository.findAll();
	}

	@Override
	public FacilityRegistrationModel updatefaciltyregistration(FacilityRegistrationModel facilityregistrationModel) {
		 return facilityRegistrationRepository.save(facilityregistrationModel);
	}

	@Override
	public void deletefaciltyregistration(Integer id) {
		FacilityRegistrationModel facilityregistrationModel=facilityRegistrationRepository.findById(id).get();
		if(facilityregistrationModel!=null)
		{
			facilityRegistrationRepository.delete(facilityregistrationModel);
		}
		
	}

	@Override
	public FacilityRegistrationModel getById(Integer id) {
		return facilityRegistrationRepository.findById(id).get();
	}

}
