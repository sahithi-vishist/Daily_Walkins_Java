package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.QualificationListModel;
import com.example.demo.service.QualificationListService;


@RestController
@CrossOrigin
public class QualificationListController {
	
	@Autowired
	QualificationListService qualificationListService;
	
	@PostMapping("/Qualification")
	public QualificationListModel saveG(@RequestBody QualificationListModel qualificationListModel) {
		return qualificationListService.saveQ(qualificationListModel);
	
	}
	
	@GetMapping("/getQualifications")
	public List<QualificationListModel> getG() {
		
		return qualificationListService.getQ();
	
		
	}

}
