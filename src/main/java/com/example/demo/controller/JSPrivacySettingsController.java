package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JSPrivacySettingsModel;
import com.example.demo.service.JSPrivacySettingsService;


@RestController
@CrossOrigin
public class JSPrivacySettingsController {
	

	@Autowired
	JSPrivacySettingsService jsprivacysettingsservice;
	
	@GetMapping("/getjsdetails")
	public ResponseEntity<List<JSPrivacySettingsModel>> getprivacysettings() {
		List <JSPrivacySettingsModel> list=jsprivacysettingsservice.getjsdetails();
		return ResponseEntity.ok().body(list);
	}
	

	@PostMapping("/postjsdetails")
	public ResponseEntity<JSPrivacySettingsModel> savepaneldetails(@RequestBody JSPrivacySettingsModel jsprivacysettingsmodel) {
		jsprivacysettingsmodel=jsprivacysettingsservice.savejsdetails(jsprivacysettingsmodel);
		return ResponseEntity.ok().body(jsprivacysettingsmodel);
	}

	@PutMapping("/updatejsdetails")
	public ResponseEntity<JSPrivacySettingsModel> updatepaneldetails(@RequestBody JSPrivacySettingsModel jsprivacysettingsmodel) {
		jsprivacysettingsmodel= jsprivacysettingsservice.updatejsdetails(jsprivacysettingsmodel);
		return ResponseEntity.ok().body(jsprivacysettingsmodel);
		
	}
	@GetMapping("/getjs")
	public ResponseEntity<JSPrivacySettingsModel> getdetails(@RequestParam(name="Id") Integer Id) {
		JSPrivacySettingsModel jsprivacysettingsmodel = jsprivacysettingsservice.getById(Id);
		return ResponseEntity.ok().body(jsprivacysettingsmodel);
		
		
	}
	@DeleteMapping("/deletejsdetails")
	public ResponseEntity<String> deletepaneldetails(@RequestParam(name="Id") Integer Id) {
		jsprivacysettingsservice.deletedetails(Id);
		return ResponseEntity.ok().body("jsprivacysettingsmodel deleted");
	}


}
