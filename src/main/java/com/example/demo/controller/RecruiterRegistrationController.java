package com.example.demo.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jwt.JwtTokenUtil;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.RecruiterRegistrationModel;

import com.example.demo.service.RecruiterRegistrationService;

@RestController
@CrossOrigin
public class RecruiterRegistrationController {

	@Autowired
	RecruiterRegistrationService recruiterRegistrationService;
	

	@Value("${jwt.http.request.header}")
	private String tokenHeader;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@PostMapping("/saveRecruiterRegistration")
	public RecruiterRegistrationModel saveAll(@RequestBody RecruiterRegistrationModel recruiterRegistrationModel) {
		return recruiterRegistrationService.saveAll(recruiterRegistrationModel);
	}
	@GetMapping("/getRecruiters")
	public List<RecruiterRegistrationModel> getall()
	{
		return recruiterRegistrationService.getAll();
	}
	
	@PutMapping("/updateRecruiterRegistration")
	public ResponseEntity<RecruiterRegistrationModel> updateRegistration(@RequestBody RecruiterRegistrationModel recruiterRegistrationModel) {
		recruiterRegistrationModel = recruiterRegistrationService.updateRegistration(recruiterRegistrationModel);
		return ResponseEntity.ok().body(recruiterRegistrationModel);
	}
	@PostMapping("/loginCheck")
	public ResponseEntity<Integer> getRecruiter(@RequestBody RecruiterRegistrationModel recruiterRegistrationModel) {
		int res= recruiterRegistrationService.getRecruiter(recruiterRegistrationModel.getEmail(),recruiterRegistrationModel.getPassword());
		return ResponseEntity.ok().body(res);
	}
	@GetMapping("/getRecruiterById")
	public ResponseEntity<RecruiterRegistrationModel> getById(@RequestParam(name="recruiterId") Integer recruiterId) {
		RecruiterRegistrationModel recruiterRegistrationModel = recruiterRegistrationService.getById(recruiterId);
		return ResponseEntity.ok().body(recruiterRegistrationModel);
	}
//	@GetMapping("/getRecruiterId")
//	   
//	   public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request) {
//			String authToken = request.getHeader(tokenHeader);
//			
//			final String token = authToken.substring(7);
//			String username = jwtTokenUtil.getUsernameFromToken(token);
//			int res=recruiterRegistrationService.getrecruiter(username);
//			return ResponseEntity.ok().body(res);
//				
//		}
	@PostMapping("/getRecruiterByEmail")
	   public ResponseEntity<RecruiterRegistrationModel> getRecruiterByEmail(@RequestBody RecruiterRegistrationModel recruiter){
		   RecruiterRegistrationModel res=recruiterRegistrationService.findRecruiterByEmail(recruiter.getEmail());
			System.out.println(res);
		   return ResponseEntity.ok().body(res);
			
			
		}
	
}



