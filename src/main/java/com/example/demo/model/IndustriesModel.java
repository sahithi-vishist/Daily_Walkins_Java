package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity(name="industries")
public class IndustriesModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="industryid")
	private Integer industryId;
	
	@Column(name="industrytype")
	private String industryType;
	
	@Column(name="subindustrytype")
	private String subIndustryType;
	
	@Column(name="industrycount")
	private int industryCount;
	
	

}
