package com.example.demo.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.RecruiterLoginDetailsRepository;
import com.example.demo.model.RecruiterLoginDetailsModel;
import com.example.demo.service.RecruiterLoginDetailsService;

@Service
@Transactional
public class RecruiterLoginDetailsServiceImpl implements RecruiterLoginDetailsService {
	

	@Autowired
	RecruiterLoginDetailsRepository recruiterLoginDetailsRepository;


	@Override
	public RecruiterLoginDetailsModel insertRec(RecruiterLoginDetailsModel recruiterLoginDetailsModel) {
		RecruiterLoginDetailsModel res=recruiterLoginDetailsRepository.save(recruiterLoginDetailsModel);
		return res;
	}

	@Override
	public RecruiterLoginDetailsModel update(RecruiterLoginDetailsModel recruiterLoginDetailsModel) {
		RecruiterLoginDetailsModel res = recruiterLoginDetailsModelId(recruiterLoginDetailsModel.getRecruiterID());
		res =recruiterLoginDetailsRepository.save(res);
		return res;
	}

	public RecruiterLoginDetailsModel recruiterLoginDetailsModelId(int id)
	{
		RecruiterLoginDetailsModel res = null;
		res =recruiterLoginDetailsRepository.findById(id).get();
		return res;
	}
}
