package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity(name="languages")
@Data
public class LanguagesModel {
	
	@Id
		@Column(name="langid")
		private int lId;
		
		@Column(name="language")
		private String languageName;

}
