package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.DriveDetailsRepository;
import com.example.demo.model.DriveDetailsModel;
import com.example.demo.service.DriveDetailsService;


@Service
public class DriveDetailsServiceImpl implements DriveDetailsService {
	
	
	@Autowired
	DriveDetailsRepository driveDetailsDAO;

	@Override
	public DriveDetailsModel savedrivedetails(DriveDetailsModel driveDetailsModel) {
		return driveDetailsDAO.save(driveDetailsModel);
	}

	@Override
	public List<DriveDetailsModel> getdrivedetails() {
		return driveDetailsDAO.findAll();
	}

	


}
