package com.example.demo.serviceImpl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.FileUploadRepository;
import com.example.demo.model.FileUploadModel;
import com.example.demo.model.InterviewPanelDetailsModel;
import com.example.demo.service.FileUploadService;
import com.example.demo.service.InterviewPanelDetailsService;

@Service
public class FileUploadServiceImpl implements FileUploadService{
	@Autowired
	FileUploadRepository fileUploadRepository;
	

	@Override
	public FileUploadModel saveFile(FileUploadModel fileUploadModel) {
		
		return fileUploadRepository.save(fileUploadModel);
	}


	@Override
	public byte[] getFile(int fileId) {
		
		return null;
	}
}
