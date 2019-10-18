package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DesignationModel;
import com.example.demo.service.DesignationService;

@RestController
public class DesignationController {

	@Autowired
	DesignationService designationService;


	@GetMapping("/getdesignationService")
	public List<DesignationModel> getdesignationService() {
		return designationService.getd();
	}



	@PostMapping("/postdesignationService")
	public DesignationModel savedesignationService(@RequestBody DesignationModel designation)
	{
		return designationService.saveUser(designation);
	}
}
