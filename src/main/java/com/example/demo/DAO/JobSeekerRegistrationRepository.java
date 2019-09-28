package com.example.demo.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.JobSeekerRegistrationModel;

public interface JobSeekerRegistrationRepository extends JpaRepository<JobSeekerRegistrationModel, Integer>{

	  
	  
	  //@Query("SELECT j FROM JobSeekerRegistrationModel j WHERE j.email = 'abc@gmail.com'")
	 
	  //List<JobSeekerRegistrationModel> findByEmail();
	
	  public JobSeekerRegistrationModel findByEmail(String email);
	
	  
}
