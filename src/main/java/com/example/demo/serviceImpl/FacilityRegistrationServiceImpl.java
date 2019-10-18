package com.example.demo.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.FacilityRegistrationRepository;
import com.example.demo.model.FacilityLoginModel;
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

	public float savefun() throws ParseException {
		 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		 String availabilityDates = null;
	     Date dateBefore = myFormat.parse(availabilityDates);
		 Date dateAfter = myFormat.parse(availabilityDates);
         long difference = dateAfter.getTime() - dateBefore.getTime();
		 float daysBetween = (difference / (1000*60*60*24));
	     return daysBetween;
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

	@Override
	public List<FacilityRegistrationModel> getByDate(String date) {
		
		return facilityRegistrationRepository.findByAvailabilityDates(date);
	}

	@Override
	public List<FacilityRegistrationModel> getByFacilityId(FacilityLoginModel loginObj) {
		
		return facilityRegistrationRepository.findByFacilityId(loginObj);
	}	
}
