package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LocationWithLatLongModel;
import com.example.demo.model.LoginDetailsModel;
import com.example.demo.service.LoginDetailsService;

@RestController
@CrossOrigin
public class LoginDetailsController {
	@Autowired
	LoginDetailsService loginDetailsService;
	@GetMapping("/getbyrole")
	public ResponseEntity<List<LoginDetailsModel>> getDetailsByRole(@RequestParam(name="role")int role) {
		List <LoginDetailsModel> list=loginDetailsService.getByRole(role);
		return ResponseEntity.ok().body(list);
	}
	

	@PostMapping("/postlogindetails")
	public ResponseEntity<LoginDetailsModel>savelatlong(@RequestBody LoginDetailsModel loginDetailsModel) {
		loginDetailsModel=loginDetailsService.saveLoginData(loginDetailsModel);
		return ResponseEntity.ok().body(loginDetailsModel);
	}

}
