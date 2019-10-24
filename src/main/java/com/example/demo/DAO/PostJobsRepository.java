package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ExperienceModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.LocationWithLatLongModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;

public interface PostJobsRepository extends JpaRepository<PostJobsModel, Integer> {

	public List<PostJobsModel> findByKeySkillsContains(String keySkills);
 
	//public List<PostJobsModel> findByKeySkills(String keySkills);
	public List<PostJobsModel> findByEmail(String email);
	public List<PostJobsModel> findByExpMin(ExperienceModel expMin);
	public List<PostJobsModel> findByExpMax(ExperienceModel expMax);
	public List<PostJobsModel> findByLocation(String location);
	public List<PostJobsModel> findByIndustryId(IndustriesModel industryId);
	public List<PostJobsModel> findByRoleId(RoleModel roleId);
	public List<PostJobsModel> findByJobTypeId(JobTypeModel jobTypeId);
	public List<PostJobsModel> findByQualification(String qualification);
	
	@Query("select j from post_jobs j where j.keySkills=:keySkills and j.location=:location and j.qualification=:education and j.expMin=:expMin and j.expMax=:expMax and j.industryId=:industryId and j.roleId=:roleId and j.jobTypeId=:jobTypeId")
	public List<PostJobsModel> findBySearch(@Param ("keySkills")String keySkills ,@Param("location")String location,
			@Param("education")String qualification,@Param("expMin")ExperienceModel expMin,@Param("expMax")ExperienceModel expMax,
			@Param("industryId")IndustriesModel industryId,@Param("roleId")RoleModel roleId,@Param("jobTypeId")JobTypeModel jobTypeId);
	
}
