package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RecruiterPrivacySettingsModel;
import com.example.demo.service.RecruiterPrivacySettingsService;

@RestController
@CrossOrigin
@RequestMapping
public class RecruiterPrivacySettingsController {
	
	@Autowired(required=true)
	RecruiterPrivacySettingsService  recruiterPrivacySettingsService;

@PostMapping("/saveAlerts")
public RecruiterPrivacySettingsModel Test(@RequestBody RecruiterPrivacySettingsModel recruiterPrivacySettingsModel)
{
	return recruiterPrivacySettingsService.insertRec(recruiterPrivacySettingsModel);
}
}
