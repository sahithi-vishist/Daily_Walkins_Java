package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity(name="institutefullforms")
@Data
public class InstituteFullFormsModel {
	
	@Id
	@Column(name="instid")
	private int InstId;
	
	@Column(name="institutename")
	private String Institutename;
	
	
	@Column(name="institutenamefullform")
	private String InstituteFullForm;


	
}
