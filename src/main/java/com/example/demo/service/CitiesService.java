package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CitiesModel;

public interface CitiesService {


	CitiesModel insertRec(CitiesModel rec);
	CitiesModel update(CitiesModel rec);
	public List<CitiesModel> getAllCities();
	
}
