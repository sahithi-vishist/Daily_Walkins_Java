
package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="CITIES")
@Data
public class CitiesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "CITYID")
	private int cityId;
	
	
	@Column(name="CITYNAME")
	private String cityName;
	
	
	@Column(name="SID")
	private String sId;
	
	
	@Column(name="SNO")
	private String sNo;


	
	
}
