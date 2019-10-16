package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.InstituteFullFormsModel;
import com.example.demo.service.InstituteFullFormsService;


@RestController
@CrossOrigin
public class InstituteFullFormsController {
	

	@Autowired
	InstituteFullFormsService instituteFullFormsService;
	
	@GetMapping("/getinstitutes")
	public List<InstituteFullFormsModel> getInstituteFullFormsModels(){
		return instituteFullFormsService.getinstitute();		
	}
	
	@PostMapping("/postinstitute")
	public InstituteFullFormsModel saveinstituteFullFormsModel(@RequestBody InstituteFullFormsModel instituteFullFormsModel) {
		return instituteFullFormsService.saveinstitute(instituteFullFormsModel);
		
		
	}
}
