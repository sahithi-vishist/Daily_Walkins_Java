package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ExperienceModel;



public interface ExperienceService {
	public ExperienceModel saveUser(ExperienceModel exp);
	public List<ExperienceModel> getAll();
}
