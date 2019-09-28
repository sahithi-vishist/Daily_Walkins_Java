//package com.example.demo.controller;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.model.BGCModel;
//import com.example.demo.model.ChatStatusModel;
//import com.example.demo.model.CitiesModel;
//import com.example.demo.model.CompanyNameModel;
//import com.example.demo.model.CoordinatorDetailsModel;
//import com.example.demo.model.CreateDriveModel;
//import com.example.demo.model.DriveProfilesModel;
//import com.example.demo.model.EmployeeLoginDetailsModel;
//import com.example.demo.model.EmployeesModel;
//import com.example.demo.model.ExperienceModel;
//import com.example.demo.model.FacilityLoginModel;
//import com.example.demo.model.IndustriesModel;
//import com.example.demo.model.InterviewPanelDetailsModel;
//import com.example.demo.model.JsAppliedJobsModel;
//import com.example.demo.model.LocalitiesModel;
//import com.example.demo.model.LocationsFormsModel;
//import com.example.demo.model.NoticePeriodListModel;
////import com.example.demo.model.PostJobsModel;
//import com.example.demo.model.Qualifications_listModel;
//import com.example.demo.model.RecruiterLoginDetailsModel;
//import com.example.demo.model.RecruiterPrivacySettingsModel;
//import com.example.demo.model.RecruiterRegistrationModel;
//import com.example.demo.model.RoleModel;
//import com.example.demo.model.SalaryModel;
//import com.example.demo.model.SentSmsDetailsModel;
//import com.example.demo.model.TimeSlotsModel;
//import com.example.demo.model.VoiceToTextModel;
//import com.example.demo.service.BGCService;
//import com.example.demo.service.ChatStatusService;
//import com.example.demo.service.CitiesService;
//import com.example.demo.service.CompanyNameService;
//import com.example.demo.service.CoordinatorDetailsService;
//import com.example.demo.service.CreateDriveService;
//import com.example.demo.service.DriveProfilesService;
//import com.example.demo.service.EmployeeLoginDetailsService;
//import com.example.demo.service.EmployeesService;
//import com.example.demo.service.ExperienceService;
//import com.example.demo.service.FacilityLoginService;
//import com.example.demo.service.IndustriesService;
//import com.example.demo.service.InterviewPanelDetailsService;
//import com.example.demo.service.JsAppliedJobsService;
//import com.example.demo.service.LocalitiesService;
//import com.example.demo.service.LocationsFormsService;
//import com.example.demo.service.NoticePeriodListService;
////import com.example.demo.service.PostJobsService;
//import com.example.demo.service.Qualifications_listService;
//import com.example.demo.service.RecruiterLoginDetailsService;
//import com.example.demo.service.RecruiterPrivacySettingsService;
//import com.example.demo.service.RecruiterRegistrationService;
//import com.example.demo.service.RoleService;
//import com.example.demo.service.SalaryService;
//import com.example.demo.service.SentSmsDetailsService;
//import com.example.demo.service.TimeSlotsService;
//import com.example.demo.service.VoiceToTextService;
//
//@RestController
//public class Controller {
//
//
//	@Autowired
//	BGCService bgcService;
//	@Autowired
//	ChatStatusService chatStatusService;
//	@Autowired
//	CitiesService  citiesService;
//	@Autowired(required=true)
//	CompanyNameService  companyNameService;
//	@Autowired
//	EmployeesService employeesService;
//	@Autowired
//	ExperienceService experienceService;
//	@Autowired
//	RoleService roleService;
//	@Autowired
//	VoiceToTextService voiceToTextService;
//	@Autowired
//	TimeSlotsService timeSlotsService;
//	@Autowired
//	SentSmsDetailsService sentSmsDetailsService;
//	@Autowired
//	SalaryService salaryService;
//	@Autowired
//	RecruiterRegistrationService recruiterRegistrationService;
//	@Autowired(required=true)
//	RecruiterPrivacySettingsService  recruiterPrivacySettingsService;
//	@Autowired
//	JsAppliedJobsService jsAppliedJobsService;
//	@Autowired(required=true)
//	RecruiterLoginDetailsService  recruiterLoginDetailsService;
//	@Autowired
//	Qualifications_listService qualifications_listService;
////	@Autowired
////	PostJobsService postJobsService;
//	@Autowired
//	NoticePeriodListService noticePeriodListService;
//	@Autowired
//	LocationsFormsService locationsFormsService;
//	@Autowired
//	LocalitiesService localitiesService;
//	@Autowired
//	InterviewPanelDetailsService interviewPanelDetailsService;
//
//	@Autowired
//	FacilityLoginService facilityLoginService;
//
//	@Autowired
//	IndustriesService industriesService;
//
//	@Autowired
//	EmployeeLoginDetailsService employeeLoginDetailsService;
//
//	@Autowired
//	CoordinatorDetailsService coordinatorDetailsService;
//
//	@Autowired
//	CreateDriveService createDriveService;
//
//	@Autowired
//	DriveProfilesService driveProfilesService;
//	
//	@PostMapping("/postbgc")
//	public BGCModel postbgc(@RequestBody BGCModel bgcModel) {
//		return bgcService.savebgc(bgcModel);
//	}
//	@GetMapping("/getbgc")
//	public List<BGCModel> getbgc()
//	{
//		return bgcService.getBgc();
//	}
//	@PostMapping("/postchat")
//	public ChatStatusModel postChat(@RequestBody ChatStatusModel chatStatusModel)
//	{
//	return chatStatusService.saveChat(chatStatusModel);
//	
//	}
//
//	@GetMapping("/getchat")
//	public List<ChatStatusModel> getChat()
//	{
//	return chatStatusService.getChat();	
//	}
//	@GetMapping("/getByIdbgc")
//	public BGCModel getByIdBgc(Integer id)
//	{
//		return bgcService.getByIdBgc(id);
//	}
//
//	@PostMapping("/cities")
//	public CitiesModel Test(@RequestBody CitiesModel citiesModel)
//	{
//	System.out.println(citiesModel.toString());
//	return citiesService.insertRec(citiesModel);
//	}
//	@PostMapping("/companyname")
//	public CompanyNameModel Test(@RequestBody CompanyNameModel companyNameModel)
//	{
//		System.out.println(companyNameModel.toString());
//		return companyNameService.insertRec(companyNameModel);
//	}
//	@GetMapping("/getCoordinatorDetails")
//	public List<CoordinatorDetailsModel> getAll()
//	{
//		return coordinatorDetailsService.getData();
//	}
//	
//	@PostMapping("/saveCoordinatorDetails")
//	public CoordinatorDetailsModel saveAll(@RequestBody CoordinatorDetailsModel coordinatorDetailsModel)
//	{
//		System.out.println(coordinatorDetailsModel.toString());
//		return coordinatorDetailsService.save(coordinatorDetailsModel);
//	}
//
//	@DeleteMapping("/deleteCoordinatorDetails")
//	void deleteByIdCo(@RequestParam int coordinatorId) {
//		System.out.println("called");
//		 coordinatorDetailsService.deleteCo(coordinatorId);
//	}
//	
//	@GetMapping("/getByidCo")
//	public CoordinatorDetailsModel getByIdCo(@RequestParam Integer id) {
//		return coordinatorDetailsService.getByIdCo(id);
//	}
//	
//	@PutMapping("/putCo")
//	public CoordinatorDetailsModel updateCo(@RequestBody CoordinatorDetailsModel coordinatorDetailsModel)
//	{
//		return coordinatorDetailsService.updateCo(coordinatorDetailsModel);
//	}
//	@PostMapping("/postdrive")
//	public CreateDriveModel postdrive(@RequestBody CreateDriveModel createDriveModel)
//	{
//		return createDriveService.postdrive(createDriveModel);
//	}
//	
//	@GetMapping("/getdrive")
//	public List<CreateDriveModel> getdrive()
//	{
//		return createDriveService.getdrive();
//	}
//	
//	@GetMapping("/getByIddrive")
//	public CreateDriveModel getByIddrive(Integer id)
//	{
//		return createDriveService.getById(id);
//	}
//	@GetMapping("/getdriveprofiles")
//	public List<DriveProfilesModel> getdriveprofiles(){
//		return driveProfilesService.getDriveProfiles();
//	}
//
//	@PostMapping("/postdriveprofiles")
//	public DriveProfilesModel postdriveprofiles(@RequestBody DriveProfilesModel driveProfilesModel )
//	{
//		return driveProfilesService.postDriveProfiles(driveProfilesModel);
//	}
//	
//	@GetMapping("getByiddrive")
//	public DriveProfilesModel getByIdDriveProfiles(Integer id) {
//		return driveProfilesService.getByIdDriveProfiles(id);
//	}
//	@PostMapping("/saveemployeeLoginDetails")
//	public EmployeeLoginDetailsModel saveemployeeLoginDetails(@RequestBody EmployeeLoginDetailsModel employeeLoginDetailsModel) {
//		return employeeLoginDetailsService.saveUser(employeeLoginDetailsModel);
//	
//	}
//	
//	@GetMapping("/getemployeeLoginDetails")
//	public List<EmployeeLoginDetailsModel> getemployeeLoginDetails() {
//		
//		return employeeLoginDetailsService.getData();
//	
//		
//	}
//	@PostMapping("/saveEmployee")
//	public EmployeesModel saveEmployee(@RequestBody EmployeesModel employeesModel) {
//		return employeesService.saveE(employeesModel);
//	
//	}
//	
//	@GetMapping("/getEmployee")
//	public List<EmployeesModel> getEmployee() {
//		
//		return employeesService.getE();
//	
//		
//	}
//	@PostMapping("/postexperience")
//	public ExperienceModel postExp(@RequestBody ExperienceModel experienceModel)
//	{
//		return experienceService.saveExp(experienceModel);
//	}
//	@GetMapping("/getexperience")
//	public List<ExperienceModel> getAllExp()
//	{
//		return experienceService.getExp();
//	}
//
//	@PostMapping("/postFacility")
//	public FacilityLoginModel saveFacility(@RequestBody FacilityLoginModel facilityLoginModel) {
//		return facilityLoginService.saveFacility(facilityLoginModel);
//	}
//	
//	@GetMapping("/getFacility")
//	public List<FacilityLoginModel> getFacility() {
//		
//		return facilityLoginService.getFacility();
//		}
//	
//	@PostMapping("/loginCheck")
//	public ResponseEntity<Integer> getRecruiter(@RequestBody FacilityLoginModel facilityLoginModel) {
//		int res= facilityLoginService.getFacility(facilityLoginModel.getEmail(),facilityLoginModel.getPassword());
//		return ResponseEntity.ok().body(res);
//	}
//	@PostMapping("postIndustries")
//	public IndustriesModel saveIndus(@RequestBody IndustriesModel insIndustriesModel) {
//		return industriesService.saveIndustries(insIndustriesModel);
//	}
//	
//	@GetMapping("/getIndustries")
//	public List<IndustriesModel> getIndus(){
//		return industriesService.getIndustries();
//	}
//	@PostMapping ("/postInterview")
//	public InterviewPanelDetailsModel postInterview(@RequestBody InterviewPanelDetailsModel interviewPanelDetailsModel)
//	{
//		return interviewPanelDetailsService.saveInterview(interviewPanelDetailsModel);
//	}
//
//	@GetMapping ("/postInterview")
//	public List<InterviewPanelDetailsModel> getInterview()
//	{
//		return interviewPanelDetailsService.getInterview();
//	}
//	@PostMapping("/postjsa")
//	public JsAppliedJobsModel postjsa(@RequestBody JsAppliedJobsModel jsAppliedJobsModel) {
//	return jsAppliedJobsService.postjobs(jsAppliedJobsModel);
//	}
//	@PutMapping("/putjsa")
//	public JsAppliedJobsModel putjsa(JsAppliedJobsModel jsAppliedJobsModel) {
//	return jsAppliedJobsService.updatejobs(jsAppliedJobsModel);
//	}
//	
//	@GetMapping("/getjsa")
//	public List<JsAppliedJobsModel> getjsa() {
//	return jsAppliedJobsService.getjobs();
//	}
//	@GetMapping("/getbyidjsa")
//	public JsAppliedJobsModel getByIdjsa(Integer id) {
//	return jsAppliedJobsService.getById(id);
//	}
//	@PostMapping("/localities")
//	public LocalitiesModel saveH(@RequestBody LocalitiesModel localitiesModel) {
//		return localitiesService.saveL(localitiesModel);
//	
//	}
//	
//	@GetMapping("/localities1")
//	public List<LocalitiesModel> getH() {
//		
//		return localitiesService.getL();
//	}
//
//
//	@PostMapping("/locations")
//	public LocationsFormsModel saveI(@RequestBody LocationsFormsModel locationsFormsModel) {
//		return locationsFormsService.saveLl(locationsFormsModel);
//	
//	}
//	
//	@GetMapping("/locations1")
//	public List<LocationsFormsModel> getI() {
//		
//		return locationsFormsService.getLl();
//	}
//	@PostMapping("/postNotice")
//	public NoticePeriodListModel postNotice(@RequestBody NoticePeriodListModel noticePeriodListModel)
//	{
//	return noticePeriodListService.saveNotice(noticePeriodListModel);
//	}
//
//	@GetMapping("/postNotice")
//	public List<NoticePeriodListModel> getNotice()
//	{
//	return noticePeriodListService.getAllNotice();
//	}
////	@GetMapping("/getjobs")
////	public List<PostJobsModel> getjobs(PostJobsModel postJobsModel){
////		return postJobsService.getjobs();
////		
////	}
////
////	@PostMapping("/postjobs")
////	public PostJobsModel postjobs(@RequestBody PostJobsModel postJobsModel) {
////		return postJobsService.postjobs(postJobsModel);
////	}
////	
//	@PostMapping("/Qualification")
//	public Qualifications_listModel saveG(@RequestBody Qualifications_listModel qualifications_listModel) {
//		return qualifications_listService.saveQ(qualifications_listModel);
//	
//	}
//	
//	@GetMapping("/Qualification1")
//	public List<Qualifications_listModel> getG() {
//		
//		return qualifications_listService.getQ();
//	
//		
//	}
//	@PostMapping("/RecruiterLoginDetails")
//	public RecruiterLoginDetailsModel Test(@RequestBody RecruiterLoginDetailsModel recruiterLoginDetailsModel)
//	{
//		System.out.println(recruiterLoginDetailsModel.toString());
//		return recruiterLoginDetailsService.insertRec(recruiterLoginDetailsModel);
//	}
//	
//
//@PostMapping("/postRecruiterPrivacySettings")
//public RecruiterPrivacySettingsModel postRecruiterPrivacySettings(@RequestBody RecruiterPrivacySettingsModel recruiterPrivacySettingsModel)
//{
//	return recruiterPrivacySettingsService.insertRec(recruiterPrivacySettingsModel);
//}
//
//	@PostMapping("/saveRecruiterRegistration")
//	public RecruiterRegistrationModel saveAll(@RequestBody RecruiterRegistrationModel recruiterRegistrationModel) {
//		return recruiterRegistrationService.saveAll(recruiterRegistrationModel);
//	}
//	@GetMapping("/getRecruiterRegistration")
//	public List<RecruiterRegistrationModel> getall()
//	{
//		return recruiterRegistrationService.getAll();
//	}
//	
//	@PutMapping("/putRecruiterRegistration")
//	public RecruiterRegistrationModel putAll( RecruiterRegistrationModel recruiterRegistrationModel) {
//		return recruiterRegistrationService.update(recruiterRegistrationModel);
//	}
//	@PostMapping("/postrole")
//	public RoleModel postrole(@RequestBody RoleModel roleModel) {
//		return roleService.insertRole(roleModel);
//	}
//
//	@GetMapping("/getrole")
//	private RoleModel getrole(@RequestParam(name="id") Integer id) {
//		return roleService.getById(id);
//	}
//@PostMapping("/Salary")
//	public SalaryModel saveF(@RequestBody SalaryModel salaryModel) {
//		return salaryService.saveSs(salaryModel);
//	
//	}
//	
//	@GetMapping("/Salary1")
//	public List<SalaryModel> getF() {
//		
//		return salaryService.getSs();
//	
//		
//	}
//	@PostMapping("/Sent")
//	public SentSmsDetailsModel saveE(@RequestBody SentSmsDetailsModel sentSmsDetailsModel) {
//		return sentSmsDetailsService.saveS(sentSmsDetailsModel);
//	
//	}
//	
//	@GetMapping("/Sent1")
//	public List<SentSmsDetailsModel> getE() {
//		
//		return sentSmsDetailsService.getS();
//	
//		
//	}
//@PostMapping("/Time")
//	public TimeSlotsModel saveD(@RequestBody TimeSlotsModel timeSlotsModel) {
//		return timeSlotsService.saveT(timeSlotsModel);
//	
//	}
//	
//	@GetMapping("/Time1")
//	public List<TimeSlotsModel> getD() {
//		
//		return timeSlotsService.getT();
//	
//		
//	}
//	@PostMapping("/test12345")
//	public VoiceToTextModel saveB(@RequestBody VoiceToTextModel voiceToTextModel) {
//		return voiceToTextService.saveV(voiceToTextModel);
//	
//	}
//	
//	@GetMapping("/test123456")
//	public List<VoiceToTextModel> getB() {
//		
//		return voiceToTextService.getV();
//	
//		
//	}
//
//
//	
//}
