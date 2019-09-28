package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.RecruiterLoginDetailsModel;

public interface RecruiterLoginDetailsRepository extends JpaRepository<RecruiterLoginDetailsModel, Integer> {

}
