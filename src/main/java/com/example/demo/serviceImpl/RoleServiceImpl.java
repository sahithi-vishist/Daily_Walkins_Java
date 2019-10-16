package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.RoleRepository;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.RoleModel;
import com.example.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public RoleModel insertRole(RoleModel roleModel) {
		return roleRepository.save(roleModel);
	}

	@Override
	public RoleModel getById(Integer id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public List<RoleModel> getAll() {
		
		return roleRepository.findAll();
	}

	@Override
	public List<RoleModel> getRolesByIndId(IndustriesModel indId) {
	
		return roleRepository.findByIndustryId(indId);
	}


}