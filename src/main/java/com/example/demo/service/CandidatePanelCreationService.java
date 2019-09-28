package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CandidatePanelCreationModel;


public interface CandidatePanelCreationService {
	 CandidatePanelCreationModel saveC(CandidatePanelCreationModel candidatePanelCreationModel);
		
	 List<CandidatePanelCreationModel> getC();
	 
	 void deleteRec(Integer id);
	 
	 public CandidatePanelCreationModel updateCandidatePanelCreation(CandidatePanelCreationModel candidatePanelCreationModel);
}
