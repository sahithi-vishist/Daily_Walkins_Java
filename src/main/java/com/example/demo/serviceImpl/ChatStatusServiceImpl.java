package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ChatStatusRepository;
import com.example.demo.model.ChatStatusModel;
import com.example.demo.service.ChatStatusService;
@Service
public class ChatStatusServiceImpl implements ChatStatusService{
@Autowired
ChatStatusRepository chatStatusRepository;

	@Override
	public ChatStatusModel saveChat(ChatStatusModel chatStatusModel) {
		return chatStatusRepository.save(chatStatusModel);
		
	}

	@Override
	public List<ChatStatusModel> getChat() {
		return chatStatusRepository.findAll();
	}

}
