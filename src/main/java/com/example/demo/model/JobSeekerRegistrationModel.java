package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity(name="jobseeker_registration")
@Data
public class JobSeekerRegistrationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "jobseekerid")
	private int jobSeekerId;
	
	@Column(name= "firstname")
	private String firstName;
	
	@Column(name= "lastname")
	private String lastName;
	
	@Column(name= "password")
	private String password;
	
	@Column(name= "confirmpassword")
	private String confirmPassword;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "contactno")
	private String contactNo;
	
	@Column(name= "contactnolandline")
	private String contactNoLandline;
	
	@Column(name= "industry")
	private String industry;
	
	@Column(name= "experience")
	private float experience;
	
	@Column(name= "currentctc")
	private float currentCTC;
	
	@Column(name= "expectedctc")
	private float expectedCTC;
	
	@OneToOne
	@JoinColumn(name= "education")
	private QualificationListModel education;
	
	@Column(name= "keyskills")
	private String keySkills;
	
	@Column(name= "standardkeyskills")
	private String standardKeySkills;
	
	@OneToOne
	@JoinColumn(name= "location")
	private LocationWithLatLongModel location;
	
	@Column(name= "locality")
	private String locality;
	
	@Column(name= "updateresume")
	private String updateResume;
	
	@Column(name= "gender")
	private String gender;
	
	@Column(name= "institute")
	private String institute;
	
	@Column(name= "yearofpass")
	private String yearOfPass;
	
	@Column(name= "role")
	private String role;
	
	@Column(name= "resumeheadline")
	private String resumeHeadLine;
	
	@Column(name= "updatedon")
	private Date updatedOn;
	
	
	@Column(name= "resume")
	private String resume;
	
	@Column(name= "textresume")
	private String textResume;
	
	@Column(name= "username")
	private String userName;
	
	@Column(name= "status")
	private String status;
	
	@Column(name= "photo")
	private String photo;
	
	@Column(name= "currentdesignation")
	private String currentDesignation;
	
	@Column(name= "currentcompany")
	private String currentCompany;
	
	@Column(name= "standardcurrentcompany")
	private String standardCurrentCompany;
	
	@Column(name= "previouscompany")
	private String previousCompany;
	
	@Column(name= "previousdesignation")
	private String previousDesignation;
	
	@Column(name= "preferredlocation")
	private String preferredLocation;
	
	@Column(name= "standardpreviouscompany")
	private String standardPreviousCompany;
	
	@OneToOne
	@JoinColumn(name= "noticeperiod")
	private NoticePeriodListModel noticePeriod;
	
	@Column(name= "emailverified")
	private boolean emailVerified;
	
	@Column(name= "visiblesettings")
	private boolean visibleSettings;
	
	@Column(name= "jsid")
	private String jsId;
	
	@Column(name= "isonline")
	private boolean isOnline;

	@Column(name= "viewedcount")
	private int viewedCount;
	
	@Column(name= "downloadedcount")
	private int downloadedCount;
	
	@Column(name= "candidatesactiveinlast")
	private String candidatesActiveInLast;
	
	@OneToOne
	@JoinColumn(name= "industryid")
	private IndustriesModel industryId;
	
	@OneToOne
	@JoinColumn(name= "roleid")
	private RoleModel roleId;
	
	@OneToOne
	@JoinColumn(name= "jobtypeid")
	private JobTypeModel jobTypeId;
	
	@Column(name= "jobtype")
	private String jobType;
	
	@Column(name= "createdby")
	private String createdBy;
	
	@Column(name= "similarcount")
	private int similarCount;
	
	@Column(name= "matchedpercent")
	private String matchedPercent;
	
	@Column(name= "relevantscore")
	private int relevantScore;
	
	@Column(name= "directregistration")
	private boolean directRegistration;
	
	@Column(name= "profileaccessspecifier")
	private String profileAccessSpecifier;
	
	@Column(name= "sharedcompanieslist")
	private String sharedCompaniesList;
	
	@Column(name= "photostring")
	private String photoString;
	
	@Column(name= "languagesknown")
	private String languagesKnown;
	
	@Column(name= "deviceid")
	private String deviceId;
	
	@Column(name= "profilename")
	private String profileName;
	
	@Column(name= "ismobileonline")
	private boolean isMobileOnline;
	
	@Column(name= "dateofbirth")
	private Date dateOfBirth;
	
	@Column(name= "lastlogin")
	private Date lastLogin;
	
	@Column(name= "lastactive")
	private Date lastActive;
	
	@Column(name= "uploadedby")
	private String uploadedBy;
	
	@Column(name= "uploadeddate")
	private Date uploadedDate;
	
	@Column(name= "onnoticeperiod")
	private String onNoticePeriod;
	
	@Column(name= "lastupdatednoticeperiod")
	private String lastUpdatedNoticePeriod;
	
	@Column(name= "lastworkingday")
	private Date lastWorkingDay;
	
	@Column(name= "resumefile")
	private String resumeFile;

	
}
