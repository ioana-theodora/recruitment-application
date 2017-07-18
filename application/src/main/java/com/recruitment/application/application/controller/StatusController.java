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

import com.recruitment.application.application.domain.Status;
import com.recruitment.application.application.repository.StatusRepository;

@Controller
public class StatusController {

	private StatusRepository repository;
	
	@Autowired
	public StatusController(StatusRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/status")
	public String list(Model model) {
		model.addAttribute("items", repository.findAll(new Sort(Sort.Direction.ASC, "resourceId")));
		return "status/list";
	}
	
	@GetMapping("/statusnew")
	public String createForm(Status status) {
		return "status/new";
	}
	
	@PostMapping("/status")
	public String createSubmit(@Validated @ModelAttribute("status") Status status, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            return "status/new";
        }
		repository.save(status);
		return "redirect:/status";
	}
	
	@GetMapping("/status/{id}")
	public String itemForm(@PathVariable("id") Long id,Model model) {
		model.addAttribute("status", repository.findOne(id));
		return "status/update";
	}

	@PostMapping("/status/{id}")
	public String updateSubmit(@PathVariable("id") Long id,@ModelAttribute Status status,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            return "status/update";
        }
		status.setResourceId(id);
		repository.save(status);
		return "redirect:/status";
	}
	
	@DeleteMapping("/status/{id}")
	public String delete(@PathVariable("id") Long id) {
		repository.delete(id);
		return "redirect:/status";
	}
	
}
