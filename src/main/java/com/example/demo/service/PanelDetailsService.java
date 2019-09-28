package com.example.demo.service;

import java.util.List;

import com.example.demo.model.PanelDetailsModel;


public interface PanelDetailsService {
	
	public PanelDetailsModel savepaneldetails(PanelDetailsModel panelDetailsModel);
	public List<PanelDetailsModel> getpaneldetails();
	public PanelDetailsModel updatepaneldetails(PanelDetailsModel panelDetailsModel);
	public void deletepaneldetails(Integer id);
	public PanelDetailsModel getById(Integer id);

}
