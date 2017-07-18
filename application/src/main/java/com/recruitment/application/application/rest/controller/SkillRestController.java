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

import com.recruitment.application.application.domain.Skill;
import com.recruitment.application.application.repository.SkillRepository;

@RestController
public class SkillRestController {

	private SkillRepository repository;
	
	@Autowired
	public SkillRestController(SkillRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/rest/skill")
	public Page<Skill> findAll(Pageable page){
		return repository.findAll(page);
	}
	
	@GetMapping("/rest/skill/{id}")
	public Skill findOne(@PathVariable("id") Long id){
		return repository.findOne(id);
	}
	
	@DeleteMapping("/rest/skill/{id}")
	public void deleteOne(@PathVariable("id") Long id){
		repository.delete(id);
	}
	
	@PostMapping("/rest/skill")
	public void addOne(@Validated @RequestBody Skill skill){
		repository.save(skill);
	}
	
	@PostMapping("/rest/skill/{id}")
	public void updateOne(@PathVariable("id") Long id,@Validated @RequestBody Skill skill){
		skill.setResourceId(id);
		repository.save(skill);
	}
	
}
