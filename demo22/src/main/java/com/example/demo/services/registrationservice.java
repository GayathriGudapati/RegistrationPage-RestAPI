package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.registration;
import com.example.demo.repository.registrationrepository;

@Service
public class registrationservice {

	@Autowired
	registrationrepository repo;
	
	public registration addinguser(registration reg) {
		return repo.save(reg);
	}
	public Iterable<registration> addall(List<registration> reg) {
		return repo.saveAll(reg);
	}
	
	public List<registration> fetchall(){
		return (List<registration>) repo.findAll();
	}
	
	public Optional<registration> fetchbyid(int id) {
		return repo.findById(id);
	}
	
	public String delbyid(int id) {
		repo.deleteById(id);
		return "successfully deleted : "+id;
	}
	public registration update(registration reg) {
		int id=reg.getId();
		registration reg1=repo.findById(id).get();
		reg1.setName(reg.getName());
		reg1.setAge(reg.getAge());
		reg1.setGender(reg.getGender());
		return repo.save(reg1);
		}
	
}
