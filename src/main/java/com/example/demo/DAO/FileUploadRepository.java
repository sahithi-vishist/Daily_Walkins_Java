package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FileUploadModel;


public interface FileUploadRepository  extends JpaRepository<FileUploadModel, Integer>{

	

}
