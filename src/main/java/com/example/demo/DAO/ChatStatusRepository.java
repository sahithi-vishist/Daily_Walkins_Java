package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ChatStatusModel;

public interface ChatStatusRepository extends JpaRepository<ChatStatusModel, Integer>{

}
