package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity(name="institute_fullforms")
@Data
public class InstituteFullFormsModel {
	
	@Id
	@Column(name="instituteid")
	private int instituteId;
	
	@Column(name="institutename")
	private String instituteName;
	
	
	@Column(name="institutenamefullform")
	private String instituteNameFullForm;


	
}
