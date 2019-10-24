package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.LocationsFormsRepository;
import com.example.demo.model.LocationsFormsModel;
import com.example.demo.service.LocationsFormsService;

@Service
public class LocationsFormsServiceImpl implements LocationsFormsService{
	
	@Autowired
	LocationsFormsRepository locationsFormsRepository;
	
	@Override
	
	public LocationsFormsModel saveLocation(LocationsFormsModel locationsFormsModel) {
		return locationsFormsRepository.save(locationsFormsModel);
	}

	@Override
	public List<LocationsFormsModel> getLocation() {
		return locationsFormsRepository.findAll();
	}

	@Override
	public LocationsFormsModel saveLl(LocationsFormsModel locationsFormsModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationsFormsModel> getLl() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
