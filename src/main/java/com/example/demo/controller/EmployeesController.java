package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeesModel;
import com.example.demo.service.EmployeesService;

@RestController
@CrossOrigin
public class EmployeesController {
	
	@Autowired
	EmployeesService employeesService;
	
	@PostMapping("/saveEmployee")
	public EmployeesModel saveEmployee(@RequestBody EmployeesModel employeesModel) {
		return employeesService.saveE(employeesModel);
	
	}
	
	@GetMapping("/getEmployee")
	public List<EmployeesModel> getEmployee() {
		
		return employeesService.getE();
	
		
	}

}
