package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RecruiterRegistrationModel;
import com.example.demo.service.PostJobsService;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public PostJobsModel postjobs(@RequestParam("postWalkinDetails") String postWalkinDetails,
			@RequestParam("companyLogo") MultipartFile companyLogo) throws IOException {
		PostJobsModel postJobsModel =new PostJobsModel();
		postJobsModel = new ObjectMapper().readValue(postWalkinDetails,PostJobsModel.class);
		postJobsModel.setCompanyLogo(companyLogo.getBytes());
		
		return postJobsService.postjobs(postJobsModel);
	}
	
	@GetMapping("/getjobbyid")
	public PostJobsModel getJob(@RequestParam(name="jobNo") Integer jobNo) {
		return postJobsService.getJobById(jobNo);
	}
	@PutMapping("/updatewalkin")
	public ResponseEntity<PostJobsModel> updateWalkin(@RequestBody PostJobsModel postJobsModel) {
		postJobsModel=postJobsService.updateWalkin(postJobsModel);
		return ResponseEntity.ok().body(postJobsModel);
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
