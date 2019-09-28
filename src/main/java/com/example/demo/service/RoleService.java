package com.example.demo.service;

import java.util.List;

import com.example.demo.model.RoleModel;

public interface RoleService {
	
	public RoleModel insertRole(RoleModel roleModel);
	public RoleModel getById(Integer id);
	public List<RoleModel> getAll();
	

}