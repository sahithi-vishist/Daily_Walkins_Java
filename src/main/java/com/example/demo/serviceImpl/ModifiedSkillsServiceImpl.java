package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ModifiedSkillsRepository;

import com.example.demo.model.ModifiedSkillsModel;

import com.example.demo.service.ModifiedSkillsService;

@Service
public class ModifiedSkillsServiceImpl implements ModifiedSkillsService {
@Autowired
ModifiedSkillsRepository modifiedSkillsRepository;

@Override
public List<ModifiedSkillsModel> getKeySkills() {
	return modifiedSkillsRepository.findAll();
}

	
}
