package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeesModel;

public interface EmployeesService {
	
	EmployeesModel saveE(EmployeesModel employeesModel);
	
	List<EmployeesModel> getE();

}
