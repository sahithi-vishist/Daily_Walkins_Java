package com.example.demo.controller;
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
import com.example.demo.model.CreateDriveModel;
import com.example.demo.service.CreateDriveService;
@CrossOrigin
@RestController
public class CreateDriveController {
	
	@Autowired
	CreateDriveService createDriveService;
	
	@PostMapping("/postdrive")
	public CreateDriveModel postdrive(@RequestBody CreateDriveModel createDriveModel)
	{
		System.out.println(createDriveModel);
		return createDriveService.postdrive(createDriveModel);
	}
	
	@GetMapping("/getdrive")
	public List<CreateDriveModel> getdrive()
	{
		return createDriveService.getdrive();
	}
	
	@PutMapping("/updateDrive")
	public ResponseEntity<CreateDriveModel> updateDrive(@RequestBody CreateDriveModel drive) {
		 drive= createDriveService.updateDrive(drive);
		return ResponseEntity.ok().body(drive);
	}
		
	@GetMapping("/getdriveById")
	public CreateDriveModel getByIddrive(@RequestParam(name="driveId") Integer driveId)
	{
		return createDriveService.getDriveById(driveId);
	}
	

}
