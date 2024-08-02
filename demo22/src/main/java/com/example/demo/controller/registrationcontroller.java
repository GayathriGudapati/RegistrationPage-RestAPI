package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.registration;
import com.example.demo.services.registrationservice;
@RestController
@RequestMapping("/api/v1")
public class registrationcontroller {
	@Autowired
	registrationservice service;
	@PostMapping("/insertion")
	public registration addinguser(@RequestBody registration reg) {
		return service.addinguser(reg);
	}
//	
//	public list<registration> multifetch(){
//		
//	}
	@PutMapping("/update")
	public registration updating(@RequestBody registration reg) {
		return service.update(reg);
	}

}
