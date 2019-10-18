package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="salary")
@Data
public class SalaryModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="salaryid")
	private Integer salaryId;
	
	@Column(name="salvalue")
	private String salValue;
	
	@Column(name="saltext")
	private String salText;
	
	@Column(name="salcount")
	private Integer salCount;


}
