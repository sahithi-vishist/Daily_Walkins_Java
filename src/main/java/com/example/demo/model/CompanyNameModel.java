package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="company_name")
@Data
public class CompanyNameModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "companyid")
	private int companyId;
	
	@Column(name="usercompanynames")
	private String userCompanyNames;
	
	@Column(name="standardcompanynames")
	private String standardCompanyNames;
	
}
