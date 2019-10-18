package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="background_check")
@Data
public class BGCModel {
	
	@Id
	@Column(name="bgcid")
	private int bgcId ;
	
	@Column(name="companyemailid")
	private String companyEmailId;
	
	@Column(name="empid")
	private int empId ;
	
	@Column(name="fullname")
	private String fullName ;
	
	@Column(name="jobseekeremail")
	private String jobSeekerEmail ;
	
	@Column(name="lastlogin")
	private String lastLogin ;
	
	@Column(name="lastupdate")
	private String lastUpdate ;
	
	@Column(name="mobile")
	private int mobile ;
	
	@Column(name="otp")
	private String otp ; 
	
	@Column(name="recruiteremail")
	private String recruiterEmail ;
	
	@Column(name="status")
	private String status ;
	
	@Column(name="team")
	private String team ;
	
	@Column(name="updateon")
	private String updateOn ;
	
	@Column(name="verified")
	private String verified ;

	

}
