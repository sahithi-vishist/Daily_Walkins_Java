package com.example.demo.service;

import java.util.List;

import com.example.demo.model.IndustriesModel;


public interface IndustriesService {

public IndustriesModel saveIndustries(IndustriesModel industriesModel);
public List<IndustriesModel> getIndustries();
public IndustriesModel getById(Integer inId);	
}