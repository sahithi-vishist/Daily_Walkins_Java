package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="chat_status")
@Data
public class ChatStatusModel {
	
	@Id
	@Column(name="chatstatusid")
	private int chatStatusId ;
	
	@Column(name="walkerid")
	private int walkerId ;
	
	@Column(name="recruiterid")
	private int recruiterId ;
	
	@Column(name="jobid")
	private char jobId ; 
	
	@Column(name="walkerjoinedstatus")
	private boolean walkerJoinedStatus ;
	
	@Column(name="recruiterjoinedstatus")
	private boolean recruiterJoinedStatus ;
	
	@Column(name="walkerclosedstatus")
	private boolean walkerClosedStatus ;
	
	@Column(name="recruiterclosedstatus")
	private boolean recruiterClosedStatus ;
	

}
