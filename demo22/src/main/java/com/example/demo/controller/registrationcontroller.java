package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@PostMapping("/addall")
	public Iterable<registration> addall(@RequestBody List<registration> reg) {
		return service.addall(reg);
	}
	
	@GetMapping("/fetchall")
	public List<registration> fetchall() {
		return service.fetchall();
	}
	
	@GetMapping("/fetchbyid/{id}")
	public Optional<registration> fetchbyid(@PathVariable int id) {
		return service.fetchbyid(id);
	}
	@DeleteMapping("/delbyid/{id}")
	public String delbyid(@PathVariable int id) {
		return service.delbyid(id);
	}
	@PutMapping("/update")
	public registration updating(@RequestBody registration reg) {
		return service.update(reg);
	}

}
