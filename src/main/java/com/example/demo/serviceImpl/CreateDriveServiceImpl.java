package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.CreateDriveRepository;
import com.example.demo.model.CreateDriveModel;
import com.example.demo.service.CreateDriveService;

@Service
public class CreateDriveServiceImpl implements CreateDriveService{
@Autowired
CreateDriveRepository createDriveRepository;
	
	@Override
	public CreateDriveModel postdrive(CreateDriveModel createDriveModel) {
		return createDriveRepository.save(createDriveModel);
	}

	@Override
	public List<CreateDriveModel> getdrive() {
		return createDriveRepository.findAll();
	}

	@Override
	public CreateDriveModel getDriveById(Integer driveId) {
		return createDriveRepository.findById(driveId).get();
	}


	@Override
	public CreateDriveModel updateDrive(CreateDriveModel drive) {
		
		return createDriveRepository.save(drive);
	}

}

