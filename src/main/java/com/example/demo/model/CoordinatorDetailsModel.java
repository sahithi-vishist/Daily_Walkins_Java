package com.example.demo.model;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity(name="coordinator_details")
@Data
public class CoordinatorDetailsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="coordinatorid")
	private int coordinatorId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	@Column(name="contactno")
	private String contactNo;
	
	@Column(name="companyemail")
	private String companyEmail;
	
	@Column(name="createddate")
	private Date createdDate;


}
