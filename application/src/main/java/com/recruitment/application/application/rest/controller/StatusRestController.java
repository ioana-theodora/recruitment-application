package com.recruitment.application.application.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recruitment.application.application.domain.Status;
import com.recruitment.application.application.repository.StatusRepository;

@RestController
public class StatusRestController {

	private StatusRepository repository;
	
	@Autowired
	public StatusRestController(StatusRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/rest/status")
	public Page<Status> findAll(Pageable page){
		return repository.findAll(page);
	}
	
	@GetMapping("/rest/status/{id}")
	public Status findOne(@PathVariable("id") Long id){
		return repository.findOne(id);
	}
	
	@DeleteMapping("/rest/status/{id}")
	public void deleteOne(@PathVariable("id") Long id){
		repository.delete(id);
	}
	
	@PostMapping("/rest/status")
	public void addOne(@Validated @RequestBody Status status){
		repository.save(status);
	}
	
	@PostMapping("/rest/status/{id}")
	public void updateOne(@PathVariable("id") Long id,@Validated @RequestBody Status status){
		status.setResourceId(id);
		repository.save(status);
	}
	
}
