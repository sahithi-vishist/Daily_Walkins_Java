package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FacilityRegistrationModel;
import com.example.demo.service.FacilityRegistrationService;


@RestController
public class FacilityRegistrationController {
	
	@Autowired
	FacilityRegistrationService facilityregistrationservice;
	
	@GetMapping("/getfaciltyregistration")
	public ResponseEntity<List<FacilityRegistrationModel>> getfaciltyregistration() {
		List <FacilityRegistrationModel> list=facilityregistrationservice.getfaciltyregistration();
		return ResponseEntity.ok().body(list);
	}
	

	@PostMapping("/postfaciltyregistration")
	public ResponseEntity<FacilityRegistrationModel> savefaciltyregistration(@RequestBody FacilityRegistrationModel facilityregistrationModel) {
		facilityregistrationModel=facilityregistrationservice.savefaciltyregistration(facilityregistrationModel);
		return ResponseEntity.ok().body(facilityregistrationModel);
	}

	@PutMapping("/updatefaciltyregistration")
	public ResponseEntity<FacilityRegistrationModel> updatefaciltyregistration(@RequestBody FacilityRegistrationModel facilityregistrationModel) {
		facilityregistrationModel= facilityregistrationservice.updatefaciltyregistration(facilityregistrationModel);
		return ResponseEntity.ok().body(facilityregistrationModel);
		
	}
	@GetMapping("/getfregistration")
	public ResponseEntity<FacilityRegistrationModel> getfregistration(@RequestParam(name="Id") Integer Id) {
		FacilityRegistrationModel facilityregistrationModel = facilityregistrationservice.getById(Id);
		return ResponseEntity.ok().body(facilityregistrationModel);
		
		
	}
	@DeleteMapping("/deletefaciltyregistration")
	public ResponseEntity<String> deletefaciltyregistration(@RequestParam(name="Id") Integer Id) {
		facilityregistrationservice.deletefaciltyregistration(Id);
		return ResponseEntity.ok().body("facilityregistrationModel deleted");
	}


}
