package com.example.demo.service;

import java.util.List;

import com.example.demo.model.JsAppliedJobsModel;
import com.example.demo.model.PostJobsModel;

public interface JsAppliedJobsService {
	
	public JsAppliedJobsModel postjobs(JsAppliedJobsModel jsAppliedJobsModel);
	public List<JsAppliedJobsModel> getjobs(String wEmail);
	public JsAppliedJobsModel getById(Integer id);
	public JsAppliedJobsModel updatejobs(JsAppliedJobsModel jsAppliedJobsModel);
	public Boolean getStatus(PostJobsModel jobNo,String email);

}
