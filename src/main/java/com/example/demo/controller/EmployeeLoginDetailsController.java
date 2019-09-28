package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeLoginDetailsModel;
import com.example.demo.service.EmployeeLoginDetailsService;

@RestController
public class EmployeeLoginDetailsController {
	
	@Autowired
	EmployeeLoginDetailsService employeeLoginDetailsService;
	
	@PostMapping("/saveemployeeLoginDetails")
	public EmployeeLoginDetailsModel saveemployeeLoginDetails(@RequestBody EmployeeLoginDetailsModel employeeLoginDetailsModel) {
		return employeeLoginDetailsService.saveUser(employeeLoginDetailsModel);
	
	}
	
	@GetMapping("/getemployeeLoginDetails")
	public List<EmployeeLoginDetailsModel> getemployeeLoginDetails() {
		
		return employeeLoginDetailsService.getData();
	
		
	}

}
