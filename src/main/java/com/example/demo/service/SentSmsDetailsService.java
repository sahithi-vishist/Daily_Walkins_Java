package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SentSmsDetailsModel;

public interface SentSmsDetailsService {
	
SentSmsDetailsModel saveS(SentSmsDetailsModel sentSmsDetailsModel);
	
	List<SentSmsDetailsModel> getS();


}
