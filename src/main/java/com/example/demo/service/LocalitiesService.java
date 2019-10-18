package com.example.demo.service;

import java.util.List;

import com.example.demo.model.LocalitiesModel;


public interface LocalitiesService {
	
LocalitiesModel saveL(LocalitiesModel localitiesModel);
	
	List<LocalitiesModel> getL();

}
