package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SentSmsDetailsModel;
import com.example.demo.service.SentSmsDetailsService;

@RestController
@CrossOrigin
public class SentSmsDetailsController {

	@Autowired
	SentSmsDetailsService sentSmsDetailsService;
	
	@PostMapping("/Sent")
	public SentSmsDetailsModel saveE(@RequestBody SentSmsDetailsModel sentSmsDetailsModel) {
		return sentSmsDetailsService.saveS(sentSmsDetailsModel);
	
	}
	
	@GetMapping("/Sent1")
	public List<SentSmsDetailsModel> getE() {
		
		return sentSmsDetailsService.getS();
	
		
	}
}
