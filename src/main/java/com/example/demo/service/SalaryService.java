package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SalaryModel;

public interface SalaryService {
	
SalaryModel saveSs(SalaryModel salaryModel);
	
	List<SalaryModel> getSs();

}
