package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.JsAppliedJobsModel;
import com.example.demo.model.PostJobsModel;

public interface JsAppliedJobsRepository extends JpaRepository<JsAppliedJobsModel, Integer> {

	public JsAppliedJobsModel findByJobSeekerEmailId(String email);
	public JsAppliedJobsModel findByJobNo(PostJobsModel jobNo);
}
