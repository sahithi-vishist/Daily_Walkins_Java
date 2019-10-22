package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;


@Data
@Entity(name="panel_details")
public class PanelDetailsModel {
	
	@Id
	@Column(name="id")
	private int id ;
	
	
	@Column(name = "panelid")
	private String panelId; 
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "majorskills")
	private String majorSkills;
	
	@Column(name = "availableforf2f")
	private boolean availableForF2F; 
	
	@Column(name = "availableforskype")
	private boolean availableForSkype;
	
	@Column(name = "availablefortelephonic")
	private boolean availableForTelephonic;
	
	@Column(name = "availabletimeslotsforfacetoface")
	private String availableTimeSlotsForFaceToFace;
	
	@Column(name = "availabletimeslotsfortelephonic")
	private String availableTimeSlotsForTelephonic; 
	
	@Column(name = "availabletimeslotsforskype")
	private String availableTimeSlotsForSkype; 
	
	@Column(name = "costperhourforf2f")
    private int	costPerHourForF2F; 
	
	@Column(name="costperdayforf2f")
	private int costPerDayForF2F;
	
	@Column(name="costperhourfortelephonic")
	private int costPerHourForTelephonic; 
	
	@Column(name = "costperdayfortelephonic")
	private int costPerDayForTelephonic;
	
	@Column(name = "costperhourforskype")
	private int costPerHourForSkype; 
	
	@Column(name = "costperdayforskype")
	private int costPerDayForSkype;

	
}
