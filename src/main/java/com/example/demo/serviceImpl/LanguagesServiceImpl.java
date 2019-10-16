package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.LanguagesRepository;
import com.example.demo.model.LanguagesModel;
import com.example.demo.service.LanguagesService;


@Service
public class LanguagesServiceImpl implements LanguagesService{
	
	@Autowired
	LanguagesRepository languagesrepository;

	@Override
	public LanguagesModel saveUser(LanguagesModel languagesModel) {
		
		return languagesrepository.save(languagesModel);
	}

	@Override
	public List<LanguagesModel> getAll() {
		return languagesrepository.findAll();
		
	}

	
}


