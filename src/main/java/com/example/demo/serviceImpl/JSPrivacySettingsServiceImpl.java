package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.JSPrivacySettingsRepository;
import com.example.demo.model.JSPrivacySettingsModel;
import com.example.demo.service.JSPrivacySettingsService;


@Service
public class JSPrivacySettingsServiceImpl implements JSPrivacySettingsService {

	
	@Autowired
	JSPrivacySettingsRepository jsprivacysettingsrepositary;

	@Override
	public JSPrivacySettingsModel savejsdetails(JSPrivacySettingsModel jsprivacysettingsmodel) {
		
		return jsprivacysettingsrepositary.save(jsprivacysettingsmodel);
	}

	@Override
	public List<JSPrivacySettingsModel> getjsdetails() {
		
		return jsprivacysettingsrepositary.findAll();
	}

	@Override
	public JSPrivacySettingsModel updatejsdetails(JSPrivacySettingsModel jsprivacysettingsmodel) {
		return jsprivacysettingsrepositary.save(jsprivacysettingsmodel);
	}

	@Override
	public void deletedetails(Integer id) {
		JSPrivacySettingsModel jsprivacysettingsmodel=jsprivacysettingsrepositary.findById(id).get();
		if(jsprivacysettingsmodel!=null)
		{
			jsprivacysettingsrepositary.delete(jsprivacysettingsmodel);
		}
		
	}

	@Override
	public JSPrivacySettingsModel getById(Integer id) {
		return jsprivacysettingsrepositary.findById(id).get();
	}
}
	
	
