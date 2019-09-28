package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.service.PostJobsService;

@RestController
@CrossOrigin
public class PostJobsController {
	
	
	@Autowired
	PostJobsService postJobsService;
	
	@GetMapping("/getjobs")
	public List<PostJobsModel> getjobs(){
		return postJobsService.getjobs();
		
	}

	@PostMapping("/postjobs")
	public PostJobsModel postjobs(@RequestBody PostJobsModel postJobsModel) {
		return postJobsService.postjobs(postJobsModel);
	}
	
	@GetMapping("/getjobbyid")
	public PostJobsModel getJob(@RequestParam(name="jobNo") Integer jobNo) {
		return postJobsService.getJobById(jobNo);
	}
	
	@PostMapping("/getjobsbykeyskills")
	public ResponseEntity<List<PostJobsModel>> getJobBySkills(@RequestBody PostJobsModel postjobsModel){
	//res= postJobsService.getByKeySkills(postjobsModel.getKeySkills());
	List<PostJobsModel> res=postJobsService.getByKeySkills(postjobsModel.getKeySkills());
	return ResponseEntity.ok().body(res);
	}
	
	@PostMapping("/EmailCheck")
	public ResponseEntity<List<PostJobsModel>> getJobNo(@RequestBody PostJobsModel postJobModel) {
		List<PostJobsModel> res= postJobsService.getJobNo(postJobModel.getEmail());
		return ResponseEntity.ok().body(res);
	}
}
