package com.example.demo.service;

import com.example.demo.model.FileUploadModel;


public interface FileUploadService {
	public FileUploadModel saveFile(FileUploadModel fileUploadModel);
	
	public byte[] getFile(int fileId);
}
