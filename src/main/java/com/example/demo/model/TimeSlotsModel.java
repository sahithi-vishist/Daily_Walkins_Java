package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="time_slots")
@Data
public class TimeSlotsModel {
	
	@Id
	@Column(name="timeslotsid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer timeSlotsId;
	
	@Column(name="hourstext")
	private String hoursText;
	
	@Column(name="hoursvalue")
	private String hoursValue;


	
}
