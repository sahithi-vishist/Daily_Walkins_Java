package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.NoticePeriodListRepository;
import com.example.demo.model.NoticePeriodListModel;
import com.example.demo.service.NoticePeriodListService;
@Service
public class NoticePeriodListServiceImpl implements NoticePeriodListService{

	@Autowired
	NoticePeriodListRepository noticePeriodListRepository;
	@Override
	public NoticePeriodListModel saveNotice(NoticePeriodListModel noticePeriodListModel) {
		return noticePeriodListRepository.save(noticePeriodListModel);
	}

	@Override
	public List<NoticePeriodListModel> getAllNotice() {
		return noticePeriodListRepository.findAll();
	}

}
