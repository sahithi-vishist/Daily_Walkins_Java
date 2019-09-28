package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.SalaryRepository;
import com.example.demo.model.SalaryModel;
import com.example.demo.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public SalaryModel saveSs(SalaryModel salaryModel) {
		return salaryRepository.save(salaryModel);
	}

	@Override
	public List<SalaryModel> getSs() {
		return salaryRepository.findAll();
	}
	

}
