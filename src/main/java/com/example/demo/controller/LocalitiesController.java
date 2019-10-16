package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CitiesModel;
import com.example.demo.model.LocalitiesModel;
import com.example.demo.service.LocalitiesService;

@RestController
@CrossOrigin
public class LocalitiesController {

	@Autowired
	LocalitiesService localitiesService;
	
	@PostMapping("/localities")
	public LocalitiesModel saveH(@RequestBody LocalitiesModel localitiesModel) {
		return localitiesService.saveL(localitiesModel);
	
	}
	
	@GetMapping("/localities1")
	public List<LocalitiesModel> getH() {
		
		return localitiesService.getL();
}
	@PostMapping("/getLocalities")
	public List<LocalitiesModel> getByCityName(@RequestBody CitiesModel citiesModel){
		return localitiesService.getLocalityByCity(citiesModel.getCityName());
	}
}