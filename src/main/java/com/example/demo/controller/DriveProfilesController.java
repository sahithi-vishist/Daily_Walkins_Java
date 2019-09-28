package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DriveProfilesModel;
import com.example.demo.service.DriveProfilesService;

@RestController
public class DriveProfilesController {
	
	@Autowired
	DriveProfilesService driveProfilesService;
	
	@GetMapping("/getdriveprofiles")
	public List<DriveProfilesModel> getdriveprofiles(){
		return driveProfilesService.getDriveProfiles();
	}

	@PostMapping("/postdriveprofiles")
	public DriveProfilesModel postdriveprofiles(@RequestBody DriveProfilesModel driveProfilesModel )
	{
		return driveProfilesService.postDriveProfiles(driveProfilesModel);
	}
	
	@GetMapping("getByiddrive")
	public DriveProfilesModel getByIdDriveProfiles(Integer id) {
		return driveProfilesService.getByIdDriveProfiles(id);
	}
	
}
