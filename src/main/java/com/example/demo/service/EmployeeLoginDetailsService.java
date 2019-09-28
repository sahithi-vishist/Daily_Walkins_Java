package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeLoginDetailsModel;

public interface EmployeeLoginDetailsService {
	
	 EmployeeLoginDetailsModel saveUser(EmployeeLoginDetailsModel employeeLoginDetailsModel);
	
	 List<EmployeeLoginDetailsModel> getData();

}
