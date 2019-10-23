package com.example.demo.service;

import java.util.List;

import com.example.demo.model.LocationsFormsModel;


public interface LocationsFormsService {

LocationsFormsModel saveLocation(LocationsFormsModel locationsFormsModel);
	
	List<LocationsFormsModel> getLocation();

}
