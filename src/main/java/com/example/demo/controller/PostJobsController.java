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
import com.example.demo.model.LocationWithLatLongModel;
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
	@PostMapping("/searchByLocation")
	public ResponseEntity<List<PostJobsModel>> getJobsLocation(@RequestBody PostJobsModel postjobsModel){
		
		List<PostJobsModel> res=postJobsService.getJobsByLocation(postjobsModel.getLocation());
		return ResponseEntity.ok().body(res);
		}
	@PostMapping("/searchByIndustry")
	public ResponseEntity<List<PostJobsModel>> getJobsIndustry(@RequestBody PostJobsModel postJobsModel){
		
		List<PostJobsModel> res=postJobsService.getJobsByIndustry(postJobsModel.getIndustryId());
		return ResponseEntity.ok().body(res);
		}
	
	@PostMapping("/searchByMinExp")
	public ResponseEntity<List<PostJobsModel>> getJobsByMinExp(@RequestBody PostJobsModel postJobsModel){
		
		List<PostJobsModel> res=postJobsService.getJobsByminExp(postJobsModel.getExpMin());
		return ResponseEntity.ok().body(res);
		}
	@PostMapping("/searchByMaxExp")
	public ResponseEntity<List<PostJobsModel>> getJobsByMaxExp(@RequestBody PostJobsModel postJobsModel){
		
		List<PostJobsModel> res=postJobsService.getJobsBymaxExp(postJobsModel.getExpMax());
		return ResponseEntity.ok().body(res);
		}
	
	@PostMapping("/searchByRole")
	public ResponseEntity<List<PostJobsModel>> getJobsByRole(@RequestBody PostJobsModel postJobsModel){
		
		List<PostJobsModel> res=postJobsService.getJobsByRole(postJobsModel.getRoleId());
		return ResponseEntity.ok().body(res);
		}
	@PostMapping("/searchByJobType")
	public ResponseEntity<List<PostJobsModel>> getJobsByJobType(@RequestBody PostJobsModel postJobsModel){
		
		List<PostJobsModel> res=postJobsService.getJobsByJobType(postJobsModel.getJobTypeId());
		return ResponseEntity.ok().body(res);
		}

@PostMapping("/searchByQualification")
public ResponseEntity<List<PostJobsModel>> getJobsByQualification(@RequestBody PostJobsModel postJobsModel){
	
	List<PostJobsModel> res=postJobsService.getJobsByEducation(postJobsModel.getQualification());
	return ResponseEntity.ok().body(res);
	}
	
	
}
