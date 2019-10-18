package com.example.demo.controller;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.CreateDriveModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.RecruiterRegistrationModel;
import com.example.demo.service.CreateDriveService;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin
@RestController
public class CreateDriveController {
	
	@Autowired
	CreateDriveService createDriveService;
	
	@PostMapping("/postdrive")
	public CreateDriveModel postdrive(@RequestParam("driveDetails") String driveDetails,
			@RequestParam("companyLogo") MultipartFile companyLogo) throws IOException {
		CreateDriveModel createDriveModel =new CreateDriveModel();
		createDriveModel = new ObjectMapper().readValue(driveDetails,CreateDriveModel.class);
		createDriveModel.setCompanyLogo(companyLogo.getBytes());
		return createDriveService.postdrive(createDriveModel);
	}
	
	@GetMapping("/getdrive")
	public List<CreateDriveModel> getdrive()
	{
		return createDriveService.getdrive();
	}
	
//	@PutMapping("/updateDrive")
//	public ResponseEntity<CreateDriveModel> updateDrive(@RequestBody CreateDriveModel drive) {
//		 drive= createDriveService.updateDrive(drive);
//		return ResponseEntity.ok().body(drive);
//	}
	@PutMapping("/updateDrive")
	public ResponseEntity<CreateDriveModel> updateDrive(@RequestParam("driveDetails") String driveDetails,
			@RequestParam("companyLogo") MultipartFile companyLogo) throws IOException {
		CreateDriveModel createDriveModel =new CreateDriveModel();
		createDriveModel = new ObjectMapper().readValue(driveDetails,CreateDriveModel.class);
		createDriveModel.setCompanyLogo(companyLogo.getBytes());
		 createDriveModel= createDriveService.updateDrive(createDriveModel);
		return ResponseEntity.ok().body(createDriveModel);
	}
		
	@GetMapping("/getdriveById")
	public CreateDriveModel getByIddrive(@RequestParam(name="driveId") Integer driveId)
	{
		return createDriveService.getDriveById(driveId);
	}
	

}
