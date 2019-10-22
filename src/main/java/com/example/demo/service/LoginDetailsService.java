package com.example.demo.service;

import java.util.List;

import com.example.demo.model.LoginDetailsModel;

public interface LoginDetailsService {

	public List<LoginDetailsModel> getByRole(int role);
	public LoginDetailsModel saveLoginData(LoginDetailsModel loginDetailsModel);
}
