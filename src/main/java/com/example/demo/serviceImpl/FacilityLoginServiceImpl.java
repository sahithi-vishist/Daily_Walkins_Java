package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.FacilityLoginRepository;
import com.example.demo.model.FacilityLoginModel;
import com.example.demo.service.FacilityLoginService;

@Service
public class FacilityLoginServiceImpl implements FacilityLoginService {
	
	@Autowired
	FacilityLoginRepository facilityLoginRepository;

	@Override
	public FacilityLoginModel saveFacility(FacilityLoginModel facilityLoginModel) {
		return facilityLoginRepository.save(facilityLoginModel);
	}

	@Override
	public List<FacilityLoginModel> getFacility() {
		return facilityLoginRepository.findAll();
	}

	@Override
	public FacilityLoginModel getFacility(String email, String password) {
		FacilityLoginModel res=facilityLoginRepository.findByEmail(email);
			if(res.getPassword().equals(password)) {
				return res;
			}
			return res;
		
	}

	

}
