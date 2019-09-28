package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity(name="employee_login_details")
@Data

public class EmployeeLoginDetailsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employeelogindetailsid")
	private Integer employeeLoginDetailsId;
	
	@Column(name="contactnumber")
	private String contactNumber;
	
	@Column(name="intime")
	private Date inTime;
	
	@Column(name="outtime")
	private Date outTime;

	

}
