package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.JsAppliedJobsModel;
import com.example.demo.model.PostJobsModel;

public interface JsAppliedJobsRepository extends JpaRepository<JsAppliedJobsModel, Integer> {

	public List<JsAppliedJobsModel> findByJobSeekerEmailId(String email);
	public List<JsAppliedJobsModel> findByJobNo(PostJobsModel jobNo);
	
}
