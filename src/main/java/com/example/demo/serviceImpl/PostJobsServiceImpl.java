package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PostJobsRepository;
import com.example.demo.model.ExperienceModel;
import com.example.demo.model.IndustriesModel;
import com.example.demo.model.JobTypeModel;
import com.example.demo.model.LocationWithLatLongModel;
import com.example.demo.model.PostJobsModel;
import com.example.demo.model.QualificationListModel;
import com.example.demo.model.RoleModel;
import com.example.demo.service.PostJobsService;

@Service
public class PostJobsServiceImpl implements PostJobsService{

	@Autowired
	PostJobsRepository postJobsRepository;
	

	@Override
	public PostJobsModel postjobs(PostJobsModel postJobsModel) {
		return postJobsRepository.save(postJobsModel);
	}


	@Override
	public List<PostJobsModel> getjobs() {
		return postJobsRepository.findAll();
	}


	@Override
	public PostJobsModel getJobById(Integer id) {
		
		return postJobsRepository.findById(id).get();
	}

	@Override
	public List<PostJobsModel> getByKeySkills(String skills) {
		List<PostJobsModel> res=postJobsRepository.findByKeySkillsContains(skills);
		return res;
	}
	@Override
	public List<PostJobsModel> getJobNo(String email) {
		List<PostJobsModel> res=postJobsRepository.findByEmail(email);
	 return res;
	}


	@Override
	public PostJobsModel updateWalkin(PostJobsModel postJobsModel) {
		
		return postJobsRepository.save(postJobsModel);
	}


	@Override
	public List<PostJobsModel> getJobsByLocation(String location) {
		List<PostJobsModel> res=postJobsRepository.findByLocation(location);
		return res;
	}


	@Override
	public List<PostJobsModel> getJobsByEducation(String education) {
		List<PostJobsModel> res=postJobsRepository.findByQualification(education);
		System.out.println(res);
		return res;
	}


	@Override
	public List<PostJobsModel> getJobsByminExp(ExperienceModel minExp) {
		List<PostJobsModel> res=postJobsRepository.findByExpMin(minExp);
				return res;
	}


	@Override
	public List<PostJobsModel> getJobsBymaxExp(ExperienceModel maxExp) {
		List<PostJobsModel> res=postJobsRepository.findByExpMax(maxExp);
		return res;
	}


	@Override
	public List<PostJobsModel> getJobsByIndustry(IndustriesModel industry) {
		List<PostJobsModel> res=postJobsRepository.findByIndustryId(industry);
		return res;
	}


	@Override
	public List<PostJobsModel> getJobsByRole(RoleModel role) {
		List<PostJobsModel> res=postJobsRepository.findByRoleId(role);
		return res;
	}


	@Override
	public List<PostJobsModel> getJobsByJobType(JobTypeModel jobType) {
		List<PostJobsModel> res=postJobsRepository.findByJobTypeId(jobType);
		return res;
	}
	@Override
	public List<PostJobsModel> getJobsBySearch(String keySkills, String location, String education,
			ExperienceModel expMin, ExperienceModel expMax, IndustriesModel industryId, RoleModel roleId,
			JobTypeModel jobTypeId) {
		
		return postJobsRepository.findBySearch(keySkills, location, education, expMin, expMax, industryId, roleId, jobTypeId);
	}	
}
