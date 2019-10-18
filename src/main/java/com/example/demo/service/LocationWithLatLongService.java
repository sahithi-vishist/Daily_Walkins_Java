package com.example.demo.service;

import java.util.List;

import com.example.demo.model.LocationWithLatLongModel;



public interface LocationWithLatLongService {
	
	public LocationWithLatLongModel savelatlong(LocationWithLatLongModel locationwithlatlongmodel);
	public List<LocationWithLatLongModel> getlatlong();
	public LocationWithLatLongModel updatelatlong(LocationWithLatLongModel locationwithlatlongmodel);
	public void deletelatlong(Integer id);
	public LocationWithLatLongModel getById(Integer id);

}