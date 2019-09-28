package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.LocationWithLatLongRepository;

import com.example.demo.model.LocationWithLatLongModel;

import com.example.demo.service.LocationWithLatLongService;

@Service
public class LocationWithLatLongServiceImpl implements LocationWithLatLongService {
	@Autowired
	LocationWithLatLongRepository locationwithlatlongrepository;

	@Override
	public LocationWithLatLongModel savelatlong(LocationWithLatLongModel locationwithlatlongmodel) {
		return locationwithlatlongrepository.save(locationwithlatlongmodel);
		
	}

	@Override
	public List<LocationWithLatLongModel> getlatlong() {
		return locationwithlatlongrepository.findAll();
	}

	@Override
	public LocationWithLatLongModel updatelatlong(LocationWithLatLongModel locationwithlatlongmodel) {
		return locationwithlatlongrepository.save(locationwithlatlongmodel);
	}

	@Override
	public void deletelatlong(Integer id) {
		LocationWithLatLongModel locationwithlatlongmodel= locationwithlatlongrepository.findById(id).get();
		if(locationwithlatlongmodel!=null)
		{
			locationwithlatlongrepository.delete(locationwithlatlongmodel);
		}
		
	}

	@Override
	public LocationWithLatLongModel getById(Integer id) {
		return locationwithlatlongrepository.findById(id).get();
	}

}
