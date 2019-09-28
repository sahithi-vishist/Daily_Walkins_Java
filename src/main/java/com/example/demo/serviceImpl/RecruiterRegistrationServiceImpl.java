package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.RecruiterRegistrationRepository;
import com.example.demo.model.RecruiterRegistrationModel;
import com.example.demo.service.RecruiterRegistrationService;

@Service
public class RecruiterRegistrationServiceImpl implements RecruiterRegistrationService {
	@Autowired
	RecruiterRegistrationRepository recruiterRegistrationRepository;
	
	@Override
	public RecruiterRegistrationModel saveAll(RecruiterRegistrationModel recruiterRegistrationModel) {
		return recruiterRegistrationRepository.save(recruiterRegistrationModel);
	}

	@Override
	public List<RecruiterRegistrationModel> getAll() {
		return recruiterRegistrationRepository.findAll();
	}

	@Override
	public RecruiterRegistrationModel updateRegistration(RecruiterRegistrationModel recruiterRegistrationModel) {
		return recruiterRegistrationRepository.save(recruiterRegistrationModel);
	}

	@Override
	public int getRecruiter(String email, String password) {
		 RecruiterRegistrationModel res=recruiterRegistrationRepository.findByEmail(email);
		if(res.getPassword().equals(password)) {
			return res.getRecruiterId();
		}
		return 0;
	}

	@Override
	public RecruiterRegistrationModel getById(Integer recruiterId) {
		
		return recruiterRegistrationRepository.findById(recruiterId).get();
	}

	
}
