package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TimeSlotsModel;


public interface TimeSlotsService {
	
TimeSlotsModel saveT(TimeSlotsModel timeSlotsModel);
	
	List<TimeSlotsModel> getT();

}
