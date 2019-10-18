package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BGCModel;

public interface BGCService 
{
	public BGCModel savebgc(BGCModel bgcModel);
	public List<BGCModel> getBgc ();
	public BGCModel getByIdBgc(Integer id);

}
