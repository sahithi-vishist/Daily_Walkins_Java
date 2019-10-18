package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ChatMessagesModel;

public interface ChatMessagesService {
	
	public ChatMessagesModel savechatmessages(ChatMessagesModel chatmessagesmodel);
	public List<ChatMessagesModel> getchatmessages();

}
