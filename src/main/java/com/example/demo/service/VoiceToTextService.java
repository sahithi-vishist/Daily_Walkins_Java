package com.example.demo.service;

import java.util.List;

import com.example.demo.model.VoiceToTextModel;


public interface VoiceToTextService {
VoiceToTextModel saveV(VoiceToTextModel voiceToTextModel);
	
	List<VoiceToTextModel> getV();
	
}