package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SalaryModel;
import com.example.demo.service.SalaryService;

@RestController
@CrossOrigin
public class SalaryController {
	
	@Autowired
	SalaryService salaryService;

	@PostMapping("/Salary")
	public SalaryModel saveF(@RequestBody SalaryModel salaryModel) {
		return salaryService.saveSs(salaryModel);
	
	}
	
	@GetMapping("/getSalaryDetails")
	public List<SalaryModel> getF() {
		
		return salaryService.getSs();
	
		
	}
}
