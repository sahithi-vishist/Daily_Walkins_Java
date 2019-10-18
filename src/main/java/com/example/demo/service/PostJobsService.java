package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ExperienceModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;

public interface PostJobsService 
{
	
	public List<PostJobsModel> getjobs();
	public PostJobsModel postjobs(PostJobsModel postJobsModel);
	public PostJobsModel getJobById(Integer id);
	public PostJobsModel updateWalkin(PostJobsModel postJobsModel);
	public List<PostJobsModel> getByKeySkills(String skills);
	public List<PostJobsModel> getJobNo(String email);
	public List<PostJobsModel> getJobsByLocation(String location);
	public List<PostJobsModel> getJobsByEducation(QualificationListModel education);
	public List<PostJobsModel> getJobsByminExp(ExperienceModel minExp);
	public List<PostJobsModel> getJobsBymaxExp(ExperienceModel maxExp);
	public List<PostJobsModel> getJobsByIndustry(IndustriesModel industry);
	public List<PostJobsModel> getJobsByRole(RoleModel role);
	public List<PostJobsModel> getJobsByJobType(JobTypeModel jobType);
}
