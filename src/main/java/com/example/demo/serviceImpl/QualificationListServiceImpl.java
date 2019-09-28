package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.QualificationListRepository;

import com.example.demo.model.QualificationListModel;

import com.example.demo.service.QualificationListService;

@Service
public class QualificationListServiceImpl implements QualificationListService {

	@Autowired
	QualificationListRepository qualificationListRepository;

	@Override
	public QualificationListModel saveQ(QualificationListModel qualificationListModel) {
		return qualificationListRepository.save(qualificationListModel);
	}

	@Override
	public List<QualificationListModel> getQ() {
		System.out.println(qualificationListRepository.findAll());
		return qualificationListRepository.findAll();
	}
	
	
}
