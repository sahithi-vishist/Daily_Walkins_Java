package com.example.demo.service;

import java.util.List;

import com.example.demo.model.QualificationListModel;



public interface QualificationListService {
QualificationListModel saveQ(QualificationListModel qualificationListModel);
	
	List<QualificationListModel> getQ();

}
