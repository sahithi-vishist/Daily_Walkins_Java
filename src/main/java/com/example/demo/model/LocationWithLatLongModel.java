package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "location_with_lat_long")
@Data

public class LocationWithLatLongModel {
	@Id
	@Column(name = "locationlatlongid")
	private int locationLatLongId; 
	
	@Column(name = "latitude")
	private Float latitude;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "longitude")
	private Float logitude;
	
	

}
