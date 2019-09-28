package com.example.demo.service;

import java.util.List;


import com.example.demo.model.PostJobsModel;

public interface PostJobsService 
{
	
	public List<PostJobsModel> getjobs();
	public PostJobsModel postjobs(PostJobsModel postJobsModel);
	public PostJobsModel getJobById(Integer id);
	public List<PostJobsModel> getByKeySkills(String skills);
	public List<PostJobsModel> getJobNo(String email);
}
