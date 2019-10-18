package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity(name="file_upload")
public class FileUploadModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fileid")
	private Integer FileId;
	
	@Lob
	@Column(name="filename")
	private byte[] fileName;
	
	
}
