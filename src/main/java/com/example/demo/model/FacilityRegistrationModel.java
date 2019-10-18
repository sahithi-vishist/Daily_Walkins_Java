package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity(name = "facility_registration")
@Data
public class FacilityRegistrationModel {
	
	@Id
	@Column(name="FACILITYREGISTRATIONID")
	private int facilityRegistrationId;
	
	@Column(name = "FACILITY")
	private String facility ;
	
	@OneToOne
	@JoinColumn(name = "FACILITYID")
	private FacilityLoginModel facilityId;
	
	@Column(name = "LOCATION")
	private String Location ;
	
	@Column(name = "LOCALITY")
	private String Locality ;
	
	@Column(name = "CONTACTNAME")
	private String ContactName ;
	
	@Column(name = "EMAIL")
	private String Email;
	
	@Column(name = "CONTACTNUMBER")
	private String ContactNumber;
	
	@Column(name = "ADDRESS")
	private String address ;
	
	@Column(name = "SEATINGAVAILABILITYCOUNT")
	private int seatingAvailabilityCount;
	
	@Column(name = "TPAVAILABILITYCOUNT")
	private int tpAvailabilityCount;
	
	@Column(name = "MEETINGROOMSCOUNT")
	private int meetingRoomsCount;
	
	@Column(name = "COORDINATORS")
	private String coordinators;
	
	@Column(name = "SEATCOST")
	private Float seatCost;
	
	@Column(name = "TPROOMCOST")
	private Float tproomCost;
	
	@Column(name = "MEETINGROOMCOST")
	private Float MeetingRoomCost;
	
	@Column(name = "COORDINATORCOST")
	private Float coordinatorCost; 
	
	@Column(name = "AVAILABILITYDATES")
	private String availabilityDates;
	
	@Column(name = "COMMENTS")
	private String comments;


}
