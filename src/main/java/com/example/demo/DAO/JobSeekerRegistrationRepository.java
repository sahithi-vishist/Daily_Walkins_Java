package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ExperienceModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.NoticePeriodListModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;



public interface JobSeekerRegistrationRepository extends JpaRepository<JobSeekerRegistrationModel, Integer>{

	  
	  
	  //@Query("SELECT j FROM JobSeekerRegistrationModel j WHERE j.email = 'abc@gmail.com'")
	 
	  //List<JobSeekerRegistrationModel> findByEmail();
	
	  public JobSeekerRegistrationModel findByEmail(String email);
	public List<JobSeekerRegistrationModel> findByKeySkills(String skills);
//	public List<JobSeekerRegistrationModel> findByExpMin(ExperienceModel expMin);
public List<JobSeekerRegistrationModel> findByExperience(String experience);
	//public List<JobSeekerRegistrationModel> findByLocation(String location);
	public List<JobSeekerRegistrationModel> findByIndustryId(IndustriesModel industryId);
	public List<JobSeekerRegistrationModel> findByRoleId(RoleModel roleId);
	public List<JobSeekerRegistrationModel> findByNoticePeriod(NoticePeriodListModel noticePeriodId);
	public List<JobSeekerRegistrationModel> findByEducation(QualificationListModel qualificationId);
	  
}
