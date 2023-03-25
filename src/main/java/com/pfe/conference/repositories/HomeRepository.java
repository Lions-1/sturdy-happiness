package com.pfe.conference.repositories;
import com.pfe.conference.entities.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
}
