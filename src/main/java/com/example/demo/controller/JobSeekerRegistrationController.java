package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

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

import com.example.demo.jwt.JwtTokenUtil;
import com.example.demo.model.JobSeekerRegistrationModel;

import com.example.demo.service.JobSeekerRegistrationService;

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
	
	@PostMapping("/register")
	public ResponseEntity<String> save(@RequestBody JobSeekerRegistrationModel jobSeekerRegistrationModel)
	{
		System.out.println(jobSeekerRegistrationModel.getResume());
		jobSeekerRegistrationService.saveData(jobSeekerRegistrationModel);
		
		return ResponseEntity.ok().body("registration successfull");
		
		
	}
	@GetMapping("/getwalkerbyid")
	
	public ResponseEntity<JobSeekerRegistrationModel> getUserById(@RequestParam(name="walkerId") Integer walkerId){
		JobSeekerRegistrationModel walker=jobSeekerRegistrationService.getById(walkerId);
		return ResponseEntity.ok().body(walker);
		
	}
	@PutMapping("/updatewalker")
	public ResponseEntity<JobSeekerRegistrationModel> update(@RequestBody JobSeekerRegistrationModel walker) {
		walker=jobSeekerRegistrationService.updateWalker(walker);
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
   
}
