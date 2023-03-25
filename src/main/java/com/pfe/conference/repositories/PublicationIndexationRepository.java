package com.pfe.conference.repositories;

import com.pfe.conference.entities.PublicationIndexation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublicationIndexationRepository extends JpaRepository<PublicationIndexation, Long> {
}
