package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.InterviewPanelDetailsRepository;
import com.example.demo.model.InterviewPanelDetailsModel;
import com.example.demo.service.InterviewPanelDetailsService;

@Service
public class InterviewPanelDetailsServiceImpl implements InterviewPanelDetailsService {
	@Autowired
	InterviewPanelDetailsRepository interviewPanelDetailsRepository;

	@Override
	public InterviewPanelDetailsModel saveInterview(InterviewPanelDetailsModel interviewPanelDetailsModel) {
		return interviewPanelDetailsRepository.save(interviewPanelDetailsModel);
	}

	@Override
	public List<InterviewPanelDetailsModel> getInterview() {
		return interviewPanelDetailsRepository.findAll();
	}

}
