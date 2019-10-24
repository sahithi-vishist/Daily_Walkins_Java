package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LocationsFormsModel;
import com.example.demo.service.LocationsFormsService;

@RestController
@CrossOrigin
public class LocationsFormsontroller {
	
	@Autowired
	LocationsFormsService locationsFormsService;
	
	@PostMapping("/saveLocations")
	public LocationsFormsModel saveLoc(@RequestBody LocationsFormsModel locationsFormsModel) {
		return locationsFormsService.saveLocation(locationsFormsModel);
	
	}
	
	@GetMapping("/getAllLocations")
	public List<LocationsFormsModel> getLocation() {
		
		return locationsFormsService.getLocation();
}

	@GetMapping("/getcities")
	public List<LocationsFormsModel> getAllCitiesn() {
		
		return locationsFormsService.getLocation();
}
}
