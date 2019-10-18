package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "chat_messages")
@Data

public class ChatMessagesModel {
	@Id
	@Column(name = "chatmessages")
	private int chatMessageId; 
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "walkerid")
	private int walkerId;
	
	@Column(name = "recruiterid")
	private int recruiterId;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "shotrtime")
	private String shortTime;
	
	@Column(name = "msgTime")
	private Date msgTime;
	
	@Column(name = "sender")
	private String sender;

}
