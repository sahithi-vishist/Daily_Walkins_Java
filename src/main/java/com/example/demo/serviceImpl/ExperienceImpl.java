package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ExperienceRepository;
import com.example.demo.model.ExperienceModel;
import com.example.demo.service.ExperienceService;

@Service
public class ExperienceImpl implements ExperienceService {
	@Autowired
	ExperienceRepository exprepository;

	@Override
	public ExperienceModel saveUser(ExperienceModel exp) {
		// TODO Auto-generated method stub
		return exprepository.save(exp);
	}
	@Override
	public List<ExperienceModel> getAll() {
		
		return exprepository.findAll();
	}

	
}
