package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.EmployeesRepository;
import com.example.demo.model.EmployeesModel;
import com.example.demo.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService{
	
	@Autowired
	EmployeesRepository employeesRepository;

	@Override
	public EmployeesModel saveE(EmployeesModel employeesModel) {
		return employeesRepository.save(employeesModel);
	}

	@Override
	public List<EmployeesModel> getE() {
		return employeesRepository.findAll();
	}

	
}
