package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.RecruiterLoginDetailsModel;
import com.example.demo.service.RecruiterLoginDetailsService;

@RestController
@CrossOrigin
@RequestMapping
public class RecruiterLoginDetailsController {

	@Autowired(required=true)
	RecruiterLoginDetailsService  recruiterLoginDetailsService;
	
	@PostMapping("/RecruiterLoginDetails")
	public RecruiterLoginDetailsModel Test(@RequestBody RecruiterLoginDetailsModel recruiterLoginDetailsModel)
	{
		System.out.println(recruiterLoginDetailsModel.toString());
		return recruiterLoginDetailsService.insertRec(recruiterLoginDetailsModel);
	}
}
