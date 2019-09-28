package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="job_type")
@Data
public class JobTypeModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jobtypeid")
	private Integer jobTypeId;
	@Column(name="jobtype")
	private String jobType;
	@Column(name="jobtypecount")
	private String jobTypeCount;
	
}
