package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CitiesModel;
import com.example.demo.service.CitiesService;

@RestController
@CrossOrigin
@RequestMapping
public class CitiesController {
	@Autowired
	CitiesService  citiesService;

@PostMapping("/cities")
public CitiesModel Test(@RequestBody CitiesModel citiesModel)
{
	System.out.println(citiesModel.toString());
	return citiesService.insertRec(citiesModel);
}
@GetMapping("/getcities")
public List<CitiesModel> getAllCities(){
	return citiesService.getAllCities();
	
}

}
