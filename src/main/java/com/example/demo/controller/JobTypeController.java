package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JobTypeModel;
import com.example.demo.service.JobTypeService;


@CrossOrigin
@RestController
public class JobTypeController {
	@Autowired
	JobTypeService jobTypeService;
		@PostMapping("/savejobtype")
		public ResponseEntity<JobTypeModel> saveJobtype(@RequestBody JobTypeModel jobType){
			jobType=jobTypeService.saveJobType(jobType);
			return ResponseEntity.ok().body(jobType);
		}
		@GetMapping("/getJobTypes")
		public ResponseEntity<List<JobTypeModel>> getAll(){
			List<JobTypeModel> listOfJobs=jobTypeService.getAll();
			return ResponseEntity.ok().body(listOfJobs);
		}
}
