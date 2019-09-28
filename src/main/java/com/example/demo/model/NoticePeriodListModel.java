package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="notice_period_list")
@Data
public class NoticePeriodListModel {
	@Id
	@Column(name="noticeperiodid")
	private int noticePeriodId ;
	
	@Column(name="noticetext")
	private String noticeText;
	
	@Column(name="noticevalue")
	private String noticeValue;

}
