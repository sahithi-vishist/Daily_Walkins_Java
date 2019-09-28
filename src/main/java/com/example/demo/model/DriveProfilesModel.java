package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity(name="drive_profiles")
@Data
public class DriveProfilesModel {

	@Id
	@Column(name="driveid")
	private int driveId ;
	
	@Column(name="jobseekeremail")
	private String jobSeekerEmail;
	
	@Column(name="recruiteremail")
	private String recruiterEmail ;
		
	@Column(name="skillset")
	private String skillSet ;
	
	@Column(name="status")
	private String status ;
	
	@Column(name="firstname")
	private String 	firstName;
	
	@Column(name="contactno")
	private String contactNo;
	
	@Column(name="email")
	private String email ;
	
	@Column(name="keyskills")
	private String keyskills ;
	
	@Column(name="location")
	private String 	location ;
	
	@Column(name="preferredlocation")
	private String preferredLocation;
	
	@Column(name="currentcompany")
	private String currentCompany ;
	
	@Column(name="standardcurrentcompany")
	private String standardCurrentCompany ;
	
	@Column(name="currentctc")
	private double currentCTC ;
	
	@Column(name="expectedctc")
	private double expectedCTC ;
	
	@Column(name="noticeperiod")
	private int noticePeriod ;
	
	@Column(name="feedback")
	private String feedback ;
	
	@Column(name="updatedate")
	private Date updateDate; 
	
	@Column(name="attended")
	private boolean attended ;

	
	
}
