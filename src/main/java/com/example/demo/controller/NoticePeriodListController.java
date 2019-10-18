package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.NoticePeriodListModel;
import com.example.demo.service.NoticePeriodListService;

@RestController
@CrossOrigin
public class NoticePeriodListController {
@Autowired
NoticePeriodListService noticePeriodListService;

@PostMapping("/postNoticePeriod")
public NoticePeriodListModel postNotice(@RequestBody NoticePeriodListModel noticePeriodListModel)
{
	return noticePeriodListService.saveNotice(noticePeriodListModel);
}

@GetMapping("/getNoticePeriods")
public List<NoticePeriodListModel> getNotice()
{
	return noticePeriodListService.getAllNotice();
}
}
