package com.example.demo.service;

import java.util.List;

import com.example.demo.model.DriveDetailsModel;

public interface DriveDetailsService {
	
	public DriveDetailsModel savedrivedetails(DriveDetailsModel driveDetailsModel);
	public List<DriveDetailsModel> getdrivedetails();
}

