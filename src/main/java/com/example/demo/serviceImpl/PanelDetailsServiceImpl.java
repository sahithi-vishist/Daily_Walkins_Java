package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PanelDetailsRepository;
import com.example.demo.model.PanelDetailsModel;
import com.example.demo.service.PanelDetailsService;

@Service
public class PanelDetailsServiceImpl implements PanelDetailsService {
	
	@Autowired
	PanelDetailsRepository panelDetailsRepository;

	@Override
	public PanelDetailsModel savepaneldetails(PanelDetailsModel panelDetailsModel) {
		
		return panelDetailsRepository.save(panelDetailsModel);
	}

	@Override
	public List<PanelDetailsModel> getpaneldetails() {
	
		return panelDetailsRepository.findAll();
	}

	@Override
	public PanelDetailsModel updatepaneldetails(PanelDetailsModel panelDetailsModel) {
		
		return panelDetailsRepository.save(panelDetailsModel);
	}

	@Override
	public void deletepaneldetails(Integer id) {
		PanelDetailsModel panelDetailsModel=panelDetailsRepository.findById(id).get();
		if(panelDetailsModel!=null)
		{
		panelDetailsRepository.delete(panelDetailsModel);
		}
	}

	@Override
	public PanelDetailsModel getById(Integer id) {
		return panelDetailsRepository.findById(id).get();
	}

	

}
