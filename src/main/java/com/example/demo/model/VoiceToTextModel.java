package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="voice_to_text")
@Data
public class VoiceToTextModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="voicetotextid")
	private Integer voiceToTextId;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="email")
	private String email;
	
	@Column(name="text")
	private String text;


}
