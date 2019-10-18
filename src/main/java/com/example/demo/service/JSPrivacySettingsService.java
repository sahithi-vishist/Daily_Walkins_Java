package com.example.demo.service;

import java.util.List;

import com.example.demo.model.JSPrivacySettingsModel;



public interface JSPrivacySettingsService {
	
	public JSPrivacySettingsModel savejsdetails(JSPrivacySettingsModel jsprivacysettingsmodel);
	public List<JSPrivacySettingsModel> getjsdetails();
	public JSPrivacySettingsModel updatejsdetails(JSPrivacySettingsModel jsprivacysettingsmodel);
	public void deletedetails(Integer id);
	public JSPrivacySettingsModel getById(Integer id);

}
