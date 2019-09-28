package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.FacilityLoginModel;
import com.example.demo.service.FacilityLoginService;

@RestController
@CrossOrigin
public class FacilityLoginController {

	@Autowired
	FacilityLoginService facilityLoginService;
	
	@PostMapping("/postFacility")
	public FacilityLoginModel saveFacility(@RequestBody FacilityLoginModel facilityLoginModel) {
		return facilityLoginService.saveFacility(facilityLoginModel);
	}
	
	@GetMapping("/getFacility")
	public List<FacilityLoginModel> getFacility() {
		
		return facilityLoginService.getFacility();
		}
	
	@PostMapping("/loginFacilityCheck")
	
	public ResponseEntity<Integer> getRecruiter(@RequestBody FacilityLoginModel facilityLoginModel) {
		int res= facilityLoginService.getFacility(facilityLoginModel.getEmail(),facilityLoginModel.getPassword());
		return ResponseEntity.ok().body(res);
	}
}
	
