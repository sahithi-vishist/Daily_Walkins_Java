package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.DesignationRepository;
import com.example.demo.model.DesignationModel;
import com.example.demo.service.DesignationService;


@Service
public class DesignationServiceImpl implements DesignationService {
	
	@Autowired
	DesignationRepository designationDAO;

	@Override
	public DesignationModel saveUser(DesignationModel designation) {
		
		return designationDAO.save(designation);
	}

	
		
	
	@Override
	public List<DesignationModel> getd() {
		return designationDAO.findAll();
	
	}
}
	
