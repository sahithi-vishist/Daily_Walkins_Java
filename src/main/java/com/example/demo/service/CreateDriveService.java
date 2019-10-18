package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CreateDriveModel;


public interface CreateDriveService {
	
	public CreateDriveModel postdrive(CreateDriveModel createDriveModel);
	
	public List<CreateDriveModel> getdrive();
	
	public CreateDriveModel updateDrive(CreateDriveModel drive);
	
	public CreateDriveModel getDriveById(Integer driveId);

}

