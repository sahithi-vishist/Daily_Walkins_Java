package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.IndustriesModel;
import com.example.demo.model.RoleModel;


public interface RoleRepository extends JpaRepository<RoleModel, Integer> {

	 public List<RoleModel> findByIndustryId(IndustriesModel industryId);
}