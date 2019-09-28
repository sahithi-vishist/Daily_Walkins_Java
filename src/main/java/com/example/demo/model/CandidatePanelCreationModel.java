package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity(name="candidate_panel_creation")
@Data

public class CandidatePanelCreationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="panelid")
	private Integer panelId;
	
	@Column(name="panelname")
	private String panelName;
	
	@Column(name="keyskills")
	private String keySkills;

	@Column(name="assignedperson")
	private String assignedPerson;
	
	@Column(name="driveid")
	private Integer driveId;
	
	@Column(name="pin")
	private Integer pin;
	
	@Column(name="contactno")
	private String contactNo;
	
	@Column(name="panelcreationdate")
	private Date panelCreationDate;
	
	@Column(name="companyemail")
	private String companyEmail;
	

}
