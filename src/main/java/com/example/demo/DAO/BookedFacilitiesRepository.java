package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BookedFacilitiesModel;

public interface BookedFacilitiesRepository extends JpaRepository<BookedFacilitiesModel, Integer> {

}
