package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.InterviewPanelDetailsModel;
import com.example.demo.service.InterviewPanelDetailsService;

@RestController
public class interviewPanelDetailsController {
	@Autowired
	InterviewPanelDetailsService interviewPanelDetailsService;
	
	@PostMapping ("/postInterview")
	public InterviewPanelDetailsModel postInterview(@RequestBody InterviewPanelDetailsModel interviewPanelDetailsModel)
	{
		return interviewPanelDetailsService.saveInterview(interviewPanelDetailsModel);
	}

	@GetMapping ("/postInterview")
	public List<InterviewPanelDetailsModel> getInterview()
	{
		return interviewPanelDetailsService.getInterview();
	}
}
