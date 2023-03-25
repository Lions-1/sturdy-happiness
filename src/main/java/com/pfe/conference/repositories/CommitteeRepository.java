package com.pfe.conference.repositories;

import com.pfe.conference.entities.Committee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommitteeRepository extends JpaRepository<Committee, Long> {
}
