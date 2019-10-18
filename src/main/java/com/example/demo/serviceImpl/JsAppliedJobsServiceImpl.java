package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.JsAppliedJobsRepository;
import com.example.demo.model.JsAppliedJobsModel;
import com.example.demo.service.JsAppliedJobsService;
@Service
public class JsAppliedJobsServiceImpl implements JsAppliedJobsService {
	
@Autowired
JsAppliedJobsRepository jsAppliedJobsRepository;

	@Override
	public JsAppliedJobsModel postjobs(JsAppliedJobsModel jsAppliedJobsModel) {
		return jsAppliedJobsRepository.save(jsAppliedJobsModel);
	}

	@Override
	public List<JsAppliedJobsModel> getjobs() {
		return jsAppliedJobsRepository.findAll();
	}

	@Override
	public JsAppliedJobsModel getById(Integer id) {
		return jsAppliedJobsRepository.findById(id).get();
	}

	@Override
	public JsAppliedJobsModel updatejobs(JsAppliedJobsModel jsAppliedJobsModel) {
		return jsAppliedJobsRepository.save(jsAppliedJobsModel);
	}

}
