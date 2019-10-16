package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LanguagesModel;
import com.example.demo.service.LanguagesService;

@RestController
@CrossOrigin
public class LanguagesController {
	
	@Autowired
	LanguagesService languagesService;
	
	@GetMapping("/getlanguages")
	public List<LanguagesModel> getlanguage(){
		return languagesService.getAll();		
	}
	
	@PostMapping("/postlanguage")
	public LanguagesModel savelanguage(@RequestBody LanguagesModel languagesModel) {
		return languagesService.saveUser(languagesModel);
		
	}

}
