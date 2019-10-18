package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.LocalitiesRepository;
import com.example.demo.model.LocalitiesModel;
import com.example.demo.service.LocalitiesService;

@Service
public class LocalitiesServiceImpl implements LocalitiesService {
	
	@Autowired
	LocalitiesRepository localitiesRepository;

	@Override
	public LocalitiesModel saveL(LocalitiesModel localitiesModel) {
		return localitiesRepository.save(localitiesModel);
	}

	@Override
	public List<LocalitiesModel> getL() {
		return localitiesRepository.findAll();
	}

}
