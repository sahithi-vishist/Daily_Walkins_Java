package com.example.demo.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.RecruiterPrivacySettingsRepository;
import com.example.demo.model.RecruiterPrivacySettingsModel;
import com.example.demo.service.RecruiterPrivacySettingsService;


@Service
@Transactional
public  class RecruiterPrivacySettingsServiceImpl  implements RecruiterPrivacySettingsService{

	@Autowired
	RecruiterPrivacySettingsRepository recruiterSettingsRepository;
	

	@Override
	public RecruiterPrivacySettingsModel update(RecruiterPrivacySettingsModel RPSId) {

		RecruiterPrivacySettingsModel res =recruiterSettingsRepository.save(RPSId);
		return res;
	
	}

	@Override
	public RecruiterPrivacySettingsModel insertRec(RecruiterPrivacySettingsModel rec) {
		RecruiterPrivacySettingsModel res=recruiterSettingsRepository.save(rec);
		return res;
	}


	public RecruiterPrivacySettingsModel getRecruiterSettingsId(int id)
	{
		RecruiterPrivacySettingsModel res = null;

	
		res =recruiterSettingsRepository.findById(id).get();
			return res;
	
	
		
	}
	


	
	
}
