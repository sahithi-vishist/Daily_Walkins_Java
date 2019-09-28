package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="localities")
@Data
public class LocalitiesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="localitiesid")
	private Integer localitiesId;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="latitude")
	private Double latitude;
	
	@Column(name="location")
	private String location;
	
	@Column(name="longitude")
	private String longitude;
	
}
