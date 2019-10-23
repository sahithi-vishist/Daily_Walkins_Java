package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ExperienceModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.LocationWithLatLongModel;
import com.example.demo.model.LocationsFormsModel;
import com.example.demo.model.NoticePeriodListModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;



public interface JobSeekerRegistrationRepository extends JpaRepository<JobSeekerRegistrationModel, Integer>{

	  
	  
	  //@Query("SELECT j FROM JobSeekerRegistrationModel j WHERE j.email = 'abc@gmail.com'")
	 
	  //List<JobSeekerRegistrationModel> findByEmail();
	
	  public JobSeekerRegistrationModel findByEmail(String email);
	public List<JobSeekerRegistrationModel> findByKeySkillsContains(String skills);
//	public List<JobSeekerRegistrationModel> findByExpMin(ExperienceModel expMin);
	@Query("select s from jobseeker_registration s where s.experience>:minExp and s.experience<:maxExp")
	public List<JobSeekerRegistrationModel> findBetweenExp(@Param("minExp")float experience,@Param("maxExp")float experience1);
	public List<JobSeekerRegistrationModel> findByLocation(LocationsFormsModel city);
	public List<JobSeekerRegistrationModel> findByPreferredLocationContains(String preferredLocation);
	public List<JobSeekerRegistrationModel> findByIndustryId(IndustriesModel industryId);
	public List<JobSeekerRegistrationModel> findByRoleId(RoleModel roleId);
	public List<JobSeekerRegistrationModel> findByNoticePeriod(NoticePeriodListModel noticePeriodId);
	public List<JobSeekerRegistrationModel> findByEducation(QualificationListModel qualificationId);
	@Query("select j from jobseeker_registration j where j.keySkills=:keySkills and j.location=:city and j.preferredLocation=:preferredLocation and j.education=:qualification and j.industryId=:industryId and j.roleId=:roleId and j.noticePeriod=:noticePeriodId")
	public List<JobSeekerRegistrationModel> findBySearch(@Param ("keySkills")String keySkills,@Param("city")LocationsFormsModel location,@Param("preferredLocation")String preferredLocation,@Param("qualification")QualificationListModel education,@Param("industryId")IndustriesModel industryId,@Param("roleId")RoleModel roleId,@Param("noticePeriodId")NoticePeriodListModel noticePeriod);
}
