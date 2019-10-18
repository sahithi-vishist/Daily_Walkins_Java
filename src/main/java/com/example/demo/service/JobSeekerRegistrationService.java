package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FacilityRegistrationModel;
import com.example.demo.model.JobSeekerRegistrationModel;


public interface JobSeekerRegistrationService {
 public JobSeekerRegistrationModel saveData(JobSeekerRegistrationModel walker);
 public JobSeekerRegistrationModel getById(Integer walkerId);
 public JobSeekerRegistrationModel updateWalker(JobSeekerRegistrationModel walker);

 public int getWalker(String token);
 public String checkByEmail(String email);
 public JobSeekerRegistrationModel findWalkerByEmail(String username);
 public List<JobSeekerRegistrationModel> getAllWalkers();
 public List<JobSeekerRegistrationModel> getByKeySkills(String skills);
}
