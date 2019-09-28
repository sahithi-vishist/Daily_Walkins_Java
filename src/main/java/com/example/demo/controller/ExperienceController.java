package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ExperienceModel;
import com.example.demo.service.ExperienceService;

@RestController
@CrossOrigin
public class ExperienceController {
	@Autowired
ExperienceService expService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<ExperienceModel> saveUser(@RequestBody ExperienceModel exp) {
		exp = expService.saveUser(exp);
		return ResponseEntity.ok().body(exp);
	}
	@GetMapping("/getallexp")
	public ResponseEntity<List<ExperienceModel>> getexp() {
		List<ExperienceModel> listOfexp = expService.getAll();
		return ResponseEntity.ok().body(listOfexp);
	}
}
