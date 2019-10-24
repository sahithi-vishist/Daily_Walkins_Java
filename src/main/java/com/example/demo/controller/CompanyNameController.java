package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CompanyNameModel;
import com.example.demo.service.CompanyNameService;

@RestController
@CrossOrigin
@RequestMapping
public class CompanyNameController {

	@Autowired(required=true)
	CompanyNameService  companyNameService;
	
	
	@PostMapping("/companyname")
	public CompanyNameModel Test(@RequestBody CompanyNameModel companyNameModel)
	{
		System.out.println(companyNameModel.toString());
		return companyNameService.insertRec(companyNameModel);
	}
	
	@GetMapping("/getcompanies")
	public List<CompanyNameModel> getCompanies(){
		return this.companyNameService.getAllCompanies();
	}
	
	
}