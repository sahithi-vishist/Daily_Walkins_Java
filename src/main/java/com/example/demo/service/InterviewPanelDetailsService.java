package com.example.demo.service;

import java.util.List;

import com.example.demo.model.InterviewPanelDetailsModel;

public interface InterviewPanelDetailsService {

	public InterviewPanelDetailsModel saveInterview(InterviewPanelDetailsModel interviewPanelDetailsModel);
	
	public List<InterviewPanelDetailsModel> getInterview();
	
}
