package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="interview_panel_details")
public class InterviewPanelDetailsModel {
	@Id
	@Column(name="interviewpanelid")
	private int interviewPanelId;
	
	@Column(name="panelname")
	private String 	panelName ;
	
	@Column(name="panelemail")
	private String panelEmail;
	
	@Column(name="panelcontactno")
	private String panelContactNo ;
	
	@Column(name="skillset")
	private String skillSet ;
	
	@Column(name="companyemail")
	private String 	companyEmail ; 
	
	@Column(name="createddate")
	private Date createdDate ;


}
