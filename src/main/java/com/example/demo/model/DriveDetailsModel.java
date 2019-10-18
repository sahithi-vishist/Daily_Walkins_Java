package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="drive_details")
@Data

public class DriveDetailsModel {
	
	@Id
	@Column(name="WALKINID")
	private Integer walkinId;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="COMPANYEMAIL")
	private String companyEmail;
	
	@Column(name="DRIVECOORDINATORS")
	private String driveCoordinators;
	
	@Column(name="DRIVEDATE")
	private Integer driveDate;
	
	@Column(name="DRIVELOCATION")
	private String driveLocation;
	
	@Column(name="DRIVENAME")
	private String driveName;
	
	@Column(name="DRIVEPROFILESCOUNT")
	private Integer driveProfilesCount;
	
	@Column(name="DRIVESMSID")
	private String driveSmsId;
	
	@Column(name="PANELS")
	private String panels;
	
	@Column(name="RECEMAIL")
	private String receiveEmail;
	
	@Column(name="RECRUITEREMAILS")
	private String recruiterEmails;
	
	@Column(name="LSTCOORDINATORS")
	private String lastCordinators;
	
	@Column(name="SKILLSET")
	private String skillSet;

	
}