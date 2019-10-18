package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.QualificationListModel;



public interface QualificationListRepository extends JpaRepository<QualificationListModel, Integer> {

}
