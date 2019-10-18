package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.BGCRepository;
import com.example.demo.model.BGCModel;
import com.example.demo.service.BGCService;
@Service
public class BGCServiceImpl implements BGCService {

	@Autowired
	BGCRepository bGCRepository;
	
	@Override
	public BGCModel savebgc(BGCModel bgcModel) {
		return bGCRepository.save(bgcModel);
	}

	@Override
	public List<BGCModel> getBgc() {
		return bGCRepository.findAll();
	}

	@Override
	public BGCModel getByIdBgc(Integer id) {
		return bGCRepository.findById(id).get();
	}

}
