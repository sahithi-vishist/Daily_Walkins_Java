package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ChatMessagesModel;

public interface ChatMessagesRepository extends JpaRepository< ChatMessagesModel, Integer>{

}
