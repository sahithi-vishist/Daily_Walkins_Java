package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PostJobsModel;

public interface PostJobsRepository extends JpaRepository<PostJobsModel, Integer> {
 
	public List<PostJobsModel> findByKeySkills(String keySkills);
	public List<PostJobsModel> findByEmail(String email);
}
