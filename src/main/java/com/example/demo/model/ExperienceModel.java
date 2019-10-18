package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity(name="experience")
public class ExperienceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="experienceid")
	private Integer experienceId;
	
	@Column(name="expvalue")
	private String expValue;
	
	@Column(name="exptext")
	private String expText;
	
	@Column(name="expcount")
	private Integer ecount;

	
	
	
}
