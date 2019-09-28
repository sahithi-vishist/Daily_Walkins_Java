package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IndustriesRepository;
import com.example.demo.model.IndustriesModel;
import com.example.demo.service.IndustriesService;

@Service
public class IndustriesServiceImpl implements IndustriesService
{
	@Autowired
	IndustriesRepository industriesRepository;

	@Override
	public IndustriesModel saveIndustries( IndustriesModel industriesModel) {
		return industriesRepository.save(industriesModel);
	}

	@Override
	public List<IndustriesModel> getIndustries() {
		return industriesRepository.findAll();
	}
	
	@Override
	public IndustriesModel getById(Integer inId) {
		
		return industriesRepository.findById(inId).get();
	}


}