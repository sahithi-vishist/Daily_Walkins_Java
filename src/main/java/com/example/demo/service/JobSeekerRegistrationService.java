package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ExperienceModel;
import com.example.demo.model.FacilityRegistrationModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.LocationWithLatLongModel;
import com.example.demo.model.LocationsFormsModel;
import com.example.demo.model.NoticePeriodListModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;


public interface JobSeekerRegistrationService {
 public JobSeekerRegistrationModel saveData(JobSeekerRegistrationModel walker);
 public JobSeekerRegistrationModel getById(Integer walkerId);
 public JobSeekerRegistrationModel updateWalker(JobSeekerRegistrationModel walker);

 public int getWalker(String token);
 public String checkByEmail(String email);
 public JobSeekerRegistrationModel findWalkerByEmail(String username);
 public List<JobSeekerRegistrationModel> getAllWalkers();
 public List<JobSeekerRegistrationModel> getByKeySkills(String skills);
	public List<JobSeekerRegistrationModel> getwalkerByLocation(LocationsFormsModel city);
	public List<JobSeekerRegistrationModel> getwalkerByPrefLocation(String preferredLocation);
	public List<JobSeekerRegistrationModel> getwalkerByEducation(QualificationListModel education);
	
	 public List<JobSeekerRegistrationModel> getBetweenExp(float minExp,float maxExp);
	public List<JobSeekerRegistrationModel> getwalkerByIndustry(IndustriesModel industry);
	public List<JobSeekerRegistrationModel> getwalkerByRole(RoleModel role);
	public List<JobSeekerRegistrationModel> getwalkerByNoticePeriod(NoticePeriodListModel noticePeriod);
	public List<JobSeekerRegistrationModel> getwalkerByAll(String keySkills,LocationsFormsModel city,String preferredLocation,QualificationListModel qualification,IndustriesModel industryId,RoleModel roleId,NoticePeriodListModel noticePeriodId);
}
