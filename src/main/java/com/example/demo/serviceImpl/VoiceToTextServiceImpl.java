package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.VoiceToTextRepository;
import com.example.demo.model.VoiceToTextModel;
import com.example.demo.service.VoiceToTextService;

@Service
public class VoiceToTextServiceImpl implements VoiceToTextService {
	
	@Autowired
	VoiceToTextRepository voiceToTextRepository;

	@Override
	public VoiceToTextModel saveV(VoiceToTextModel voiceToTextModel) {
		return voiceToTextRepository.save(voiceToTextModel);
	}

	@Override
	public List<VoiceToTextModel> getV() {
		return voiceToTextRepository.findAll();
	}

	

	
}
