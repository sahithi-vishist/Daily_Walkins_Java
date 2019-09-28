package com.example.demo.service;

import com.example.demo.model.JobSeekerRegistrationModel;


public interface JobSeekerRegistrationService {
 public JobSeekerRegistrationModel saveData(JobSeekerRegistrationModel walker);
 public JobSeekerRegistrationModel getById(Integer walkerId);
 public JobSeekerRegistrationModel updateWalker(JobSeekerRegistrationModel walker);

 public int getWalker(String token);
 public String checkByEmail(String email);
 public JobSeekerRegistrationModel findWalkerByEmail(String username);

}
