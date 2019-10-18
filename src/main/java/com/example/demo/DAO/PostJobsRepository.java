package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ExperienceModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;

public interface PostJobsRepository extends JpaRepository<PostJobsModel, Integer> {
 
	public List<PostJobsModel> findByKeySkills(String keySkills);
	public List<PostJobsModel> findByEmail(String email);
	public List<PostJobsModel> findByExpMin(ExperienceModel expMin);
	public List<PostJobsModel> findByExpMax(ExperienceModel expMax);
	public List<PostJobsModel> findByLocation(String location);
	public List<PostJobsModel> findByIndustryId(IndustriesModel industryId);
	public List<PostJobsModel> findByRoleId(RoleModel roleId);
	public List<PostJobsModel> findByJobTypeId(JobTypeModel jobTypeId);
	public List<PostJobsModel> findByQualification(QualificationListModel qualification);
}
