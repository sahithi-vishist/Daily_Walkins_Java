package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity(name="designation")
@Data
public class DesignationModel {
	
	@Id
	@Column(name="designationid")
	private int designationId;
	
	@Column(name="designationname")
	private String designationName;
	

	
	

}
