package com.recruitment.application.application.repository;

import com.recruitment.application.application.domain.Candidate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by v.burca on 7/18/2017.
 */
@Repository
public interface CandidateRepository extends PagingAndSortingRepository<Candidate, Long> {
}
