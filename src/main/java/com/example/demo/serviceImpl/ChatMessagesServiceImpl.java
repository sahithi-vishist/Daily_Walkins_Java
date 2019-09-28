package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ChatMessagesRepository;
import com.example.demo.model.ChatMessagesModel;
import com.example.demo.service.ChatMessagesService;

@Service
public class ChatMessagesServiceImpl implements ChatMessagesService{
	
	@Autowired
	ChatMessagesRepository chatmessagerepository;

	@Override
	public ChatMessagesModel savechatmessages(ChatMessagesModel chatmessagesmodel) {
		
		return chatmessagerepository.save(chatmessagesmodel);
	}

	@Override
	public List<ChatMessagesModel> getchatmessages() {
		
		return chatmessagerepository.findAll();
	}

	
	

	

}
