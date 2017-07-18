package com.recruitment.application.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.recruitment.application.application.domain.Skill;
import com.recruitment.application.application.repository.SkillRepository;

@Controller
public class SkillController {

	private SkillRepository repository;
	
	@Autowired
	public SkillController(SkillRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/skill")
	public String list(Model model) {
		model.addAttribute("items", repository.findAll());
		return "skill/list";
	}
	
	@GetMapping("/skillnew")
	public String createForm(Skill skill) {
		return "skill/new";
	}
	
	@PostMapping("/skill")
	public String createSubmit(@Valid Skill skill, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            return "skill/new";
        }
		repository.save(skill);
		return "redirect:/skill";
	}
	
	@GetMapping("/skill/{id}")
	public String itemForm(@PathVariable("id") Long id,Model model) {
		model.addAttribute("status", repository.findOne(id));
		return "skill/update";
	}

	@PutMapping("/skill/{id}")
	public String updateSubmit(@ModelAttribute Skill skill,Model model) {
		repository.save(skill);
		model.addAttribute("items", repository.findAll());
		return "skill/list";
	}
	

}
