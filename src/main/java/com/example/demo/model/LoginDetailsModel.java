package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "login_details")
@Data
public class LoginDetailsModel {
	
	@Id
	@Column(name = "logindetailsid")
	private int loginDetailsId; 
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private int role;
	
}
