package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;
@CrossOrigin
@Data
@Entity(name="recruiter_privacy_settings")
public class RecruiterPrivacySettingsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="recruiterprivacyid")
	private int recruiterPrivacyId;
	
	@Column(name="EMAILI")
	private String email;
	
	@Column(name="WEEKDAY")
	private String weekDay;
	
	@Column(name="ONDEMANDTIME")
	private String onDemandTime ;
	
	@Column(name="EMAILALERT")
	private boolean emailAlert ;
	
	@Column(name="SMSALERT")
	private boolean smsAlert ;
	
	@Column(name="chatalert")
	private boolean ChatAlert ;

	
}
