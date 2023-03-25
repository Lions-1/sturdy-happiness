package com.pfe.conference.repositories;

import com.pfe.conference.entities.ImportantDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImportantDatesRepository extends JpaRepository<ImportantDates, Long> {
}
