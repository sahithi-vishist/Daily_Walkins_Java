package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.ModifiedSkillsModel;
import com.example.demo.service.ModifiedSkillsService;

@RestController
@CrossOrigin
public class ModifiedSkillsController {
@Autowired
ModifiedSkillsService modifiedSkillsService;
	
	@GetMapping("/getkeyskills")
	public ResponseEntity<List<ModifiedSkillsModel>> getSkills() {
		List <ModifiedSkillsModel> list=modifiedSkillsService.getKeySkills();
		return ResponseEntity.ok().body(list);
	}
	
}

