package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.TimeSlotsRepository;
import com.example.demo.model.TimeSlotsModel;
import com.example.demo.service.TimeSlotsService;

@Service
public class TimeSlotsServiceImpl implements TimeSlotsService{
	
	@Autowired
	TimeSlotsRepository timeSlotsRepository;

	@Override
	public TimeSlotsModel saveT(TimeSlotsModel timeSlotsModel) {
		return timeSlotsRepository.save(timeSlotsModel);
	}

	@Override
	public List<TimeSlotsModel> getT() {
		return timeSlotsRepository.findAll();
	}

}
