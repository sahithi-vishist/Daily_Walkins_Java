package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ChatStatusModel;

public interface ChatStatusService {

	public ChatStatusModel saveChat(ChatStatusModel chatStatusModel);
	
	public List<ChatStatusModel> getChat();
}
