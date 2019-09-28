package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.SentSmsDetailsRepository;
import com.example.demo.model.SentSmsDetailsModel;
import com.example.demo.service.SentSmsDetailsService;

@Service
public class SentSmsDetailsServiceImpl implements SentSmsDetailsService {
	
	@Autowired
	SentSmsDetailsRepository sentSmsDetailsRepository;

	@Override
	public SentSmsDetailsModel saveS(SentSmsDetailsModel sentSmsDetailsModel) {
		return sentSmsDetailsRepository.save(sentSmsDetailsModel);
	}

	@Override
	public List<SentSmsDetailsModel> getS() {
		return sentSmsDetailsRepository.findAll();
	}

}
