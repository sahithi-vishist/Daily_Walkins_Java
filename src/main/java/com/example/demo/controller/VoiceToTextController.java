package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.VoiceToTextModel;
import com.example.demo.service.VoiceToTextService;

@RestController
public class VoiceToTextController {
	
	@Autowired
	VoiceToTextService voiceToTextService;
	

	@PostMapping("/test12345")
	public VoiceToTextModel saveB(@RequestBody VoiceToTextModel voiceToTextModel) {
		return voiceToTextService.saveV(voiceToTextModel);
	
	}
	
	@GetMapping("/test123456")
	public List<VoiceToTextModel> getB() {
		
		return voiceToTextService.getV();
	
		
	}

}
