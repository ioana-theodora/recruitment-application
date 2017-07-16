package com.recruitment.application.application.repository;


import com.recruitment.application.application.constants.PathConstants;
import com.recruitment.application.application.domain.Skill;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = PathConstants.skillPath, path = PathConstants.skillPath)
public interface SkillRepository extends PagingAndSortingRepository<Skill, Long> {
}
