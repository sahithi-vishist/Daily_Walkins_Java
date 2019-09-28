package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="booked_facilities")
@Data
public class BookedFacilitiesModel {
	
	@Id
	@Column(name="ID")
	private int Id; 
	
	@Column(name = "COMPANYEMAIL")
	private String companyEmail;
	
	@Column(name = "COMPANYNAME")
	private String companyName;
	
	@Column(name = "CONTACTNUMBER")
	private String contactNumber;
	
	@Column(name = "BOOKEDDATE")
	private Date bookedDate;
	
	@Column(name = "NUMBEROFSEATS")
	private int numberofseats;
	
	@Column(name = "NUMBEROFTPROOMS")
	private int numberOfTprooms;
	
	@Column(name = "NUMBEROFMEETINGROOMS")
	private int numberOfMeetingRooms;
	
	@Column(name = "NUMBEROFCOORDINATORS")
	private int numberOfCoordinators; 
	
	@Column(name = "FACILITYREQUIREDDATE")
	private Date faciltyRequiredDate;
	
	@Column(name = "RESOURCESNEEDED")
	private boolean resourcesNeeded;
	
	@Column(name = "JOBSKILLS")
	private String jobSkills; 
	
	@Column(name = "RESOURCESNEEDEDCOUNT")
	private int resourcesneededcount;

	
}
