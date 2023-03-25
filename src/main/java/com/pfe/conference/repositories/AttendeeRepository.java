package com.pfe.conference.repositories;
import com.pfe.conference.entities.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
