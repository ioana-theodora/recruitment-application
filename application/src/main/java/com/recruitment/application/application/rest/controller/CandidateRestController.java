package com.recruitment.application.application.rest.controller;

import com.recruitment.application.application.domain.Candidate;
import com.recruitment.application.application.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by v.burca on 7/18/2017.
 */
@RestController
public class CandidateRestController {

    private CandidateRepository repository;

    @Autowired
    public CandidateRestController(CandidateRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/rest/candidate")
    public Page<Candidate> findAll(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/rest/candidate/{id}")
    public Candidate findOne(@PathVariable("id") Long id){
        return repository.findOne(id);
    }

    @DeleteMapping("/rest/candidate/{id}")
    public void deleteOne(@PathVariable("id") Long id){
        repository.delete(id);
    }

    @PostMapping("/rest/candidate")
    public void addOne(@Validated @RequestBody Candidate candidate){
        repository.save(candidate);
    }

    @PostMapping("/rest/candidate/{id}")
    public void updateOne(@PathVariable("id") Long id,@Validated @RequestBody Candidate skill){
        skill.setResourceId(id);
        repository.save(skill);
    }
}
