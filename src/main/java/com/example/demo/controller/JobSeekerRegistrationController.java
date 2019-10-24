package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.jwt.JwtTokenUtil;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.JsAppliedJobsModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.service.JobSeekerRegistrationService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
public class JobSeekerRegistrationController {
	
	@Autowired
	JobSeekerRegistrationService jobSeekerRegistrationService;
	
	@Value("${jwt.http.request.header}")
	private String tokenHeader;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
//	@PostMapping("/register")
//	public ResponseEntity<JobSeekerRegistrationModel> register(@RequestBody JobSeekerRegistrationModel walker){
//		walker=jobSeekerRegistrationService.registerWalker(walker);
//		return ResponseEntity.ok().body(walker);
//	}
	@GetMapping("/totalwalkers")
	public ResponseEntity<List<JobSeekerRegistrationModel>> getAllWalkers()
	{
		
		List<JobSeekerRegistrationModel> listOfWalkers=jobSeekerRegistrationService.getAllWalkers();
		return ResponseEntity.ok().body(listOfWalkers);
		
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<String> save(@Valid @RequestParam("regDetails") String regDetails,
			@RequestParam("photo") MultipartFile photo,
			@RequestParam("resume") MultipartFile resume) throws IOException
	{
		System.out.println(regDetails);
		JobSeekerRegistrationModel jobSeekerRegistrationModel=new JobSeekerRegistrationModel();
		jobSeekerRegistrationModel = new ObjectMapper().readValue(regDetails, JobSeekerRegistrationModel.class);
		jobSeekerRegistrationModel.setPhoto(photo.getBytes());
		jobSeekerRegistrationModel.setResume(resume.getBytes());
		jobSeekerRegistrationService.saveData(jobSeekerRegistrationModel);
		
		return ResponseEntity.ok().body("registration successfull");
		
		
	}
	@GetMapping("/getwalkerbyid")
	
	public ResponseEntity<JobSeekerRegistrationModel> getUserById(@RequestParam(name="walkerId") Integer walkerId){
		JobSeekerRegistrationModel walker=jobSeekerRegistrationService.getById(walkerId);
		return ResponseEntity.ok().body(walker);
		
	}
	@PutMapping("/updatewalker")
	public ResponseEntity<JobSeekerRegistrationModel> update(@Valid @RequestParam("updateDetails") String updateDetails,
			@RequestParam("photo") MultipartFile photo,
			@RequestParam("resume") MultipartFile resume) throws IOException
	{
		
		JobSeekerRegistrationModel jobSeekerRegistrationModel=new JobSeekerRegistrationModel();
		jobSeekerRegistrationModel = new ObjectMapper().readValue(updateDetails, JobSeekerRegistrationModel.class);
		jobSeekerRegistrationModel.setPhoto(photo.getBytes());
		jobSeekerRegistrationModel.setResume(resume.getBytes());
		JobSeekerRegistrationModel walker=jobSeekerRegistrationService.updateWalker(jobSeekerRegistrationModel);
		return ResponseEntity.ok().body(walker);
	}
	
   
   @GetMapping("/getId")
   
   public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request) {
		String authToken = request.getHeader(tokenHeader);
		
		final String token = authToken.substring(7);
		String username = jwtTokenUtil.getUsernameFromToken(token);
		int res=jobSeekerRegistrationService.getWalker(username);
		return ResponseEntity.ok().body(res);
			
	}
   @GetMapping("/checkemail")
	
	public ResponseEntity<String> checkEmail(@RequestParam(name="email") String email){
		String res=jobSeekerRegistrationService.checkByEmail(email);

		return ResponseEntity.ok().body(res);
		
	}
   
   @PostMapping("/getWalkerByEmail")
   public ResponseEntity<JobSeekerRegistrationModel> getWalkerByEmail(@RequestBody JobSeekerRegistrationModel walker){
	   
	   JobSeekerRegistrationModel res=jobSeekerRegistrationService.findWalkerByEmail(walker.getEmail());
		System.out.println(res);
	   return ResponseEntity.ok().body(res);
		
		
	}
   @PostMapping("/getWalkersByKeySkills")
   public ResponseEntity<List<JobSeekerRegistrationModel>> getWalkerBySkills(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
	   List<JobSeekerRegistrationModel> res=new ArrayList();
	   String result=jobSeekerRegistrationModel.getKeySkills();
	   String[] set=result.split("\\,");
	   for(String skills:set) {
		   res.addAll(jobSeekerRegistrationService.getByKeySkills(skills));
	   }
		//List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getByKeySkills(jobSeekerRegistrationModel.getKeySkills());
		return ResponseEntity.ok().body(res);
}
   @PostMapping("/searchWalkerByLocation")
   public ResponseEntity<List<JobSeekerRegistrationModel>> getWalkerByLocation(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
		
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getwalkerByLocation(jobSeekerRegistrationModel.getLocation());
		return ResponseEntity.ok().body(res);
}
   @PostMapping("/searchWalkerByPreferedLocation")
   public ResponseEntity<List<JobSeekerRegistrationModel>> getWalkerByPrefLocation(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
		
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getwalkerByPrefLocation(jobSeekerRegistrationModel.getPreferredLocation());
		return ResponseEntity.ok().body(res);
}
   
	@PostMapping("/searchWalkerByIndustry")
	public ResponseEntity<List<JobSeekerRegistrationModel>> getwalkerByIndustry(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
		
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getwalkerByIndustry(jobSeekerRegistrationModel.getIndustryId());
		return ResponseEntity.ok().body(res);
		}
	
//	@PostMapping("/searchwalkerByMinExp")
//	public ResponseEntity<List<JobSeekerRegistrationModel>> getJobsByMinExp(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
//		
//		List<PostJobsModel> res=jobSeekerRegistrationService.getwalkerByminExp(jobSeekerRegistrationModel.getExperience());
//		return ResponseEntity.ok().body(res);
//		}
@GetMapping("/getbyexperience")
	
  	public ResponseEntity<List<JobSeekerRegistrationModel>> getbetween(@RequestParam(name="minExp")float minExp,@RequestParam(name="maxExp")float maxExp){
  		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getBetweenExp(minExp,maxExp);

  		return ResponseEntity.ok().body(res);
  		
  	}
   
	
	@PostMapping("/searchWalkerRole")
	public ResponseEntity<List<JobSeekerRegistrationModel>> getwalkerByRole(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
		
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getwalkerByRole(jobSeekerRegistrationModel.getRoleId());
		return ResponseEntity.ok().body(res);
		}
	@PostMapping("/searchWalkerNoticePeriod")
	public ResponseEntity<List<JobSeekerRegistrationModel>> getwalkerByNoticePeriod(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
		
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getwalkerByNoticePeriod(jobSeekerRegistrationModel.getNoticePeriod());
		return ResponseEntity.ok().body(res);
		}

@PostMapping("/searchByWalkerQualification")
public ResponseEntity<List<JobSeekerRegistrationModel>> getwalkerByQualification(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
	
	List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getwalkerByEducation(jobSeekerRegistrationModel.getEducation());
	return ResponseEntity.ok().body(res);
	}
@PostMapping("/searchByAll")

	public ResponseEntity<List<JobSeekerRegistrationModel>> getByAll(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel){
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationService.getwalkerByAll(jobSeekerRegistrationModel.getKeySkills(),
				jobSeekerRegistrationModel.getLocation(),jobSeekerRegistrationModel.getPreferredLocation(),
				jobSeekerRegistrationModel.getEducation(),
				jobSeekerRegistrationModel.getIndustryId(),jobSeekerRegistrationModel.getRoleId(),
				jobSeekerRegistrationModel.getNoticePeriod());

		return ResponseEntity.ok().body(res);
		
	}
}
