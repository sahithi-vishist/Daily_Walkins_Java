package com.example.demo.service;

import java.util.List;

import com.example.demo.model.NoticePeriodListModel;

public interface NoticePeriodListService {
	
	public NoticePeriodListModel saveNotice(NoticePeriodListModel noticePeriodListModel);
	public List<NoticePeriodListModel> getAllNotice();

}
