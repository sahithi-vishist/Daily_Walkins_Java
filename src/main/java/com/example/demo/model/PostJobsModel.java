package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity(name="post_jobs")
@Data
public class PostJobsModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jobno")
	private int jobNo ;
	
	@Column(name="companyemailid")
	private String companyEmailId ;
	
	@Lob
	@Column(name="companylogo")
	private byte[] companyLogo;
	
	@Column(name="jobreference")
	private String jobReference ; 
	
	@Column(name="jobtitle")
	private String jobTitle ;
	
	@Column(name="jobsummary")
	private String jobSummary ;
	
	@Column(name="jobdescription")
	private String jobDescription ;
	
	@Column(name="keyskills")
	private String keySkills ;
	
	@Column(name="standardkeyskills")
	private String standardKeySkills ;
	
	@OneToOne
	@JoinColumn(name="minsal")
	private SalaryModel minSal ;
	
	@OneToOne
	@JoinColumn(name="maxsal")
	private SalaryModel maxSal ;
	

	@Column(name="companyprofile")
	private String companyProfile ;
	
	@Column(name="industry")
	private String industry ;
	
	@OneToOne
	@JoinColumn(name="expmin")
	private ExperienceModel expMin ;
	
	@OneToOne
	@JoinColumn(name="expmax")
	private ExperienceModel expMax ;
	
	@Column(name="location")
	private String location ;
	
	@OneToOne
	@JoinColumn(name="qualification")
	private QualificationListModel qualification ;
	
	@Column(name="email")
	private String email ;
	
	@Column(name="phone")
	private String phone ;
	
	@Column(name="contactno_landline")
	private String contactNoLandline ;
	
	@Column(name="postdate")
	private Date postDate ; 
	
	@Column(name="role")
	private String role;
	
	@Column(name="address")
	private String address ;
	
	@Column(name="companyname")
	private String companyName ;
	
	@Column(name="standardcurrentcompany")
	private String standardCurrentCompany ;
	
	@Column(name="contactperson")
	private String contactPerson ;
	
	@Column(name="salary")
	private String salary ;
	
	@OneToOne
	@JoinColumn(name="locid")
	private LocationWithLatLongModel locId ;
	
	@OneToOne
	@JoinColumn(name="industryid")
	private IndustriesModel industryId ;
	
	@OneToOne
	@JoinColumn(name="facilityid")
	private FacilityRegistrationModel facilityId ;
	
	@OneToOne
	@JoinColumn(name="roleid")
	private RoleModel roleId ;
	
	@OneToOne
	@JoinColumn(name="jobtypeid")
	private JobTypeModel jobTypeId ;
	
	@Column(name="pbid")
	private int pbId ;
	
	@Column(name="postedtype")
	private String postedType ;
	
	@Column(name="designation")
	private String designation ;
	
	@Column(name="viewscount")
	private int viewsCount ;
	
	@Column(name="appliedcount")
	private int appliedCount ;
	
	@Column(name="endclient")
	private String endClient ;
	
	@Column(name="clientemailid")
	private String clientEmailId ;
	
	@Column(name="matchedscore")
	private String matchedScore ;
	
	@OneToOne
	@JoinColumn(name="noticeperiod")
	private NoticePeriodListModel noticePeriod ;
	
	@Column(name="walkindate")
	private Date walkinDate ; 
	
	@Column(name="searchquery")
	private String searchQuery ; 
	
	@Column(name="jobpositions")
	private int jobPositions ;
	
	@Column(name="logostring")
	private String logoString ; 
	
	@Column(name="recruitercompanyname")
	private String recruiterCompanyname ;
	
	@Column(name="matchedprofilesquery")
	private String matchedProfilesQuery ;
	
	@Column(name="similarjobsquery")
	private String similarJobsQuery ;
	
	@Column(name="similarjobscount")
	private int similarJobsCount ;
	
	@Column(name="isrecruiteronline")
	private boolean isRecruiterOnline ;
	
	@Column(name="matchedprofilescount")
	private int matchedProfilesCount ;
	
	@Column(name="documents")
	private String	documents ;
	
	@Column(name="rolesresponsibilties")
	private String rolesResponsibilties ;
	
	@Column(name="questionier")
	private String questionier ;
	
	@Column(name="locality")
	private String locality ;
	
	@Column(name="ratedskills")
	private String ratedSkills ;
	
	@Column(name="postedby")
	private String postedBy ;
	
	@OneToOne
	@JoinColumn(name="walkintimeslots")
	private TimeSlotsModel walkinTimeSlots ;
	
	@Column(name="venuedetails")
	private String venueDetails;
	
	@Column(name="requirepanel")
	private boolean requirePanel ;
	
	@Column(name="spaceneeded")
	private boolean spaceNeeded ;
	
	@Column(name="resourceneeded")
	private boolean resourceNeeded;
	
	@Column(name="tparrangement")
	private boolean tpArrangement ;
	
	@Column(name="walkinlocation")
	private String walkinLocation ;
	
	@Column(name="walkinlocality")
	private String clientLocality ;


}
