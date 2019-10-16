package com.example.demo.serviceImpl;

import java.util.List;

import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.JsAppliedJobsRepository;
import com.example.demo.model.JsAppliedJobsModel;
import com.example.demo.model.PostJobsModel;
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

	@Override
	public Boolean getStatus(PostJobsModel jobNo, String email) {
		
		JsAppliedJobsModel emailExists=jsAppliedJobsRepository.findByJobSeekerEmailId(email);
		System.out.println(emailExists);
	
		JsAppliedJobsModel jobNoExists=jsAppliedJobsRepository.findByJobNo(jobNo);
		System.out.println(jobNoExists);
		
				
				if(jobNoExists==null || emailExists==null){
					
					return false;
				}
				else {
					
					
					if(jobNoExists.getJobNo().getJobNo()==jobNo.getJobNo()&&emailExists.getJobSeekerEmailId().equals(email)){
						return true;
					}
					else {
						return false;
					}
				}
				
				
		
	}

}
