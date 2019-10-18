package com.example.demo.service;

import java.util.List;

import com.example.demo.model.JobTypeModel;

public interface JobTypeService {

	public JobTypeModel saveJobType(JobTypeModel jobType);
	public List<JobTypeModel> getAll();
}
