package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ChatStatusModel;
import com.example.demo.service.ChatStatusService;

@RestController
public class ChatStatusController {
@Autowired
ChatStatusService chatStatusService;

@PostMapping("/postchat")
public ChatStatusModel postChat(@RequestBody ChatStatusModel chatStatusModel)
{
	return chatStatusService.saveChat(chatStatusModel);
	
}

@GetMapping("/getchat")
public List<ChatStatusModel> getChat()
{
	return chatStatusService.getChat();	
}
}
