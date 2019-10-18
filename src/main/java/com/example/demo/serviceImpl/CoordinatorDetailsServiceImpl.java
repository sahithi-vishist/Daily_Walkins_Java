package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.CoordinatorDetailsRepository;
import com.example.demo.model.CoordinatorDetailsModel;
import com.example.demo.service.CoordinatorDetailsService;

@Service
public class CoordinatorDetailsServiceImpl implements CoordinatorDetailsService{

	@Autowired
	CoordinatorDetailsRepository coordinatorDetailsRepository;
	
	@Override
	public CoordinatorDetailsModel save(CoordinatorDetailsModel coordinatorDetailsModel) {
		return coordinatorDetailsRepository.save(coordinatorDetailsModel);
		
	}

	@Override
	public List<CoordinatorDetailsModel> getData() {
		return coordinatorDetailsRepository.findAll();
	}

	@Override
	public void deleteCo(int id) {
		coordinatorDetailsRepository.deleteById(id);
		
	}

	@Override
	public CoordinatorDetailsModel getByIdCo(Integer id) {
		return coordinatorDetailsRepository.findById(id).get();
	}

	@Override
	public CoordinatorDetailsModel updateCo(CoordinatorDetailsModel coordinatorDetailsModel) {
		return coordinatorDetailsRepository.save(coordinatorDetailsModel);
	}
	
		
	}

	


