package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoginDetailsModel;

public interface LoginDetailsRepository extends JpaRepository<LoginDetailsModel, Integer>{

	public List<LoginDetailsModel> findByRole(int role);
}
