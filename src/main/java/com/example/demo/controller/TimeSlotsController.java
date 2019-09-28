package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TimeSlotsModel;
import com.example.demo.service.TimeSlotsService;

@RestController
@CrossOrigin
public class TimeSlotsController {
	
	@Autowired
	TimeSlotsService timeSlotsService;
	

	@PostMapping("/Time")
	public TimeSlotsModel saveD(@RequestBody TimeSlotsModel timeSlotsModel) {
		return timeSlotsService.saveT(timeSlotsModel);
	
	}
	
	@GetMapping("/gettimeslots")
	public List<TimeSlotsModel> getD() {
		
		return timeSlotsService.getT();
	
		
	}

}
