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

import com.example.demo.model.BookedFacilitiesModel;
import com.example.demo.service.BookedFacilitiesService;

@RestController
@CrossOrigin
public class BookedFacilitiesController {
	
	
	@Autowired
	
	BookedFacilitiesService bookedFacilitiesService;
	
	@GetMapping("/getbookedfacility")
	public ResponseEntity<List<BookedFacilitiesModel>>getbookedfacility() {
		List <BookedFacilitiesModel> list=bookedFacilitiesService.getbookedfacility();
		return ResponseEntity.ok().body(list);
	}
	

	@PostMapping("/postbookedfacility")
	public ResponseEntity<BookedFacilitiesModel> savebookedfacility(@RequestBody BookedFacilitiesModel bookedfacilitiesmodel) {
		bookedfacilitiesmodel=bookedFacilitiesService.savebookedfacility(bookedfacilitiesmodel);
		return ResponseEntity.ok().body(bookedfacilitiesmodel);
	}

	@PutMapping("/updatebookedfacility")
	public ResponseEntity<BookedFacilitiesModel> updatebookedfacility(@RequestBody BookedFacilitiesModel bookedfacilitiesmodel) {
		bookedfacilitiesmodel = bookedFacilitiesService.updatebookedfacility(bookedfacilitiesmodel);
		return ResponseEntity.ok().body(bookedfacilitiesmodel);
		
	}
	@GetMapping("/getbooked")
	public ResponseEntity<BookedFacilitiesModel> getbooked(@RequestParam(name="Id") Integer Id) {
		BookedFacilitiesModel bookedfacilitiesmodel = bookedFacilitiesService.getById(Id);
		return ResponseEntity.ok().body(bookedfacilitiesmodel);
		
		
	}
	@DeleteMapping("/deletebookedfacility")
	public ResponseEntity<String> deletebookedfacility(@RequestParam(name="Id") Integer Id) {
		bookedFacilitiesService.deletebookedfacility(Id);
		return ResponseEntity.ok().body("bookedfacilitiesmodel deleted");
	}

}


