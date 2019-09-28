package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="locations_forms")
@Data
public class LocationsFormsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="locationsid")
	private Integer locationsFormsId;
	
	@Column(name="city")
	private String city;
	
	@Column(name="citycount")
	private Integer cityCount;
	
	@Column(name="cityforms")
	private String cityForms;
	
	@Column(name="citycode")
	private Integer cityCode;

}
