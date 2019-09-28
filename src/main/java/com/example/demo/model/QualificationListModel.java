package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="qualifications_list")
@Data
public class QualificationListModel {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="qualificationid")
	private Integer qualificationId;
	
	@Column(name="fullforms")
	private String fullForms;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="qualificationcount")
	private Integer qualificationCount;



}
