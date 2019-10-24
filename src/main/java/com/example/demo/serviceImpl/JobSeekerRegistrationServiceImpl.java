package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.JobSeekerRegistrationRepository;
import com.example.demo.jwt.JwtTokenUtil;
import com.example.demo.model.JobSeekerRegistrationModel;

import com.example.demo.model.ExperienceModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.LocationWithLatLongModel;
import com.example.demo.model.LocationsFormsModel;
import com.example.demo.model.NoticePeriodListModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;
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
		
		return jobSeekerRegistrationRepository.findByKeySkillsContains(skills);
	}

	@Override
	public List<JobSeekerRegistrationModel> getwalkerByEducation(QualificationListModel education) {
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationRepository.findByEducation(education);
		return res;
	}
	@Override
	public List<JobSeekerRegistrationModel> getwalkerByIndustry(IndustriesModel industry) {
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationRepository.findByIndustryId(industry);
		return res;
	}
	@Override
	public List<JobSeekerRegistrationModel> getwalkerByRole(RoleModel role) {
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationRepository.findByRoleId(role);
		return res;
	}
	@Override
	public List<JobSeekerRegistrationModel> getwalkerByNoticePeriod(NoticePeriodListModel noticePeriod) {
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationRepository.findByNoticePeriod(noticePeriod);
		return res;
	}
	@Override
	public List<JobSeekerRegistrationModel> getwalkerByLocation(LocationsFormsModel city) {
	
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationRepository.findByLocation(city);
		return res;
	}
	@Override
	public List<JobSeekerRegistrationModel> getwalkerByPrefLocation(String preferredLocation) {
		List<JobSeekerRegistrationModel> res=jobSeekerRegistrationRepository.findByPreferredLocationContains(preferredLocation);
		return res;
	}
	@Override
	public List<JobSeekerRegistrationModel> getBetweenExp(float minExp,float maxExp) {
		
		return jobSeekerRegistrationRepository.findBetweenExp(minExp,maxExp);
	}
	@Override
	public List<JobSeekerRegistrationModel> getwalkerByAll(String keySkills, LocationsFormsModel city,
			String preferredLocation, QualificationListModel qualification,
			IndustriesModel industryId, RoleModel roleId, NoticePeriodListModel noticePeriodId) {
		
		return jobSeekerRegistrationRepository.findBySearch(keySkills,city,preferredLocation,qualification,industryId,roleId,noticePeriodId);
	}
	
}
