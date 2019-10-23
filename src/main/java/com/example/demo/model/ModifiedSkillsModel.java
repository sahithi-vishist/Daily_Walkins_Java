package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "modified_skills")
@Data

public class ModifiedSkillsModel {
	@Id
	@Column(name = "modifiedskillid")
	private int modifiedSkillId; 
	
	@Column(name = "alternativeskill")
	private String alternativeSkill;
	
	@Column(name = "businessskill")
	private String businessSkill;
	
	@Column(name = "priority")
	private int priority;
	
	@Column(name = "requiredkeyskills")
	private String requiredKeySkills;
	
	@Column(name = "skillcode")
	private int skillCode;
	
	@Column(name = "type")
	private String type;
	
	
}
