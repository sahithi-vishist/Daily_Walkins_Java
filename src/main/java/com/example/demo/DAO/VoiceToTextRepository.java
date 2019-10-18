package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.VoiceToTextModel;

public interface VoiceToTextRepository extends JpaRepository<VoiceToTextModel, Integer> {

}
