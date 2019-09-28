package com.example.demo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity(name="recruiter_registration")
public class RecruiterRegistrationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="recruiterregistrationid")
	private int recruiterId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="confirmpassword")
	private String  confirmPassword;
	
	@Column(name="companyname")
	private String  companyName;
	
	@Column(name="standardcurrentcompany")
	private String  standardCurrentCompany; 
	
	@Column(name="email")
	private String  email;
	
	@Column(name="companyurl")
	private String  companyURL;
	
	@Column(name="contactno")
	private String contactNo;
	
	@Column(name="contactnolandline")
	private String  contactnoLandline;
	
	@OneToOne
	@JoinColumn(name="industry")
	private IndustriesModel industry;
	
	@Column(name="location")
    private String  location;
	
	@Column(name="address")
    private String  address;
	
	@Column(name="companyprofile")
    private String  companyProfile;
	
	@Column(name="activation")
	private boolean activation;
	
	@Column(name="regdate")
    private Date regDate; 
	
	@Column(name="emailverified")
    private boolean emailVerified;
	
	@Column(name="isonline")
    private boolean isOnline;
	
	@Column(name="designation")
	private String designation;
	

	@Column(name="companylogo")
	private String  companyLogo;
	
	@Column(name="visibility")
	private boolean  visibility;
	
	@Column(name="updatedate")
	private Date updateDate; 
	
	@Column(name="deviceid")
	private String  deviceId;
	
	@Column(name="logostring")
	private String  logoString;
	
	@Column(name="ismobileonline")
	private boolean  isMobileOnline;
	
	@Column(name="lastlogin")
	private Date  lastLogin;
	
	@Column(name="lastactive")
	private Date  lastActive;
	
	@Column(name="status")
	private String status;



	
	public RecruiterRegistrationModel() {
		super();
	}

	
	
}

