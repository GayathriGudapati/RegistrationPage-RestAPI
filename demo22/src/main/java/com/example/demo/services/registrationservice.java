package com.example.demo.services;

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
	public registration update(registration reg) {
		int id=reg.getId();
		registration reg1=repo.findById(id).get();
		reg1.setName(reg.getName());
		reg1.setAge(reg.getAge());
		reg1.setGender(reg.getGender());
		return repo.save(reg1);
		}
}
