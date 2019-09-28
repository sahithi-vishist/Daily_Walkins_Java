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

import com.example.demo.model.PanelDetailsModel;
import com.example.demo.service.PanelDetailsService;


@RestController
@CrossOrigin
public class PanelDetailsController {
	
	@Autowired
	PanelDetailsService panelDetailsService;
	
	@GetMapping("/getpaneldetails")
	public ResponseEntity<List<PanelDetailsModel>> getpaneldetails() {
		List <PanelDetailsModel> list=panelDetailsService.getpaneldetails();
		return ResponseEntity.ok().body(list);
	}
	

	@PostMapping("/postpaneldetails")
	public ResponseEntity<PanelDetailsModel> savepaneldetails(@RequestBody PanelDetailsModel panelDetailsModel) {
		panelDetailsModel=panelDetailsService.savepaneldetails(panelDetailsModel);
		return ResponseEntity.ok().body(panelDetailsModel);
	}

	@PutMapping("/updatepaneldetails")
	public ResponseEntity<PanelDetailsModel> updatepaneldetails(@RequestBody PanelDetailsModel panelDetailsModel) {
		panelDetailsModel = panelDetailsService.updatepaneldetails(panelDetailsModel);
		return ResponseEntity.ok().body(panelDetailsModel);
	}
	@GetMapping("/getpanel")
	public ResponseEntity<PanelDetailsModel> getdetails(@RequestParam(name="Id") Integer Id) {
		PanelDetailsModel panelDetailsModel = panelDetailsService.getById(Id);
		return ResponseEntity.ok().body(panelDetailsModel);
	}
	@DeleteMapping("/deletepaneldetails")
	public ResponseEntity<String> deletepaneldetails(@RequestParam(name="Id") Integer Id) {
		panelDetailsService.deletepaneldetails(Id);
		return ResponseEntity.ok().body("panelDetailsModel deleted");
	}

}



