package com.example.demo.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.CompanyNameRepository;
import com.example.demo.model.CompanyNameModel;
import com.example.demo.service.CompanyNameService;

@Service
@Transactional
public class CompanyNameServiceImpl implements CompanyNameService
{

	@Autowired
	CompanyNameRepository companyNameRepository;
	
	@Override
	public CompanyNameModel insertRec(CompanyNameModel companyNameModel) {
		CompanyNameModel res=companyNameRepository.save(companyNameModel);
		return res;
	}

	@Override
	public CompanyNameModel update(CompanyNameModel companyNameModel) {
		CompanyNameModel res = companyNameModelId(companyNameModel.getCompanyId());
		res =companyNameRepository.save(res);
		return res;
	}
	
	public CompanyNameModel companyNameModelId(int id)
	{
		CompanyNameModel res = null;
		res =companyNameRepository.findById(id).get();
		return res;
	}
	
	public List<CompanyNameModel> findAllDistributors() {
		return companyNameRepository.findAll();
	}
	
	
}
