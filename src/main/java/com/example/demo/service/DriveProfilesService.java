package com.example.demo.service;

import java.util.List;

import com.example.demo.model.DriveProfilesModel;

public interface DriveProfilesService {

public List< DriveProfilesModel > getDriveProfiles();
public DriveProfilesModel postDriveProfiles(DriveProfilesModel driveProfilesModel);
public DriveProfilesModel getByIdDriveProfiles(Integer id);

}
