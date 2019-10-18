package com.example.demo.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import com.example.demo.model.FileUploadModel;
import com.example.demo.service.FileUploadService;


@RestController
@CrossOrigin
public class FileUploadController {

	@Autowired
	FileUploadService fileUploadService;
	
	@PostMapping ("/uploadfile")
	public FileUploadModel postFile(@RequestParam("fileName") MultipartFile fileName) throws IOException 
	{
		FileUploadModel fileUploadModel = new FileUploadModel();
		
			fileUploadModel.setFileName(fileName.getBytes());
			return  fileUploadService.saveFile(fileUploadModel);
		
		

}
}
