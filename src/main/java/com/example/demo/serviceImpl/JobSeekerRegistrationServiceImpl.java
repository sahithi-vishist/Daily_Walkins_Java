package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.JobSeekerRegistrationRepository;
import com.example.demo.jwt.JwtTokenUtil;
import com.example.demo.model.JobSeekerRegistrationModel;

import com.example.demo.service.JobSeekerRegistrationService;

import io.jsonwebtoken.Claims;

@Service
public class JobSeekerRegistrationServiceImpl implements JobSeekerRegistrationService {
	@Autowired
	JobSeekerRegistrationRepository jobSeekerRegistrationRepository;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	

	@Override
	public JobSeekerRegistrationModel saveData(JobSeekerRegistrationModel walker) {
		return jobSeekerRegistrationRepository.save(walker);
	}



	@Override
	public JobSeekerRegistrationModel getById(Integer walkerId) {
		
		return jobSeekerRegistrationRepository.findById(walkerId).get();
	}



	@Override
	public JobSeekerRegistrationModel updateWalker(JobSeekerRegistrationModel walker) {
			
			return jobSeekerRegistrationRepository.save(walker);
		
	}



	

	@Override
	public int getWalker(String email) {
		System.out.println("email is"+email);
		JobSeekerRegistrationModel res = jobSeekerRegistrationRepository.findByEmail(email);
		
		  if(res.getEmail().equals(email)) { return res.getJobSeekerId(); }
		 
		return 0;
	}

	@Override
	public String checkByEmail(String email) {
		
		JobSeekerRegistrationModel res=jobSeekerRegistrationRepository.findByEmail(email);
		if(res==null) {
			return "false";
		}
		if(res.getEmail().equals(email)) {
		return "true";
		}
		return "";
	}



	@Override
	public JobSeekerRegistrationModel findWalkerByEmail(String email) {
		
		JobSeekerRegistrationModel res=jobSeekerRegistrationRepository.findByEmail(email);
		return res;
	}



	@Override
	public List<JobSeekerRegistrationModel> getAllWalkers() {
	
		return jobSeekerRegistrationRepository.findAll();
	}



	@Override
	public List<JobSeekerRegistrationModel> getByKeySkills(String skills) {
		
		return jobSeekerRegistrationRepository.findByKeySkills(skills);
	}

	
}
