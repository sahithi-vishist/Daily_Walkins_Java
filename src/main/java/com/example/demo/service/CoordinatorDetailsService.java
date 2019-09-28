package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CoordinatorDetailsModel;

public interface CoordinatorDetailsService {

	
	 CoordinatorDetailsModel save(CoordinatorDetailsModel coordinatorDetailsModel);
	
	List<CoordinatorDetailsModel> getData();

	void  deleteCo(int id);
	
	public CoordinatorDetailsModel getByIdCo(Integer id);
	
	public CoordinatorDetailsModel updateCo(CoordinatorDetailsModel coordinatorDetailsModel);
	
}
