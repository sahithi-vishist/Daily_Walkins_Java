package com.example.demo.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity(name="create_drive")


public class CreateDriveModel {
	
	@Id
	@Column(name="createdriveid")
	private int createDriveId ;
	
	@Column(name="panels")
	private int panels ;
	
	@OneToOne
	@JoinColumn(name="coordinators")
	private CoordinatorDetailsModel coordinators ;
	
	@Column(name="companyemail")
	private String companyEmail ;
	
	@Column(name="recruiteremail")
	private String recruiterEmail ;
	
	@Column(name="pin")
	private int pin ;
	
	@Column(name="drivename")
	private String driveName;
	
	@OneToOne
	@JoinColumn(name="experiencemin")
	private ExperienceModel experienceMin;
	
	@OneToOne
	@JoinColumn(name="experiencemax")
	private ExperienceModel experienceMax;
	
	@Column(name="walkindate")
	private Date walkinDate;
	
	@Column(name="locality")
	private String locality ;
	
	@OneToOne
	@JoinColumn(name="industry")
	private IndustriesModel industry;
	
	
//	@Column(name="industry")
//	private int industry;
	
	@OneToOne
	@JoinColumn(name="role")
	private RoleModel role;
	
	@Column(name="jobdescription")
	private String jobDescription ;
	
	@Column(name="keyskills")
	private String keySkills ;

	@Column(name="designation")
	private String designation;
	
	@OneToOne
	@JoinColumn(name="noticeperiod")
	private NoticePeriodListModel noticePeriod ;
	
	
	@Column(name="timeslot")
	private String timeslot;
	
	@OneToOne
	@JoinColumn(name="jobtype")
	private JobTypeModel jobType;
	
	@OneToOne
	@JoinColumn(name="qualification")
	private QualificationListModel qualification;
	
	@OneToOne
	@JoinColumn(name="salarymin")
	private SalaryModel salaryMin;
	
	@OneToOne
	@JoinColumn(name="salarymax ")
	private SalaryModel salaryMax;
	
	@Column(name="rolesresponsibilities")
	private String rolesResposibilities;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="endclient")
	private String endClient;
	
	@Column(name="clientlocation")
	private String clientLocation;
	
	@Column(name="companyprofile")
	private String companyProfile;
	
	@Column(name="contactemail")
	private String contactEmail;
	
	@Column(name="contactperson")
	private String contactPerson;
	
	@Column(name="contactno")
	private String contactNo;
	
	@Column(name="contactnolandline")
	private String contactNoLandline;
	
	@Column(name="companyaddress")
	private String companyAddress;
	
	@Lob
	@Column(name="companylogo")
	private byte[] companyLogo;
	
	@Column(name="walkinlocation")
	private String walkinLocation;
	
	@Column(name="clientlocality")
	private String clientLocality;
	
	
}

