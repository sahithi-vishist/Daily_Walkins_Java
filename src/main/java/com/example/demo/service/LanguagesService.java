package com.example.demo.service;

import java.util.List;

import com.example.demo.model.LanguagesModel;

public interface LanguagesService {
	
	public LanguagesModel saveUser(LanguagesModel languagesModel);
	public List<LanguagesModel> getAll();

}
