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
private int gotJobNo;
private String gotEmail;

	@Override
	public JsAppliedJobsModel postjobs(JsAppliedJobsModel jsAppliedJobsModel) {
		return jsAppliedJobsRepository.save(jsAppliedJobsModel);
	}

	@Override
	public List<JsAppliedJobsModel> getjobs(String wEmail) {
		
		return jsAppliedJobsRepository.findByJobSeekerEmailId(wEmail);
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
		
		List<JsAppliedJobsModel> emailExists=jsAppliedJobsRepository.findByJobSeekerEmailId(email);
		
	
		List<JsAppliedJobsModel> jobNoExists=jsAppliedJobsRepository.findByJobNo(jobNo);
		
		
		for (JsAppliedJobsModel jsAppliedJobsModel1 : jobNoExists) {
			gotJobNo=jsAppliedJobsModel1.getJobNo().getJobNo();
		}
		for (JsAppliedJobsModel jsAppliedJobsModel2 : emailExists ) {
			gotEmail=jsAppliedJobsModel2.getJobSeekerEmailId();
		}
		System.out.println(gotJobNo);
		System.out.println(gotEmail);
				if(jobNoExists==null || emailExists==null){
					
					return false;
				}
				else {
								
							if(gotJobNo==jobNo.getJobNo()&& gotEmail.equals(email)){
								return true;
							}
							else {
								return false;
							}		
					
				}
		
	}

}
