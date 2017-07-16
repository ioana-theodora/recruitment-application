package com.recruitment.application.application.repository;


import com.recruitment.application.application.constants.PathConstants;
import com.recruitment.application.application.domain.Status;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = PathConstants.statusPath, path = PathConstants.statusPath)
public interface StatusRepository extends PagingAndSortingRepository<Status, Long> {
}
