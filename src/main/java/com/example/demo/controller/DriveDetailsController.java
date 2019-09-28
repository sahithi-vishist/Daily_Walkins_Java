package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.DriveDetailsModel;
import com.example.demo.service.DriveDetailsService;

@RestController
public class DriveDetailsController {
	
	@Autowired
	DriveDetailsService driveDetailsService;
	
	@GetMapping("/getdriverdetails")
	public List<DriveDetailsModel> getdrive() {
		return driveDetailsService.getdrivedetails();	
	}
	
	@PostMapping("/postdriverdetails")
	public DriveDetailsModel savedrive(@RequestBody DriveDetailsModel driveDetailsModel) {
		return driveDetailsService.savedrivedetails(driveDetailsModel);
	}

}
