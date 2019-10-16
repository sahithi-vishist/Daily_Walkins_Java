package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JsAppliedJobsModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.service.JsAppliedJobsService;

@RestController
@CrossOrigin
public class JsAppliedJobsController {

	@Autowired
	JsAppliedJobsService jsAppliedJobsService;
	
	@PostMapping("/postjsappliedjob")
	public JsAppliedJobsModel postjsa(@RequestBody JsAppliedJobsModel jsAppliedJobsModel) {
	return jsAppliedJobsService.postjobs(jsAppliedJobsModel);
}
	@PutMapping("/putjsa")
	public JsAppliedJobsModel putjsa(JsAppliedJobsModel jsAppliedJobsModel) {
	return jsAppliedJobsService.updatejobs(jsAppliedJobsModel);
}
	
	@GetMapping("/getAppliedJobs")
	public List<JsAppliedJobsModel> getjsa() {
	return jsAppliedJobsService.getjobs();
}
	@GetMapping("/getbyidjsa")
	public JsAppliedJobsModel getByIdjsa(Integer id) {
	return jsAppliedJobsService.getById(id);
}
	@PostMapping("/checkappliedstatus")
	public Boolean checkJobNoAndEmail(@RequestBody JsAppliedJobsModel jsAppliedJobsModel) {
	
		 boolean result=jsAppliedJobsService.getStatus(jsAppliedJobsModel.getJobNo(),jsAppliedJobsModel.getJobSeekerEmailId());
		 if(result==true) {
			 return true;
		 }
		 else {
			 return false;
		 }
		
	}
	
}