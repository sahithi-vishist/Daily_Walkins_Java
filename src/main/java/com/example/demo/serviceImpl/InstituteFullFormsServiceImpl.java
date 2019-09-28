package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.InstituteFullFormsRepository;
import com.example.demo.model.InstituteFullFormsModel;
import com.example.demo.service.InstituteFullFormsService;

@Service
public class InstituteFullFormsServiceImpl implements InstituteFullFormsService {

	@Autowired
	InstituteFullFormsRepository instituteFullFormsDAO;
	
	@Override
	public InstituteFullFormsModel saveinstitute(InstituteFullFormsModel instituteFullFormsModel) {
		return instituteFullFormsDAO.save(instituteFullFormsModel);
	}
	

	@Override
	public List<InstituteFullFormsModel> getinstitute() {
		return instituteFullFormsDAO.findAll();
	}

	

}
