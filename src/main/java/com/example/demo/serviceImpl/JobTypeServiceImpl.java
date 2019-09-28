package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.JobTypeRepository;
import com.example.demo.model.JobTypeModel;
import com.example.demo.service.JobTypeService;

@Service
public class JobTypeServiceImpl implements JobTypeService{
	@Autowired
	JobTypeRepository jobTypeRepository;

		@Override
		public JobTypeModel saveJobType(JobTypeModel jobType) {
			
			return jobTypeRepository.save(jobType);
		}

		@Override
		public List<JobTypeModel> getAll() {
			
			return jobTypeRepository.findAll();
		}
}
