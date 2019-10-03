package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.CandidatePanelCreationRepository;
import com.example.demo.model.CandidatePanelCreationModel;
import com.example.demo.service.CandidatePanelCreationService;

@Service
public class CandidatePanelCreationServiceImpl implements CandidatePanelCreationService{
	
	@Autowired
	CandidatePanelCreationRepository candidatePanelCreationRepository;

	@Override
	public CandidatePanelCreationModel saveC(CandidatePanelCreationModel candidatePanelCreationModel) {
		return candidatePanelCreationRepository.save(candidatePanelCreationModel);
	}

	@Override
	public List<CandidatePanelCreationModel> getC() {
		return candidatePanelCreationRepository.findAll();
	}

	@Override
	public void deleteRec(Integer id) {
     candidatePanelCreationRepository.deleteById(id);		
	}

	@Override
	public CandidatePanelCreationModel updateCandidatePanelCreation(
			CandidatePanelCreationModel candidatePanelCreationModel) {
		return candidatePanelCreationRepository.save(candidatePanelCreationModel);
	}

	

}
