package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.DriveProfilesRepository;
import com.example.demo.model.DriveProfilesModel;
import com.example.demo.service.DriveProfilesService;

@RestController
public class DriveProfilesServiceImpl implements DriveProfilesService {
	@Autowired
	DriveProfilesRepository driveProfilesRepository;

	@Override
	public List<DriveProfilesModel> getDriveProfiles() {
		return driveProfilesRepository.findAll();
	}

	@Override
	public DriveProfilesModel postDriveProfiles(DriveProfilesModel driveProfilesModel) {
		return driveProfilesRepository.save(driveProfilesModel);
	}

	@Override
	public DriveProfilesModel getByIdDriveProfiles(Integer id) {
		return driveProfilesRepository.getOne(id);
	}
	
	

}
