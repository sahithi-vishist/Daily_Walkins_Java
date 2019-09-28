package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JsAppliedJobsModel;

public interface JsAppliedJobsRepository extends JpaRepository<JsAppliedJobsModel, Integer> {

}
