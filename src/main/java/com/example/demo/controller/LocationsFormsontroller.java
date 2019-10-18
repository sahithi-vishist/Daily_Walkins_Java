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
	
	@PostMapping("/locations")
	public LocationsFormsModel saveI(@RequestBody LocationsFormsModel locationsFormsModel) {
		return locationsFormsService.saveLl(locationsFormsModel);
	
	}
	
	@GetMapping("/locations1")
	public List<LocationsFormsModel> getI() {
		
		return locationsFormsService.getLl();
}

}
