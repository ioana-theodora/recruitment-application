package com.recruitment.application.application.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.recruitment.application.application.domain.Skill;

@Repository
public interface SkillRepository extends PagingAndSortingRepository<Skill, Long> {
}
