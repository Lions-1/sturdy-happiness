package com.pfe.conference.repositories;

import com.pfe.conference.entities.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
