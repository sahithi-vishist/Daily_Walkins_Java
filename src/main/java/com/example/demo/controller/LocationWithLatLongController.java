package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LocationWithLatLongModel;
import com.example.demo.service.LocationWithLatLongService;



@RestController
@CrossOrigin
public class LocationWithLatLongController {
	@Autowired
	LocationWithLatLongService locationwithlatlongservice;
	
	@GetMapping("/getLocations")
	public ResponseEntity<List<LocationWithLatLongModel>> getlatlong() {
		List <LocationWithLatLongModel> list=locationwithlatlongservice.getlatlong();
		return ResponseEntity.ok().body(list);
	}
	

	@PostMapping("/postlatlong")
	public ResponseEntity<LocationWithLatLongModel>savelatlong(@RequestBody LocationWithLatLongModel locationwithlatlongmodel) {
		locationwithlatlongmodel=locationwithlatlongservice.savelatlong(locationwithlatlongmodel);
		return ResponseEntity.ok().body(locationwithlatlongmodel);
	}

	@PutMapping("/updatelatlong")
	public ResponseEntity<LocationWithLatLongModel> updatelatlong(@RequestBody LocationWithLatLongModel locationwithlatlongmodel) {
		locationwithlatlongmodel= locationwithlatlongservice.updatelatlong(locationwithlatlongmodel);
		return ResponseEntity.ok().body(locationwithlatlongmodel);
		
	}
	@GetMapping("/getlat")
	public ResponseEntity<LocationWithLatLongModel> getById(@RequestParam(name="Id") Integer Id) {
		LocationWithLatLongModel locationwithlatlongmodel = locationwithlatlongservice.getById(Id);
		return ResponseEntity.ok().body(locationwithlatlongmodel);
		
		
	}
	@DeleteMapping("/deletelatlong")
	public ResponseEntity<String> deletelatlong(@RequestParam(name="Id") Integer Id) {
		locationwithlatlongservice.deletelatlong(Id);
		return ResponseEntity.ok().body("locationwithlatlongmodel deleted");
	}


}
