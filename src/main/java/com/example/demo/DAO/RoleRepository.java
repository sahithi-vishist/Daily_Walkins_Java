package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Integer> {

	
}