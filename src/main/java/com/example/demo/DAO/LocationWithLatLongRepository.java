package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LocationWithLatLongModel;

public interface LocationWithLatLongRepository extends JpaRepository<LocationWithLatLongModel, Integer> {

}
