package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BookedFacilitiesModel;

public interface BookedFacilitiesService {
	
	
	public BookedFacilitiesModel savebookedfacility(BookedFacilitiesModel bookedFacilitiesModel);
	public List<BookedFacilitiesModel> getbookedfacility();
	public BookedFacilitiesModel updatebookedfacility(BookedFacilitiesModel bookedFacilitiesModel);
	public void deletebookedfacility(Integer id);
	public BookedFacilitiesModel getById(Integer id);

}


