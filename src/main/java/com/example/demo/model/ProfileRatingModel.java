package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="profile_rating")
@Data
public class ProfileRatingModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="profileratingid")
	private Integer profileRatingId;
	
	@Column(name="companyemailid")
	private String companyEmailId;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="walkeremail")
	private String walkerEmail;
	
	@Column(name="rateddate")
	private String ratedDate;
	
	@Column(name="recruiteremail")
	private String recruiterEmail;
	
	@Column(name="userrating")
	private Double userRating;

	
	
}
