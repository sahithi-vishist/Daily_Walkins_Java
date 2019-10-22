package com.example.demo.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.jwt.JwtTokenUtil;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.RecruiterRegistrationModel;

import com.example.demo.service.RecruiterRegistrationService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public RecruiterRegistrationModel saveAll(@RequestParam("recDetails") String recDetails,
			@RequestParam("companyLogo") MultipartFile companyLogo) throws IOException {
		
		RecruiterRegistrationModel recruiterRegistrationModel=new RecruiterRegistrationModel();
		recruiterRegistrationModel = new ObjectMapper().readValue(recDetails,RecruiterRegistrationModel.class);
		recruiterRegistrationModel.setCompanyLogo(companyLogo.getBytes());
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
	
	@PostMapping("/getRecruiterByEmail")
	   public ResponseEntity<RecruiterRegistrationModel> getRecruiterByEmail(@RequestBody RecruiterRegistrationModel recruiter){
		   RecruiterRegistrationModel res=recruiterRegistrationService.findRecruiterByEmail(recruiter.getEmail());
			System.out.println(res);
		   return ResponseEntity.ok().body(res);
			
			
		}
	
}



