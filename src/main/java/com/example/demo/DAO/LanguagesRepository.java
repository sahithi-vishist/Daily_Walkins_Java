package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LanguagesModel;

public interface LanguagesRepository extends JpaRepository<LanguagesModel, Integer> {

}
