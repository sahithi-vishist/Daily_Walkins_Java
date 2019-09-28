package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="facility_login")
@Data
public class FacilityLoginModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="facilityloginid")
	private Integer facilityLoginId;
	
	@Column(name="facilityname")
	private String facilityName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
}
