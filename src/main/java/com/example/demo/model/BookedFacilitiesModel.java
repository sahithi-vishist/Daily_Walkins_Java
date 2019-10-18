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
	@Column(name="bookedfacilityid")
	private int bookedFacilityId; 
	
	@Column(name = "companyemail")
	private String companyEmail;
	
	@Column(name = "companyname")
	private String companyName;
	
	@Column(name = "contactnumber")
	private String contactNumber;
	
	@Column(name = "bookeddate")
	private Date bookedDate;
	
	@Column(name = "numberofseats")
	private int numberOfSeats;
	
	@Column(name = "numberoftprooms")
	private int numberOfTprooms;
	
	@Column(name = "numberofmeetingrooms")
	private int numberOfMeetingRooms;
	
	@Column(name = "numberofcoordinators")
	private int numberOfCoordinators; 
	
	@Column(name = "faciityrequireddate")
	private Date faciityRequiredDate;
	
	@Column(name = "resourcesneeded")
	private boolean resourcesNeeded;
	
	@Column(name = "jobskills")
	private String jobSkills; 
	
	@Column(name = "resourcesneededcount")
	private int resourcesNeededCount;

	
}
