package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="js_privacy_settings")
@Data
public class JSPrivacySettingsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "JOBSEEKERID")
	private int jobSeekerId;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "WEEKDAY")
	private String weekday;
	
	@Column(name = "ONDEMANDTIME")
	private String ondemandtime;
	
	@Column(name = "EMAILALERT")
	private boolean emailalert;
	
	@Column(name = "SMSALERT")
	private boolean smsalert;
	
	@Column(name = "CHATALERT")
	private boolean chatalert;


	
	}
	
	
	
	
	


