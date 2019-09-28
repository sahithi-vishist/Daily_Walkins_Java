package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ChatMessagesModel;
import com.example.demo.service.ChatMessagesService;

@RestController
public class ChatMessagesController {
	
@Autowired
ChatMessagesService chatmessagesservice;

	
	@GetMapping("/getchatmessages")
	public List<ChatMessagesModel> getchatmessages() {
		return chatmessagesservice.getchatmessages();
	}
	
	
	@PostMapping("/postchatmessages")
	public ChatMessagesModel savechatmessages(@RequestBody ChatMessagesModel chatmessagesmodel)
   {
	return chatmessagesservice.savechatmessages(chatmessagesmodel);
   }
}
