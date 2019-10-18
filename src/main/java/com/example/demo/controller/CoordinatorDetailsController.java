package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CoordinatorDetailsModel;
import com.example.demo.service.CoordinatorDetailsService;

@RestController
@CrossOrigin
public class CoordinatorDetailsController {
	
	@Autowired
	CoordinatorDetailsService coordinatorDetailsService;
	
	@GetMapping("/getCoordinatorDetails")
	public List<CoordinatorDetailsModel> getAll()
	{
		return coordinatorDetailsService.getData();
	}
	
	@PostMapping("/saveCoordinatorDetails")
	public CoordinatorDetailsModel saveAll(@RequestBody CoordinatorDetailsModel coordinatorDetailsModel)
	{
		System.out.println(coordinatorDetailsModel.toString());
		return coordinatorDetailsService.save(coordinatorDetailsModel);
	}

	@DeleteMapping("/deleteCoordinatorDetails")
	void deleteByIdCo(@RequestParam int coordinatorId) {
		System.out.println("called");
		 coordinatorDetailsService.deleteCo(coordinatorId);
	}
	
	@GetMapping("/getByidCo")
	public CoordinatorDetailsModel getByIdCo(@RequestParam Integer id) {
		return coordinatorDetailsService.getByIdCo(id);
	}
	
	@PutMapping("/putCo")
	public CoordinatorDetailsModel updateCo(@RequestBody CoordinatorDetailsModel coordinatorDetailsModel)
	{
		return coordinatorDetailsService.updateCo(coordinatorDetailsModel);
	}
}
