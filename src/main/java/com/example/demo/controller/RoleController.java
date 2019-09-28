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

import com.example.demo.model.JobTypeModel;
import com.example.demo.model.RoleModel;
import com.example.demo.service.RoleService;

@RestController
@CrossOrigin
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@PostMapping("/postrole")
	public RoleModel postrole(@RequestBody RoleModel roleModel) {
		return roleService.insertRole(roleModel);
	}

	@GetMapping("/getrole")
	private RoleModel getrole(@RequestParam(name="id") Integer id) {
		return roleService.getById(id);
	}
	@GetMapping("/getRoles")
	public ResponseEntity<List<RoleModel>> getAllRoles(){
		List<RoleModel> listOfRoles=roleService.getAll();
		return ResponseEntity.ok().body(listOfRoles);
	}
	
}
