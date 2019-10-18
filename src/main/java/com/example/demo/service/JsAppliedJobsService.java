package com.example.demo.service;

import java.util.List;

import com.example.demo.model.JsAppliedJobsModel;

public interface JsAppliedJobsService {
	
	public JsAppliedJobsModel postjobs(JsAppliedJobsModel jsAppliedJobsModel);
	public List<JsAppliedJobsModel> getjobs();
	public JsAppliedJobsModel getById(Integer id);
	public JsAppliedJobsModel updatejobs(JsAppliedJobsModel jsAppliedJobsModel);


}
