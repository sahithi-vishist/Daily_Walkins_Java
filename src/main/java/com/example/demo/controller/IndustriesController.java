package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.IndustriesModel;

import com.example.demo.service.IndustriesService;

@RestController
@CrossOrigin
public class IndustriesController {

	@Autowired
	IndustriesService industriesService;
	
	@PostMapping("/postIndustries")
	public IndustriesModel saveIndus(@RequestBody IndustriesModel insIndustriesModel) {
		return industriesService.saveIndustries(insIndustriesModel);
	}
	
	@GetMapping("/getIndustries")
	public List<IndustriesModel> getIndus(){
		return industriesService.getIndustries();
	}
	@GetMapping("/getindustry")
	public ResponseEntity<IndustriesModel> getIndustryById(@RequestParam(name="inId") Integer inId){
		IndustriesModel industry=industriesService.getById(inId);
		return ResponseEntity.ok().body(industry);
	}
}