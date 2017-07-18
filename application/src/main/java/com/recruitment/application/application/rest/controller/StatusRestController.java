package com.recruitment.application.application.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
