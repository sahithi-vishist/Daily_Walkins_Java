package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SentSmsDetailsModel;

public interface SentSmsDetailsRepository extends JpaRepository<SentSmsDetailsModel, Integer>{

}
