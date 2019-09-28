package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProfileRatingModel;

public interface ProfileRatingRepository extends JpaRepository<ProfileRatingModel, Integer>{

}
