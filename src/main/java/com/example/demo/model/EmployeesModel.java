package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="employees")
@Data
public class EmployeesModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employeesid")
	private Integer employeesId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="number")
	private String number;
	
	@Column(name="instatus")
	private boolean inStatus;

	

}
