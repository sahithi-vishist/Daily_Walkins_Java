package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.LoginDetailsRepository;
import com.example.demo.model.LoginDetailsModel;
import com.example.demo.service.LoginDetailsService;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService{
@Autowired
LoginDetailsRepository loginDetailsRepository;
	
	@Override
	public List<LoginDetailsModel> getByRole(int role) {
		
		return loginDetailsRepository.findByRole(role) ;
	}

	@Override
	public LoginDetailsModel saveLoginData(LoginDetailsModel loginDetailsModel) {
		
		return loginDetailsRepository.save(loginDetailsModel);
	}

}
