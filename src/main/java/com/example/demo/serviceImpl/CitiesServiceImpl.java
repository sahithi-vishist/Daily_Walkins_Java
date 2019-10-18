package com.example.demo.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.CitiesRepository;
import com.example.demo.model.CitiesModel;
import com.example.demo.service.CitiesService;

@Service
@Transactional
public class CitiesServiceImpl implements CitiesService
{

	@Autowired
	CitiesRepository citiesRepository;

	@Override
	public CitiesModel insertRec(CitiesModel citiesModel) {
		CitiesModel res=citiesRepository.save(citiesModel);
		return res;
	}

	@Override
	public CitiesModel update(CitiesModel citiesModel) {
		CitiesModel res = citiesModelId(citiesModel.getCityId());
		res =citiesRepository.save(res);
		return res;
	}
	
	public CitiesModel citiesModelId(int id)
	{
		CitiesModel res = null;
		res =citiesRepository.findById(id).get();
		return res;
	}
}
