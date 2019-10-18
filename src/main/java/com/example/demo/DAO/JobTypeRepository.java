package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JobTypeModel;

public interface JobTypeRepository extends JpaRepository<JobTypeModel,Integer> {

}
