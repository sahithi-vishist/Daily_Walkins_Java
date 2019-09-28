package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.EmployeeLoginDetailsRepository;
import com.example.demo.model.EmployeeLoginDetailsModel;
import com.example.demo.service.EmployeeLoginDetailsService;

@Service
public class EmployeeLoginDetailsServiceImpl implements EmployeeLoginDetailsService{
	
	@Autowired
	EmployeeLoginDetailsRepository employeeLoginDetailsRepository;

	@Override
	public EmployeeLoginDetailsModel saveUser(EmployeeLoginDetailsModel employeeLoginDetailsModel) {
		return employeeLoginDetailsRepository.save(employeeLoginDetailsModel);
	}


	@Override
	public List<EmployeeLoginDetailsModel> getData() {
		return employeeLoginDetailsRepository.findAll();
	}

	
	
	}
	


