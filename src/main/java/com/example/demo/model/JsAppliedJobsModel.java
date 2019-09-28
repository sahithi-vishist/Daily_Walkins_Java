package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;



@Entity(name="js_applied_jobs")
@Data
public class JsAppliedJobsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="jobseekerappliedjobid")
	private int jobSeekerAppliedJobId ; 
	
	@OneToOne
	@JoinColumn(name="jobno")
	private PostJobsModel jobNo ;
	
	@Column(name="jobseekeremailid")
	private String jobSeekerEmailId ;
	
	@Column(name="appliedon")
	private Date appliedOn ;
	
	@Column(name="emailedto")
	private String emailedTo ;
	
	@Column(name="recruitercompanyname")
	private String recruiterCompanyName;
	
	@Column(name="walkintimeslots")
	private String walkinTimeSlots ; 
	
	@Column(name="candidateavailabletimeslots")
	private String candidateAvailableTimeSlots ;
	
	@Column(name="approvedtimeslots")
	private String approvedTimeSlots ;
	
	@Column(name="walkindate")
	private Date walkinDate;

	
	
}
