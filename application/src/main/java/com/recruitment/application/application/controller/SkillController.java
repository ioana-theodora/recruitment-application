package com.recruitment.application.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
		model.addAttribute("items", repository.findAll(new Sort(Sort.Direction.ASC, "resourceId")));
		return "skill/list";
	}
	
	@GetMapping("/skillnew")
	public String createForm(Skill skill) {
		return "skill/new";
	}
	
	@PostMapping("/skill")
	public String createSubmit(@Validated @ModelAttribute("skill") Skill skill, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            return "skill/new";
        }
		repository.save(skill);
		return "redirect:/skill";
	}
	
	@GetMapping("/skill/{id}")
	public String itemForm(@PathVariable("id") Long id,Model model) {
		model.addAttribute("skill", repository.findOne(id));
		return "skill/update";
	}

	@PostMapping("/skill/{id}")
	public String updateSubmit(@PathVariable("id") Long id,@ModelAttribute Skill skill,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            return "skill/update";
        }
		skill.setResourceId(id);
		repository.save(skill);
		return "redirect:/skill";
	}
	
	@DeleteMapping("/skill/{id}")
	public String delete(@PathVariable("id") Long id) {
		repository.delete(id);
		return "redirect:/skill";
	}

}
