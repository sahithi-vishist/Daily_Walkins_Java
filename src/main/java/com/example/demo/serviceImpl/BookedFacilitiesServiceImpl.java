package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.BookedFacilitiesRepository;
import com.example.demo.model.BookedFacilitiesModel;
import com.example.demo.service.BookedFacilitiesService;


@Service
public class BookedFacilitiesServiceImpl implements BookedFacilitiesService{
	
	@Autowired
	BookedFacilitiesRepository bookedfacilitiesrepository;

	@Override
	public BookedFacilitiesModel savebookedfacility(BookedFacilitiesModel bookedFacilitiesModel) {
		return bookedfacilitiesrepository.save(bookedFacilitiesModel);
	}

	@Override
	public List<BookedFacilitiesModel> getbookedfacility() {
		return bookedfacilitiesrepository.findAll();
	}

	@Override
	public BookedFacilitiesModel updatebookedfacility(BookedFacilitiesModel bookedFacilitiesModel) {
		return bookedfacilitiesrepository.save(bookedFacilitiesModel);
	}

	@Override
	public void deletebookedfacility(Integer id) {
		BookedFacilitiesModel bookedFacilitiesModel=bookedfacilitiesrepository.findById(id).get();
		if(bookedFacilitiesModel!=null)
		{
		bookedfacilitiesrepository.delete(bookedFacilitiesModel);
		}
	}

	@Override
	public BookedFacilitiesModel getById(Integer id) {
		return bookedfacilitiesrepository.findById(id).get();
	}


}
