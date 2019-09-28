package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="sent_sms_details")
@Data
public class SentSmsDetailsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sentsmsdetailsid")
	private Integer sentSmsDetailsId;
	
	@Column(name="sendemail")
	private String sendEmail;
	
	@Column(name="mobilenumbers")
	private String mobileNumbers;
	
	@Column(name="message")
	private String message;
	
	@Column(name="usertype")
	private String userType;
	
	@Column(name="savedone")
    private Date saveDone;

	
	
}
