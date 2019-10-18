package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PostJobsRepository;
import com.example.demo.model.PostJobsModel;
import com.example.demo.service.PostJobsService;

@Service
public class PostJobsServiceImpl implements PostJobsService{

	@Autowired
	PostJobsRepository postJobsRepository;
	

	@Override
	public PostJobsModel postjobs(PostJobsModel postJobsModel) {
		return postJobsRepository.save(postJobsModel);
	}


	@Override
	public List<PostJobsModel> getjobs() {
		return postJobsRepository.findAll();
	}


	@Override
	public PostJobsModel getJobById(Integer id) {
		
		return postJobsRepository.findById(id).get();
	}

	@Override
	public List<PostJobsModel> getByKeySkills(String skills) {
		List<PostJobsModel> res=postJobsRepository.findByKeySkills(skills);
		return res;
	}
	@Override
	public List<PostJobsModel> getJobNo(String email) {
		List<PostJobsModel> res=postJobsRepository.findByEmail(email);
	 return res;
	}


	@Override
	public PostJobsModel updateWalkin(PostJobsModel postJobsModel) {
		
		return postJobsRepository.save(postJobsModel);
	}

}
