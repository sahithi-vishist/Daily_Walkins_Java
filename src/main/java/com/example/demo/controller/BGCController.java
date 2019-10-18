package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BGCModel;
import com.example.demo.service.BGCService;

@RestController
public class BGCController {
	
	@Autowired
	BGCService bgcService;
	
	@PostMapping("/postbgc")
	public BGCModel postbgc(@RequestBody BGCModel bgcModel) {
		return bgcService.savebgc(bgcModel);
	}
	@GetMapping("/getbgc")
public List<BGCModel> getbgc()
{
		return bgcService.getBgc();
}
	@GetMapping("/getByIdbgc")
	public BGCModel getByIdBgc(Integer id)
	{
		return bgcService.getByIdBgc(id);
	}

}
