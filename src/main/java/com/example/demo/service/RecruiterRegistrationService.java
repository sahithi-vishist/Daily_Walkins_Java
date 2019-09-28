package com.example.demo.service;


import java.util.List;

import com.example.demo.model.RecruiterRegistrationModel;


public interface RecruiterRegistrationService {
	public RecruiterRegistrationModel saveAll(RecruiterRegistrationModel recruiterRegistrationModel);
	public List<RecruiterRegistrationModel> getAll();
	public RecruiterRegistrationModel updateRegistration(RecruiterRegistrationModel recruiterRegistrationModel);
    public int getRecruiter(String email,String password);
    public RecruiterRegistrationModel getById(Integer recruiterId);
}
